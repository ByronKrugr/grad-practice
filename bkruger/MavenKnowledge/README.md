# Maven
### I. Maven General Knowledge
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
- Maven natively supports building projects within projects.

### II. Maven Build Profiles
- TODO...

### III. Maven Build Lifecycle
- A plugin goal is bound to a phase.
- A goal is applicable to all the phases mentioned after it, however, it will only apply if it makes sense:
  - E.g., if you specify the `jar:jar` goal it only runs `jar:jar` to package your code. But if you did not run the `compiler:compile` goal (don't have a compiled project) it will fail. 
- A build phase without a bound goal does not execute.
  - E.g., when `<packaging>` is set to `pom`, other than `install` and `deploy`, no phases are executed.
- A phase can have more than 1 goal bound to it -- here, all goals are executed.
- A goal not bound to a phase can be executed via direct invocation e.g., `mvn dependency:tree`
- Some phases have goals bound by default and for the default lifecycle, bindings depend on `<packaging>`.

### IV. 