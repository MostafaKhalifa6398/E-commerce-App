package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CompareElements {
    public CompareElements(WebDriver driver)
    {
        open.driver = driver;
    }

    public void getElements() throws InterruptedException {
        WebElement selectCat = open.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a"));
        selectCat.click();

        WebElement select1 = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[1]/div/div[2]/div[3]/div[2]/button[2]"));
        select1.click();
        Thread.sleep(1000);

        WebElement select2 = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[2]"));
        select2.click();;
        Thread.sleep(1000);

        WebElement select3 = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[2]"));
        select3.click();
        Thread.sleep(1000);
    }

    public void clickOnComparelist() throws InterruptedException {
        Thread.sleep(1000);
        WebElement compareList = open.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[2]/ul/li[5]/a"));
        compareList.click();
        Thread.sleep(1000);
    }

    public void comparePage()
    {
         String compareText = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[1]/h1")).getText();
         String actualResult = "Compare products";

         SoftAssert soft = new SoftAssert();
         soft.assertTrue(compareText.contains(actualResult));

    }
}
