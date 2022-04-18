to deploy this app as jar there are two ways  
1. push to main branch as pipeline is configured to take care of everthing else
2. follow below steps

## Steps
use settings.xml withe below content. 
generate token from
https://github.com/settings/tokens

run the below command to publish the jar
`mvn --settings {path_to_settings.xml} deploy`

eg:
`mvn --settings C:\Users\kmateen\.m2\github_settings.xml deploy`

<br/><br/><br/><br/><br/>



<pre>
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

</pre>