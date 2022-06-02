package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterElement{

    public RegisterElement(WebDriver driver){
        open.driver=driver;
    }
    public void getElements() throws InterruptedException {
        WebElement gender = open.driver.findElement(By.id("gender-male"));
        gender.click();
        Thread.sleep(1000);

        WebElement firstName = open.driver.findElement(By.id("FirstName"));
        firstName.click();
        firstName.sendKeys("Mostafa");
        Thread.sleep(1000);

        WebElement lastName = open.driver.findElement(By.id("LastName"));
        lastName.click();
        lastName.sendKeys("Khalifa");
        Thread.sleep(1000);

        Select day = new Select(open.driver.findElement(By.name("DateOfBirthDay")));
        day.selectByValue("6");
        Thread.sleep(1000);

        Select month = new Select(open.driver.findElement(By.name("DateOfBirthMonth")));
        month.selectByIndex(3);
        Thread.sleep(1000);

        Select year = new Select(open.driver.findElement(By.name("DateOfBirthYear")));
        year.selectByValue("1998");
        Thread.sleep(1000);

        WebElement Email = open.driver.findElement(By.id("Email"));
        Email.click();
        Email.sendKeys("mostafamahmoud24@gmail.net");
        Thread.sleep(1000);

        WebElement company = open.driver.findElement(By.id("Company"));
        company.click();
        company.sendKeys("Company");
        Thread.sleep(1000);

        WebElement pass = open.driver.findElement(By.id("Password"));
        pass.click();
        pass.sendKeys("12345678");
        Thread.sleep(1000);

        WebElement confirmPass = open.driver.findElement(By.id("ConfirmPassword"));
        confirmPass.click();
        confirmPass.sendKeys("12345678");
        Thread.sleep(1000);

    }
}
