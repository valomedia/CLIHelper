# AGENTS.md – CLIHelper

## Project overview

- CLIHelper is a Java command-line helper library.
- The Maven coordinates are `media.valo:CLIHelper`,
  currently version `2.0.0-alpha.1`.
- Java 21 is the configured source and target level.
- Main sources live under `src/main/java/media/valo/CLIHelper/`.
- Tests live under `src/test/java/media/valo/CLIHelper/` and use JUnit Jupiter.

## Build and test

- There is no Maven wrapper in this repository.
  Use a system `mvn` when it is available.
- Run `mvn test` to compile the project and run the unit tests.
- Run `mvn package` when you need the built JAR under `target/`.
- Do not commit generated build output from `target/`.

## Coding conventions

- Preserve the existing Apache 2.0 copyright header on Java and project files.
- Keep the existing package name and directory layout,
  including the capitalized `media.valo.CLIHelper` package segment.
- Public API classes currently expose simple fields and methods with Javadoc.
  Keep public additions documented with matching Javadoc style.
- Keep test fixtures in JUnit 5 tests under the matching package path.
- When changing CLI input behavior,
  add or update tests that exercise `System.in`, `System.out`, and `System.err` redirection.

## Agent workflow

- Inspect the small source tree before making broad changes.
- Prefer the smallest API-compatible change that satisfies the task.
- Verify with `mvn test` when Maven is installed.
  If Maven is unavailable, report that explicitly with any direct inspection performed.
