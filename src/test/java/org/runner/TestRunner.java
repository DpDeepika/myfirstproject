package org.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\N K sachidanandam\\eclipse-workspace\\cucumber\\src\\test\\resources\\sample.feature"},glue= {"org.stepdef"})
public class TestRunner {

}
