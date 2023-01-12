package org.example.pages;

import org.example.stepDefinitions.Setups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Page1_HomePage {
    public WebElement register(){
        WebElement reg= Setups.driver.findElement(By.className("ico-register"));
        return reg;
    }

    public WebElement login() {
        return Setups.driver.findElement(By.cssSelector("a[class=\"ico-login\"]"));
    }
    public WebElement currency(){
        return Setups.driver.findElement(By.id("customerCurrency"));
    }
    public List<WebElement> sign(){
        List<WebElement> count = Setups.driver.findElements(By.cssSelector("span[class=\"price actual-price]\"]"));
        return count;
    }
    public WebElement searchBar(){
        return Setups.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement searchButton(){
        return Setups.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
    public WebElement categoryList(){
        return Setups.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }
    public WebElement computers(){
        return Setups.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/computers\"]"));
    }

    public WebElement desktops(){
        return Setups.driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] [href=\"/desktops\"]"));
    }
    public WebElement apparel(){
        return Setups.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[3]/div/div[2]/div/h2/a"));
    }
    public WebElement shoes(){
        return Setups.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a"));
    }
    public WebElement slider(String sliderNum){
        return Setups.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])["+sliderNum+"]"));
    }
    public WebElement facebook() {
        return Setups.driver.findElement(By.xpath("//a[@href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitter() {
        return Setups.driver.findElement(By.xpath("//a[@href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rss() {
        return Setups.driver.findElement(By.xpath("//a[@href=\"/news/rss/1\"]"));
    }

    public WebElement youtube() {
        return Setups.driver.findElement(By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }
    public WebElement wishList() {
        return Setups.driver.findElement(By.cssSelector("div[class=\"header-links\"] [href=\"/wishlist\"]"));
    }

    public List<WebElement> addWishList() {
        return Setups.driver.findElements(By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]"));
    }

    public WebElement wishSuccessMsg() {
        return Setups.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
    }

    public WebElement closeB() {
        return Setups.driver.findElement(By.cssSelector("span[class=\"close\"]"));
    }
}

