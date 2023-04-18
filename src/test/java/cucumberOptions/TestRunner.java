package cucumberOptions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions; //for junit we should use this junit.CucumberOptions import
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",//src/test/java/Features we can add "Login.feature" as well if we need spesific feature
        glue = "StepDefinitions",
        stepNotifications = true,
        tags = "@astest" , //related test cases package
        //tags = "@chosenTests"  by '  tag="....." ' we can run specific tests
        // tags = "@chosenTest1 or chosenTest2 "  by '  tag="...or.." 'we can run different type tests
        //tags = "not @chosenTests" will run test except " @chosenTests"
        // tags = "@chosenTest1 and @chosenTest2 "  by '  tag="...and.." 'it will look for tests has @chosenTest1 and @chosenTest2 at the same time

        dryRun = true, //if created a step in feature file but we didnt create step definition it will show us and ask for to create it
        monochrome = true, //  it helps us to get neat, pure output

        ///                      part 1                         part 2                       part3
        plugin = {"pretty","html:target/cucumber.html" , "json:target/cucumber.json" , "junit:target/cucumber.xml"}
        //formula = plugin = {"pretty", "fileType : TargetPackage/cucumber.fileType"} applies for any type of file type like json or xml

        //part 1
        //after running code it is for creating a REPORT to share with the client
        //it is creating a file on "target". file name is cucumber.html if we copy absolut path of this file and paste it on browser we can see
        //the report of how many test has passsed or failed

        //part 2
        //"json:target/cucumber.json" creates file with json extension in target file

        //part3
        //"junit:target/cucumber.xml creates file with xml extension in target file

              )
public class TestRunner {


}
