package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginElement {
    public LoginElement(WebDriver driver){
        open.driver = driver;
    }

    public void loginElements() throws InterruptedException {
        WebElement Email = open.driver.findElement(By.id("Email"));
        Email.click();
        Email.sendKeys("mostafamahmoud24@gmail.net");
        Thread.sleep(1000);

        WebElement Password = open.driver.findElement(By.id("Password"));
        Password.click();
        Password.sendKeys("12345678");
        Thread.sleep(1000);
    }
}