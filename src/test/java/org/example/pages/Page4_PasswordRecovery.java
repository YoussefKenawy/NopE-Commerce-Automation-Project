package org.example.pages;

import org.example.stepDefinitions.Setups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page4_PasswordRecovery {
    public WebElement email ()
    {
        WebElement email= Setups.driver.findElement(By.cssSelector("input[id=\"Email\"]"));
        return email;
    }
    public WebElement recoveryButton()
    {
        WebElement recoveryButton= Setups.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]"));
        return recoveryButton;
    }
    public WebElement message()
    {
        WebElement message= Setups.driver.findElement(By.cssSelector("p[class=\"content\"]"));
        return message;
    }
}
