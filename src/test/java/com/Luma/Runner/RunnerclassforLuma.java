package com.Luma.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;




	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "src/test/resources/FeatureFiles/Signinfeatures.feature",
			glue = "StepDfinitionforLogin",
			monochrome = true,
			plugin = {"pretty","html:target/cucumber-report.html"},
			dryRun = false
			
			
			)

			public class RunnerclassforLuma {			
			
	}
	
	
	
	
	
	
	
	
	
	
	

