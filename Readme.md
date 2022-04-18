# Run below commands to publish a new release


`mvn install:install-file -DgroupId=mak -DartifactId=JavaUtilities -Dversion=1.0 -Dfile=JavaUtilities-1.0.jar -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=.  -DcreateChecksum=true`


`git add -A . && git commit -m "released version 1.0"`

`git push origin`


