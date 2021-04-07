# Maven
<!-- ### I. Maven  General Knowledge
- `SNAPSHOT` refers to the latest codes along a development branch (unstable code) whereas release (w/o `SNAPSHOT`) is stable.
- If you want to package resources in the JAR file, as long as you follow convention (e.g. `${base_dir}/src/main/resources`) no explicit configuration is needed.
- A resource file may contain info only supplied at build-time.
  - reference the property in a resource file: `${<property_name>}`
  - property can be in POM, settings.xml, etc.
  - To make this possible enable "resource filtering" in POM:
    ```
    <build>
      <resources>
        <resource>
          <directory>src/main/resources</directory>
          <filtering>true</filtering>
    ```
  -  Can also get values from system properties like `java.version` or `user.home`.
  -  Can also get properties specified in command line:
    - in `application.properties` specify `command.line.prop=${command.line.prop}` then on the command line execute `-Dcommand.line.prop=blahblah`.
- Maven natively supports building projects within projects. -->

### I. Maven Build Profiles
- Builds must strive for portability (less reliance on local filesystem and more on the repository for metadata).
- Portability is usually broken by:
  - Extenal properties (in external files: `settings.xml`):
    - A property value that is outside the POM and not defined in a corresponding profile inside the POM.
    - E.g., specifying `appserver` paths in profile in `settings.xml` (`settings.xml` is never distributed when project is deployed).
  - Incomplete specification of a natural profile set:
    - E.g., if you only include "dev" and "test" profiles, but not a "prod" profile.

### II. Maven Build Lifecycle
- A plugin goal is bound to a phase.
- A goal is applicable to all the phases mentioned after it, however, it will only apply if it makes sense:
  - E.g., if you specify the `jar:jar` goal it only runs `jar:jar` to package your code. But if you did not run the `compiler:compile` goal (don't have a compiled project) it will fail. 
- A build phase without a bound goal does not execute.
  - E.g., when `<packaging>` is set to `pom`, other than `install` and `deploy`, no phases are executed.
- A phase can have more than 1 goal bound to it -- here, all goals are executed.
- A goal not bound to a phase can be executed via direct invocation e.g., `mvn dependency:tree`
- Some phases have goals bound by default and for the default lifecycle, bindings depend on `<packaging>`.

### III. Maven Dependency Mechanism
- Criteria that limits dependency inclusion:
  - Dependency mediation:
    - When there are multiple versions of an artifact, the one closest to the project in the tree of dependencies is chosen.
    ![alt text](https://github.com/ByronKrugr/grad-practice/bkruger/MavenKnowledge/imgs/1.png?raw=true)
    ![alt text](https://github.com/ByronKrugr/grad-practice/bkruger/MavenKnowledge/imgs/2.png?raw=true)
    - So in left image, project A uses D 1.0 since it is closer to A than D 2.0.
    - In right image, D 2.0 usage is forced by adding it to project A.
  - Dependency management:
    - Allows developers to specify versions of artifacts when encountered in transitive dependencies or where no version is given.
    - E.g., project A included D in `<dependencyManagement>` to control its version.
- Dependency management (`<dependencyManagement>`) takes precendance over dependency mediation for transitive depedencies.
- A child POM takes precedence over its parent POM.
- The concept of a bill of materials:
  - A project can only inherit from a single parent and to accommodate for this, projects can import managed dependencies from other projects (with `<packaging>` type `pom`) by declaring a dependency on them w/ `import` `<scope>`.
  - Imports are effective when defining a library of related artifacts and having a project use one or more artifacts from this library.
    - But it is difficult to sync versions in the project with the library.
    - Here, a BOM can solve this.
  - BOM workflow:
    - BOM POM defines versions of artifacts in the library: 
      ```
      <modelVersion>4.0.0</modelVersion>
      <groupId>com.test</groupId>
      <artifactId>bom</artifactId>
      <version>1.0.0</version>
      <packaging>pom</packaging>

      <properties>
        <project1Version>1.0.0</project1Version>
        <project2Version>1.0.0</project2Version>
      </properties>

      <dependencyManagement>
          <dependencies>
            <dependency>
              <groupId>com.test</groupId>
              <artifactId>project1</artifactId>
              <version>${project1Version}</version>
            </dependency>

            [similar for project2 as well]
          </dependencies>        
      </dependencyManagement>

      <modules>
          <module>parent</module>
      </modules>
      ```
    - Parent subproject has BOM POM as parent (is also a parent itself):
      ```
      <parent>
        <groupId>com.test</groupId>
        <version>1.0.0</version>
        <artifactId>bom</artifactId>
      </parent>
    
      <groupId>com.test</groupId>
      <artifactId>parent</artifactId>
      <version>1.0.0</version>
      <packaging>pom</packaging>
      
      <dependencyManagement>
        <dependencies>
          <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.12</version>
          </dependency>

          <dependency>
            <groupId>commons-logging</groupId>
            <artifactId>commons-logging</artifactId>
            <version>1.1.1</version>
          </dependency>
        </dependencies>
      </dependencyManagement>

      <modules>
        <module>project1</module>
        <module>project2</module>
      </modules>

      ```
    - Actual project POM looks like:
      ```
      <modelVersion>4.0.0</modelVersion>
      <parent>
        <groupId>com.test</groupId>
        <version>1.0.0</version>
        <artifactId>parent</artifactId>
      </parent>

      <groupId>com.test</groupId>
      <artifactId>project1</artifactId>
      <version>${project1Version}</version>
      <packaging>jar</packaging>
      
      <dependencies>
        <dependency>
          <groupId>log4j</groupId>
          <artifactId>log4j</artifactId>
        </dependency>
      </dependencies>

      ```

      ```
      <modelVersion>4.0.0</modelVersion>
      <parent>
        <groupId>com.test</groupId>
        <version>1.0.0</version>
        <artifactId>parent</artifactId>
      </parent>
  
      <groupId>com.test</groupId>
      <artifactId>project2</artifactId>
      <version>${project2Version}</version>
      <packaging>jar</packaging>
 
      <dependencies>
        <dependency>
          <groupId>commons-logging</groupId>
          <artifactId>commons-logging</artifactId>
        </dependency>
      </dependencies>

      ```
    - So, the library is used in a project without specifying versions:
      ```
      <modelVersion>4.0.0</modelVersion>
      <groupId>com.test</groupId>
      <artifactId>use</artifactId>
      <version>1.0.0</version>
      <packaging>jar</packaging>
      
      <dependencyManagement>
        <dependencies>
          <dependency>
            <groupId>com.test</groupId>
            <artifactId>bom</artifactId>
            <version>1.0.0</version>
            <type>pom</type>
            <scope>import</scope>
          </dependency>
        </dependencies>
      </dependencyManagement>
            
      <dependencies>
        <dependency>
          <groupId>com.test</groupId>
          <artifactId>project1</artifactId>
        </dependency>
         
        <dependency>
          <groupId>com.test</groupId>
          <artifactId>project2</artifactId>
        </dependency>
      </dependencies>

      ```





































