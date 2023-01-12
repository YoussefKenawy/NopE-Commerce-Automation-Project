package org.example.pages;

import org.example.stepDefinitions.Setups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page7_ShoopingCart {
    public WebElement ShoopingCartMessageMethod(){

    WebElement ShoopingCartMessage=Setups.driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div"));
        return ShoopingCartMessage;
    }
}
