package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Page1_HomePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.util.ArrayList;

public class StepD8_FollowUs extends Page1_HomePage {


    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void opens_new_tab(String linkType) throws InterruptedException {
        Thread.sleep(2000);
        ArrayList<String> Tabs = new ArrayList<>(Setups.driver.getWindowHandles());
        Setups.driver.switchTo().window(Tabs.get(1));

        switch (linkType) {

            case "facebook-Link":
                Assert.assertEquals(Setups.driver.getCurrentUrl(), "https://www.facebook.com/nopCommerce","facebook link");
                break;

            case "twitter-Link":
                Assert.assertEquals(Setups.driver.getCurrentUrl(), "https://twitter.com/nopCommerce","twitter link");
                break;

            case "youtube-Link":
                Assert.assertEquals(Setups.driver.getCurrentUrl(), "https://www.youtube.com/user/nopCommerce","youtube link");
                break;

            case "rss-Link":
                Assert.assertEquals(Setups.driver.getCurrentUrl(), "https://demo.nopcommerce.com/new-online-store-is-open","rss link");
                break;

        }

        Setups.driver.close();

        Setups.driver.switchTo().window(Tabs.get(0));
    }
    @Given("user opens facebook link")
    public void step1() {
        facebook().click();
    }
    @When("user opens twitter link")
    public void step2() {
        twitter().click();
    }

    @When("user opens rss link")
    public void step3() {
        rss().sendKeys(Keys.ENTER);
        // To Open rss In New Tap
        // rss().sendKeys(Keys.CONTROL , Keys.ENTER);
    }

    @When("user opens youtube link")
    public void step4() {
        youtube().click();
    }

}
