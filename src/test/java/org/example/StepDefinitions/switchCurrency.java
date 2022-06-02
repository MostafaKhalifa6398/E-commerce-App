package org.example.StepDefinitions;

import org.example.PagesElements.CurrencyElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.example.StepDefinitions.open.driver;


public class switchCurrency {

    CurrencyElements currency = new CurrencyElements(driver);

    @When("user select currency from the dropdown list")
    public void selectCurrency() throws InterruptedException {
        currency.getElements();
    }

    @Then("currency switched successfully")
    public void checkCurrencyChange()
    {
        currency.checkCurrency();
    }
}
