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

### Removing users BDD exercise

1. Perform the Discovery stage to find the scope of the systems behaviour for the following story: As a developer, I want to remove active users in the messenger so that they are not online.

```
Ask yourself and your team if done in a team (Developer, Tester & Product Owner):

What rules constrain the user story to be implemented?

Are there any questions that no-one knows the answer/correct outcome to? (These are generally questions where the behaviour is out of scope or needs to be answered by the client)

Are there any new user stories we have managed to slice out of the story under discovery?

What is the expected outcome of the behaviour?

What is being tested?
```

2. Perform the Formulation stage by adding a feature file with scenarios for testing whether a user can be removed from the active user list in a messenger

- Add step definitions for your scenarios

3. Perform the Automation stage by providing an implementation in code for your documented examples

4. Run your tests and verify they worked.