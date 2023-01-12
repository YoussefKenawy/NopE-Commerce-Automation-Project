package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.Page7_ShoopingCart;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class StepD11_ShoppingCart extends Page7_ShoopingCart {
    StepD11_ShoppingCart shoppingCart = new StepD11_ShoppingCart();


    @Given("user add item to shopping cart")
    public void step1() {
        Actions action = new Actions(Setups.driver);
        action.moveToElement(Setups.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]"))).perform();
        Setups.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]")).click();
        Setups.driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-4\"]")).click();
    }

    @Then("shopping cart notification success is visible")
    public void step2() {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(ShoopingCartMessageMethod().isDisplayed(), "Success Message");

        String actual = ShoopingCartMessageMethod().getText();
        String expected = "The product has been added to your";
        soft.assertEquals(actual.contains(expected), "Message Text");
    }

}
