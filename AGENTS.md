# AGENTS.md – CLIHelper

## Project
- CLIHelper is a Java library for reading from and writing to the command line.
- The build is a Maven project targeting Java 21.
- Tests use JUnit Jupiter 5.10.1.

## Commands
- `mvn test` - compile the project and run the test suite.
- `mvn package` - build the library artifact and run tests.
- `mvn clean` - remove Maven build output under `target/`.

## Structure
- `pom.xml` - Maven coordinates, Java version, and dependency declarations.
- `README.md` - brief project description.
- `src/main/java/` - expected location for production Java sources when added.
- `src/test/java/` - expected location for JUnit tests when added.

## Working rules
- Keep generated Maven output out of git.
  `target/` is ignored and should not be hand-edited.
- Prefer Maven's standard source layout unless a future project file documents otherwise.
- Update `pom.xml` when changing Java version, dependencies, or build behavior.
- Do not add secrets or machine-local settings to the repository.
