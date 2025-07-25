package runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features="C:\\Users\\hp\\eclipse-workspace\\ProjectName\\src\\main\\java\\Feature"
			,glue= {"C:\\Users\\hp\\eclipse-workspace\\ProjectName\\src\\main\\java\\stepdeffination"}
			
			)

public class TestRunner{
		
	}




