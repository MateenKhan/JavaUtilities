package mak.javautilities.reflection;

import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;

import java.lang.reflect.InvocationTargetException;

public class ReflectionUtils {

    public static String getMethod(Object target, String filed) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return (String) target.getClass().getMethod(getterMethod(filed)).invoke(target);
    }

    private static String getterMethod(String field) {
        Assert.isTrue(StringUtils.isNotBlank(field), "Empty Input field:" + field);
        return "get" + (field.charAt(0) + "").toUpperCase() + field.substring(1);
    }
}

