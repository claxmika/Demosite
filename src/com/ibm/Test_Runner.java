package com.ibm;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.sitture.ExtentReporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature",
tags = {"@successful"},
snippets = SnippetType.CAMELCASE,
plugin = {"pretty:target/cucumber-pretty.txt", "html:target/cucumber-html-report", "json:target/cucumber.json", 
		"junit:target/cucumber-results.xml" }
)
public class Test_Runner {

}