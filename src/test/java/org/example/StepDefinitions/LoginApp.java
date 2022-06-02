package org.example.StepDefinitions;

import org.example.PagesElements.LoginElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class LoginApp {

    LoginElement logEle = new LoginElement(open.driver);


    @And("click login")
    public void navToLogin()
    {
        WebElement log = open.driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        log.click();
    }

    @When("user enter valid Email and password")
    public void enterValidData() throws InterruptedException {
        logEle.loginElements();
    }

    @And("user click login button")
    public void clickLoginButton()
    {
        WebElement loginBtn = open.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button"));
        loginBtn.click();
    }

    @Then("user could login successfully")
    public void loginSuccessfully()
    {
        String expectedResult = "Welcome to our store";
        String actualResult = open.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div > div.topic-block > div.topic-block-title > h2")).getText();

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(actualResult.contains(expectedResult));
    }
}