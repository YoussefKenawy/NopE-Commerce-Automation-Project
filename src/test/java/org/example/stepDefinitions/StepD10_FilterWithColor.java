package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class StepD10_FilterWithColor extends Page1_HomePage{


    String subCategoryName;
    @When("user hover category and select subcategory")
    public void step1() throws InterruptedException {
        Actions action = new Actions(Setups.driver);
        action.moveToElement(apparel()).perform();
               Thread.sleep(1000);
    }

    @And("user click on subcategory And user go to relative product page")
    public void step2(){ shoes().click();
        Assert.assertEquals(categoryList().getText().toLowerCase(),subCategoryName,"subcategory");
    }

    @Then("user can filter with color")
    public void step3(){
          Setups.driver.findElement(By.xpath("<input id=\"attribute-option-14\" type=\"checkbox\" data-option-id=\"14\">")).click();
    }
}
