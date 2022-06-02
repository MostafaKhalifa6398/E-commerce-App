package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class makeOrder {
    public makeOrder(WebDriver driver)
    {
        open.driver = driver;
    }

    public void getLoginElement() throws InterruptedException {
        WebElement loginButton = open.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        loginButton.click();
        Thread.sleep(1000);

        WebElement Email = open.driver.findElement(By.id("Email"));
        Email.click();
        Email.sendKeys("mostafamahmoud24@gmail.net");
        Thread.sleep(1000);

        WebElement Password = open.driver.findElement(By.id("Password"));
        Password.click();
        Password.sendKeys("12345678");
        Thread.sleep(1000);

        WebElement loginBtn = open.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button"));
        loginBtn.click();

    }

    public void addToCartElements() throws InterruptedException {
        WebElement add = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[2]/button[1]"));
        add.click();
        Thread.sleep(1000);

        WebElement confirmAdd = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div/form/div[2]/div[1]/div[2]/div[9]/div[2]/button"));
        confirmAdd.click();
        Thread.sleep(1000);
    }

    public void clickOnShopping() throws InterruptedException {
        WebElement shopping = open.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[3]/ul/li[4]/a"));
        shopping.click();
        Thread.sleep(1000);
    }

    public void checkout() throws InterruptedException {
        WebElement terms = open.driver.findElement(By.id("termsofservice"));
        terms.click();
        Thread.sleep(1000);

        WebElement check = open.driver.findElement(By.id("checkout"));
        check.click();
        Thread.sleep(1000);
    }

    public void shippingAddress() throws InterruptedException {
        Select country = new Select(open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/form/div/div/div[2]/div/div/div[5]/select")));
        country.selectByIndex(65);
        Thread.sleep(1000);

        WebElement city = open.driver.findElement(By.id("BillingNewAddress_City"));
        city.click();
        city.sendKeys("cairo");
        Thread.sleep(1000);

        WebElement address = open.driver.findElement(By.id("BillingNewAddress_Address1"));
        address.click();;
        address.sendKeys("cairo");
        Thread.sleep(1000);

        WebElement ZIP = open.driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        ZIP.click();
        ZIP.sendKeys("45678");
        Thread.sleep(1000);

        WebElement phoneNumber = open.driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.click();
        phoneNumber.sendKeys("01154204204");
        Thread.sleep(1000);

        WebElement cont = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[1]/div[2]/div/button[4]"));
        cont.click();
        Thread.sleep(1000);
    }

    public void shippingMethod() throws InterruptedException {
        WebElement cont2 = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[3]/div[2]/form/div[2]/button"));
        cont2.  click();
        Thread.sleep(1000);
    }

    public void paymentMethod() throws InterruptedException {
        WebElement pay = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[4]/div[2]/div/button"));
        pay.click();
        Thread.sleep(1000);
    }

    public void paymentInfo() throws InterruptedException {
        WebElement Info = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[5]/div[2]/div/button"));
        Info.click();
        Thread.sleep(1000);
    }

    public void confirmOrder() throws InterruptedException {
        WebElement confirmOrd = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/ol/li[6]/div[2]/div[2]/button"));
        confirmOrd.click();
        Thread.sleep(1000);
    }

    public void successOrder() throws InterruptedException {
        String message = open.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div/div[1]/strong")).getText();
        String actual = "Your order has been successfully processed!";

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(message.contains(actual));
        Thread.sleep(1000);
    }

}
