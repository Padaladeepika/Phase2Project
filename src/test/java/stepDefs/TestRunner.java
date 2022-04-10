package stepDefs;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
			plugin = {"html:target/html-cucumber","json:target/cucumber.json"},
	        features = "src/test/java/features",
	        
	         tags = {"@Sanity or @Regression"}, //to run multiple tags using OR

	        glue = {"stepDefs"}
	        
	        )public class TestRunner {
	}


