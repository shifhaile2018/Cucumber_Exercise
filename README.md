# Cucumber-template
A Cucumber template for version 6.10.4 with Selenium version 3.141.59

# How to run

Use the following command to run the tests:

```sh
mvn test -Dbrowser=<browser>
```

- Replace `<browser>` with your browser of choice
- Ensure an appropriate driver is available in the `src/test/resources/drivers` folder

Example:

```sh
mvn test -Dbrowser=chrome
```

# Technologies used

- Cucumber with Gherkin DSL for Behavioural Driven Development
- Selenium for Automation testing of User Interfaces