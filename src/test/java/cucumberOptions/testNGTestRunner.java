package cucumberOptions;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;//for testNG we should use this testng.CucumberOptions import

@CucumberOptions(features = "src/test/java/Features", glue = "Features")
//there is no need @RunWith(Cucumber.class). we need to make extension
public class testNGTestRunner extends AbstractTestNGCucumberTests { ///for running test in testNG we have to extend AbstractTestNGCucumberTests
}
