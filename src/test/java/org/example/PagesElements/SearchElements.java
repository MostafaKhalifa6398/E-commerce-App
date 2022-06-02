package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchElements {
    public SearchElements(WebDriver driver)
    {
        open.driver = driver;
    }
    public void getElements() throws InterruptedException {
        WebElement searchText = open.driver.findElement(By.id("small-searchterms"));
        searchText.click();
        searchText.sendKeys("Apple MacBook Pro 13-inch");
        Thread.sleep(1000);
    }
}