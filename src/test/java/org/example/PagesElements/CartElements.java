package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class CartElements {
    public CartElements(WebDriver driver)
    {
        open.driver = driver;
    }
    public void addCartHome() throws InterruptedException {
        WebElement add = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]"));
        add.click();
        Thread.sleep(1000);
    }

    public void confirmAdd() throws InterruptedException {
        WebElement confirmAdd = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[9]/div[2]/button[1]"));
        confirmAdd.click();
        Thread.sleep(1000);
    }

    public void notification()
    {
        String notification = open.driver.findElement(By.xpath("/html/body/div[5]")).getText();
        String actualResult = "The product has been added to your shopping cart";

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(notification.contains(actualResult));
    }
}
