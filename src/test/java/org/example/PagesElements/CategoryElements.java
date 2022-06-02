package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class CategoryElements {
    public CategoryElements(WebDriver driver)
    {
        open.driver = driver;
    }
    public void getElements() throws InterruptedException {
        Actions action = new Actions(open.driver);
        WebElement categories = open.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a"));
        categories.click();
        Thread.sleep(1000);
    }

    public void showProducts() throws InterruptedException {
        String expectedResult = "Books";
        String actualResult = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[1]/h1")).getText();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(expectedResult.contains(actualResult));
        Thread.sleep(1000);
    }
}
