package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = 	"src/test/resources/features",
	glue = {"com.StepDef","com.runner"},
	plugin= {"pretty",
			"html:target/cucumber-reports.html",    // Generate an HTML report
	        "json:target/cucumber-reports/cucumber.json" // Generate a JSON report
			}
	//tags="@login"
		
)

public class TestRunner extends AbstractTestNGCucumberTests{

}
