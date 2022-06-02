package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CurrencyElements {
    public CurrencyElements(WebDriver driver)
    {
        open.driver = driver;
    }
    public void getElements() throws InterruptedException {
        Select currency = new Select(open.driver.findElement(By.name("customerCurrency")));
        currency.selectByIndex(1);
        Thread.sleep(1000);
    }
    public void checkCurrency()
    {
        String symbol = open.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.product-grid.home-page-product-grid > div.item-grid > div:nth-child(1) > div > div.details > div.add-info > div.prices > span")).getText();
        String expectedResult = "€1032.00";
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(expectedResult.contains(symbol));
    }
}
