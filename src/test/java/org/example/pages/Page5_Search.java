package org.example.pages;

import org.example.stepDefinitions.Setups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page5_Search {
    public int productsList(){
        int size = Setups.driver.findElements(By.cssSelector("h2[class=\"product-title\"]")).size();
        return size;
    }

    public WebElement noProducts(){
        return Setups.driver.findElement(By.cssSelector("div[class=\"no-result\"]"));
    }
}
