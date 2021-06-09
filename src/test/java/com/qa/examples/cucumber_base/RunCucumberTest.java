package com.qa.examples.cucumber_base;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", // sets location of feature files
		glue = "com.qa.examples.cucumber_base.step_definitions",
		snippets = SnippetType.CAMELCASE, // changes snippet output to camelcase rather than underscore
		plugin = {
				"summary", 
				"pretty", // prettify output
				"html:target/cucumber" // location for target report
		},
		monochrome = false // true = black & white output
)
public class RunCucumberTest {

}
