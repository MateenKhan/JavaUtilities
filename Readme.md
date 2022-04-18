# Run below commands to publish a new release


`mvn install:install-file -DgroupId=mak -DartifactId=JavaUtilities -Dversion=1.0 -Dfile=JavaUtilities-1.0.jar -Dpackaging=jar -DgeneratePom=true -DlocalRepositoryPath=.  -DcreateChecksum=true`


`git add -A . && git commit -m "released version 1.0"`

`git push origin`


use settings.xml withe below content. 
generate token from
https://github.com/settings/tokens

run the below command to publish the jar
mvn --settings {path_to_settings.xml} deploy
eg:
mvn --settings C:\Users\kmateen\.m2\github_settings.xml deploy

<br/><br/><br/><br/><br/>



`
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0
http://maven.apache.org/xsd/settings-1.0.0.xsd">

  <activeProfiles>
    <activeProfile>github</activeProfile>
  </activeProfiles>

  <profiles>
    <profile>
      <id>github</id>
      <repositories>
        <repository>
          <id>central</id>
          <url>https://repo1.maven.org/maven2</url>
        </repository>
        <repository>
          <id>github</id>
          <url>https://maven.pkg.github.com/mateenkhan/javautilities</url>
          <snapshots>
            <enabled>true</enabled>
          </snapshots>
        </repository>
      </repositories>
    </profile>
  </profiles>

  <servers>
    <server>
      <id>github</id>
      <username>mateenkhan</username>
      <password>{{token}}</password>
    </server>
  </servers>
</settings>

`