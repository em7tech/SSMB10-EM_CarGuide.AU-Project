package com.carguide.au.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//dryRun = true,
		tags = "@Smoke",
		features = "src/test/resources/features/",
		//features = "src/test/resources/features/CarGuidesFindADealer.feature",
		glue ={"com.carguide.steps"},
		plugin= {"junit:target/cucumber-report/xml/test-report.xml",
                "json:target/cucumber-report/json/cucumber-report.json",
                "html:target/cucumber-report/html/test-report.html"}
		)
public class Runner {

}
