# Cucumber-template
A Cucumber template for version 6.10.4 with Selenium version 3.141.59

## How to run

From the project root, run:

```
mvn clean test
```

- `clean` tidys up artifacts left from previous runs
- `test` triggers the test phase of Maven and runs the tests using a supplied test runner, does not require packaging

## Exercises

1. Add a feature file with scenarios for testing division and multiplication with the `Calculator class`

2. Add step definitions for your scenarios

3. Run your tests and verify if they worked successfully