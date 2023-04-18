package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//Hooks has to be in step definitions
public class Hooks {
   @Before("@MobileTest")
   //@Before should be imported from "io.cucumber.java.Before;" it is like before method
    public void BeforeValidiation(){
       System.out.println("Mobile before hook");
       System.out.println("*************************beforeeee");
    }

   @After("@MobileTest")//@Before should be imported from "io.cucumber.java.Before;" it is like after method
    public void AfterValidiation(){
        System.out.println("Mobile after hook");
        System.out.println("**************************after");
    }
    @Before("@SmokeTest")
    //@Before should be imported from "io.cucumber.java.Before;" it is like before method
    public void BeforeSmokeValidiation(){
        System.out.println("Mobile before hook");
        System.out.println("*************************beforeeee");
    }

    @After("@SmokeTest")//@Before should be imported from "io.cucumber.java.Before;" it is like after method
    public void AfterSmokeValidiation(){
        System.out.println("Mobile after hook");
        System.out.println("**************************after");
    }

}
