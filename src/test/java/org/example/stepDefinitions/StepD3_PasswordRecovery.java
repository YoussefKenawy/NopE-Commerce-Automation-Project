package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Page3_Login;
import org.example.pages.Page4_PasswordRecovery;
import org.testng.Assert;

public class StepD3_PasswordRecovery extends Page4_PasswordRecovery {
    Page3_Login login = new Page3_Login();
    @And("user click on forgot password")
    public void step1(){
        login.forgetPassword().click();
    }
    @When("user fill email with valid email")
    public void step2(){
        email().sendKeys("404omaralaa407@gmail.com");
    }
    @And("user click on Recover button")
    public void step3(){
        recoveryButton().click();
    }
    @Then("user should see message")
    public void step4(){
        Assert.assertTrue(message().getText().contains("Email with instructions has been sent to you.")
        , String.valueOf(true));
    }
}
