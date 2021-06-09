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

1. Create a user story for dividing and a user story for multiplication

2. Perform the Discovery stage to find the scope of the systems behaviour.

Ask yourself and your team if done in a team (Developer, Tester & Product Owner):

- What rules constrain the user story to be implemented?
- Are there any questions that no-one knows the answer/correct outcome to? (These are generally questions where the behaviour is out of scope or needs to be answered by the client)
- Are there any new user stories we have managed to slice out of the story under discovery?
- What is the expected outcome of the behaviour?
- What is being tested?

3. Perform the Formulation stage by adding a feature file with scenarios for testing division and multiplication with the `Calculator class`, this acceptance criteria is 

- Add step definitions for your scenarios

4. Perform the Automation stage by providing an implementation in code for your documented examples

5. Run your tests and verify they worked. If they worked, you have successfully implemented BDD in a simple way.