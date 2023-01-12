package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Page1_HomePage;
import org.example.pages.Page2_Register;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class StepD1_Register extends Page2_Register {
    Page1_HomePage homePage=new Page1_HomePage();
    @Given("user go to register page")
    public void step1(){
        homePage.register().click();
    }
    @When("user select gender type")
    public void step2(){
        genderMale().click();
    }
    @And("^user enter first name \"(.*?)\" and last name \"(.*?)\"")
    public void step3(String firstname,String lastName){
        firstName().sendKeys(firstname);
        lastName().sendKeys(lastName);
    }
    @And("user enter date of birth")
    public void step4(){
        Select select=new Select(birthDay());
        select.selectByIndex(20);
        select=new Select(birthMonth());
        select.selectByVisibleText("March");
        select=new Select(birthYear());
        select.selectByValue("1997");
    }
    @And("^user enter email \"(.*?)\" field")
    public void step5(String email){
        email().sendKeys(email);
    }
    @And("user enter company name")
    public void step6() {
        companyName().sendKeys("Vodafone");
    }
    @And("^user fills Password fields \"(.*?)\" and \"(.*?)\"")
    public void step7(String pw1 , String pw2){
        password().sendKeys(pw1);
        confirmPassword().sendKeys(pw2);
    }
    @And("user clicks on register button")
    public void step8(){
        registerBtn().click();
    }
    @Then("success message is displayed")
    public void step9(){
        SoftAssert soft = new SoftAssert();
        result().isDisplayed();
        String actual = result().getText();
        soft.assertEquals(actual.contains("Your registration completed"),true);
        soft.assertAll();
    }
}
