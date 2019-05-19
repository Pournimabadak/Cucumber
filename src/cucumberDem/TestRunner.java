package cucumberDem;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features ="src/scenarios.feature",glue= {"cucumberDem"},plugin= {"pretty","html:target\\customized_reports"})

public class TestRunner 
{

}


