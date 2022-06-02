package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistElements {
    public WishlistElements(WebDriver driver)
    {
        open.driver = driver;
    }

    public void getElements() throws InterruptedException {
        WebElement wishButton = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[3]"));
        wishButton.click();
        Thread.sleep(1000);
    }
}
