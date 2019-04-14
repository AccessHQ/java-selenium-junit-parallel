# java-selenium-docker-junit

Parallel test execution using:

1. Java
2. JUnit
3. Selenium WebDriver and Selenium Grid
4. Docker *\**

*\* local machine or docker execution possible*

## Maven profiles

There are a number of Maven profiles which can be used to control the execution settings:

1. `firefox` or `chrome` will dictate the browser to use. *Default is `firefox`*
2. `local` or `remote` will specify running on the local machine or Selenium Grid (Docker). *Default is `local`*
3. `dev`, `test` or `prod` will dictate the environment (only `prod` works in this example). *Default is `prod`*
4. `parallel` ensures parallel execution

### Examples

`mvn clean test` 

This will use the defaults and run `local`, `firefox`, `prod`, `parallel`

`mvn clean test -P chrome -P remote -P prod -P parallel`

This will execute the tests on Chrome in Selenium Grid with the Production URL.

`mvn clean test -P chrome,remote,prod,parallel`

This is also valid syntax

## Selenium Grid

The following repository can be used to spin up a Selenium Grid using Docker:

https://code.dialoggroup.biz/projects/SP/repos/selenium-grid-docker/browse
