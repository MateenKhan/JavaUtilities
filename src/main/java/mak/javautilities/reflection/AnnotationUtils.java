package mak.javautilities.reflection;

import org.apache.commons.lang3.ArrayUtils;
import org.springframework.util.Assert;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

@Test("as")
public class AnnotationUtils {

    public static Optional<String> getValue(Annotation[] annotations) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Assert.notEmpty(annotations, "Empty input annotations:" + annotations);
        for (Annotation annotation : annotations) {
            String[] urls = (String[]) annotation.getClass().getMethod("value").invoke(annotation);
            if (ArrayUtils.isNotEmpty(urls)) {
                return Optional.of(urls[0]);
            }
        }
       return Optional.of(null);
    }

}
