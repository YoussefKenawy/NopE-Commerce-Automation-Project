package org.example.pages;

import org.example.stepDefinitions.Setups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Page2_Register {
    public WebElement genderMale ()
    {
        WebElement genderMale= Setups.driver.findElement(By.id("gender-male"));
        return genderMale;
    }
    public WebElement firstName ()
    {
        WebElement firstName= Setups.driver.findElement(By.id("FirstName"));
        return firstName;
    }
    public WebElement lastName ()
    {
        WebElement lastName= Setups.driver.findElement(By.id("LastName"));
        return lastName;
    }
    public WebElement birthDay(){
        WebElement day= Setups.driver.findElement(By.name("DateOfBirthDay"));
        return day;
    }
    public WebElement birthMonth(){
        WebElement month= Setups.driver.findElement(By.name("DateOfBirthMonth"));
        return month;
    }
    public WebElement birthYear(){
        WebElement year= Setups.driver.findElement(By.name("DateOfBirthYear"));
        return year;
    }
    public WebElement email(){
        WebElement email= Setups.driver.findElement(By.name("Email"));
        return email;
    }
    public WebElement companyName() {
        WebElement company = Setups.driver.findElement(By.name("Company"));
        return company;
    }
    public WebElement password() {
        WebElement password = Setups.driver.findElement(By.name("Password"));
        return password;
    }
    public WebElement confirmPassword(){
        WebElement confirmPassword= Setups.driver.findElement(By.name("ConfirmPassword"));
        return confirmPassword;
    }
    public WebElement registerBtn(){
        WebElement btn= Setups.driver.findElement(By.name("register-button"));
        return btn;
    }
    public WebElement result(){
        WebElement result= Setups.driver.findElement(By.className("result"));
        return result;
    }
    public WebElement continueBtn(){
        WebElement cBtn= Setups.driver.findElement(By.className("button-1"));
        return cBtn;
    }
}
