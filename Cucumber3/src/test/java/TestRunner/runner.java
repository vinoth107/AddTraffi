package TestRunner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\VINOTH KUMAR\\git\\repository2\\Cucumber3\\Feature\\addtraffi.feature",
glue = { "StepDefination" }, 
plugin = {"html:target1" },
monochrome= true,
strict = true)
public class runner {

}
