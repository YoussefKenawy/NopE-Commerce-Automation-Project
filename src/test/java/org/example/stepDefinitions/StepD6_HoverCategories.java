package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Page1_HomePage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class StepD6_HoverCategories extends Page1_HomePage {
    String subCategoryName;
    @When("user hover category and select subcategory")
    public void step1() throws InterruptedException {
        Actions action = new Actions(Setups.driver);
        action.moveToElement(computers()).perform();
        subCategoryName = desktops().getText().toLowerCase();
        Thread.sleep(1000);
    }

    @And("user click on subcategory")
    public void step2(){ desktops().click();
    }

    @Then("user go to relative product page")
    public void step3(){
        Assert.assertEquals(categoryList().getText().toLowerCase(),subCategoryName,"subcategory");
    }
}
