package org.example.pages;

import org.example.stepDefinitions.Setups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page3_Login {
    public WebElement email(){
        WebElement email = Setups.driver.findElement(By.id("Email"));
        return email;
    }
    public WebElement password(){
        WebElement password = Setups.driver.findElement(By.id("Password"));
        return password;
    }
    public WebElement loginBtn(){
        WebElement loginBtn = Setups.driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
        return loginBtn;
    }
    public WebElement forgetPassword(){
        WebElement forgetPassword = Setups.driver.findElement(By.className("forgot-password"));
        return forgetPassword;
    }
    public WebElement wrongMsg() {
        return Setups.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
