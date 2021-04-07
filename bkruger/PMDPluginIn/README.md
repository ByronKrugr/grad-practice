# Maven PMD Plugin in a Java Project

I was presented with an error when I executed `mvn site` (java.lang.NoClassDefFoundError: org/apache/maven/doxia/siterenderer/DocumentContent). This is due to the default `maven-site-plugin` version 3.3 and to solve it, use the latest version (currently 3.9.1):

```
<build>
  <pluginManagement>
    <plugins>
      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-site-plugin</artifactId>
        <version>3.9.1</version>
      </plugin>
    </plugins>
  </pluginManagement>
</build>
```
