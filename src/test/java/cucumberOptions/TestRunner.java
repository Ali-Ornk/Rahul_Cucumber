package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; //for junit we should use this junit.CucumberOptions import
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",//src/test/java/Features we can add "Login.feature" as well if we need spesific feature
        glue = "StepDefinitions",stepNotifications = true, tags = "@SmokeTest")//related test cases package
                                            //tags = "@chosenTests"  by '  tag="....." ' we can run specific tests
                                            // tags = "@chosenTest1 or chosenTest2 "  by '  tag="...or.." 'we can run different type tests
                                            //tags = "not @chosenTests" will run test except " @chosenTests"
public class TestRunner {

}
