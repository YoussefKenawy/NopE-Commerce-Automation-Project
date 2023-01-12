package org.example.pages;

import org.example.stepDefinitions.Setups;
import org.openqa.selenium.By;

public class Page6_WishList {
    public int wishListItems(){
        int size = Setups.driver.findElements(By.cssSelector("div[class=\"wishlist-content\"]")).size();
        return size;
    }
}
