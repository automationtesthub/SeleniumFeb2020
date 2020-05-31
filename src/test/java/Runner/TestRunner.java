package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features/Login.feature"
		,glue= {"StepDefinition"},
		//format = {"pretty", "html:target/Destination"} ,
				 plugin = { "pretty", "html:target/cucumber-html-report","json:target/cucumber.json" },
				 tags = {"@Sprint1"},////or
				// tags = {"@Smoke,@sanity"},////or
				 //tags = {"@Smoke","@sanity"},////and
				 //tags = {"@Smoke","~@Sanity"},////And
				 //tags = {"~@Smoke","~@Sanity"},////And
				 monochrome = true)


public class TestRunner {

}
