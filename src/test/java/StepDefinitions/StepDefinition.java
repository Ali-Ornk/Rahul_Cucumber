package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.cucumber.messages.types.TableRow;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import io.cucumber.java.en.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class StepDefinition {


   @Given("^User is on landing page$")
    public void user_is_on_landing_page()  {
//code to navigate login url
        System.out.println("Given is running");

    }
    @Given("^validate the browser$")
    public void validate_the_browser() {
        System.out.println("validate the browser$");
    }

    @When("^Browser is triggered$")
    public void browser_is_triggered()  {
        System.out.println("^Browser is triggered$");
    }

    @Then("^check if the browser is started$")
    public void check_if_the_browser_is_started() {
        System.out.println("check if the browser is started$");
    }

    @When("^User login into application with username and password$")
    public void user_login_into_application_with_username_and_password()  {
//code to login
        System.out.println("when is running");

    }
    @When("^User login into application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_password_something(String strArg1, String strArg2 ){
        System.out.println("^User login into application with  and password ([^]*)$");
        System.out.println(strArg1+"***");
        System.out.println(strArg2+"***");
    }


    @When("^User sign up with following details$")
    //                                             Datatable type should be "io.cucumber.datatable" not the other one
    public void user_sign_up_with_following_details(DataTable dataTable) {
       List<List<String>> obj= dataTable.asLists();//return type is  "List<List<String>>" and .aslist() should have same, i mean " List<List<String>>
        System.out.println(obj.get(0).get(0));  //first "get" gets the raw, second "get" gets the element in the given index from selected raw
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));



    }

    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_into_application_with_and_password(String username, String password)  {
        System.out.println(username);
        System.out.println(password);
    }
    @Then("^Home page is populated$")
    public void home_page_is_populated()  {
//home page validation
        System.out.println("Home page is populated");

    }

    @Then("Cards are {string}")
    public void cards_are(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Cards are {string}");
    }
    @Then("^Home page is populate$")
    public void home_page_is_populate()  {
        System.out.println("oznur abla icin");
    }

}
//for creating step definitions easily go to Tidy Gherkin on Google and paste what you have in feature file and choose  Java Steps
//dont forget to delete "throws"