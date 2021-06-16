package com.qa.examples.cucumber_base;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "classpath:features", // sets location of feature files
		glue = {
				"com.qa.examples.cucumber_base.step_definitions",
				"com.qa.examples.cucumber_base.utils"
		},
		snippets = SnippetType.CAMELCASE, // changes snippet output to camelcase rather than underscore
		plugin = {
				"pretty", // prettify output
				"html:target/cucumber-reports/cucumber-html-report.html",
				"junit:target/cucumber-reports/cucumber-junit-report.xml",
				"json:target/cucumber-reports/cucumber-json-report.json"
		},
		monochrome = true // true = black & white output
)
public class RunCucumberTest {

}
