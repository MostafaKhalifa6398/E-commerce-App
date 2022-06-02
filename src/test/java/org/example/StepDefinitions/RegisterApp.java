package org.example.StepDefinitions;

import org.example.PagesElements.RegisterElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import static org.example.StepDefinitions.open.driver;

public class RegisterApp {


    RegisterElement reg = new RegisterElement(driver);



    @And("click register button")
    public void clickRegisterHome()
    {
        WebElement link = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a"));
        link.click();
    }

    @When("user enter valid data")
    public void validData() throws InterruptedException {
        reg.getElements();
    }

    @And("user click register button")
    public void clickRegisterButton()
    {
        driver.findElement(By.id("register-button")).click();
    }

    @Then("user could register successfully")
    public void registerSuccessfully()
    {
        String expectedResult = "Your registration completed";
        String actualResult = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]")).getText();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(expectedResult.contains(actualResult));
    }



}
