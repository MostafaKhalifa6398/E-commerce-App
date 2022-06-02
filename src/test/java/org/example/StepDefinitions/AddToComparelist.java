package org.example.StepDefinitions;

import org.example.PagesElements.CompareElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToComparelist {
    CompareElements comp = new CompareElements(open.driver);

    @When("user add the products to compare list")
    public void selectProducts() throws InterruptedException
    {
        comp.getElements();
    }

    @And("click on compare production list")
    public void clickComparelist() throws InterruptedException {
        comp.clickOnComparelist();
    }

    @Then("user can compare between the selected products")
    public void compareListPage()
    {
        comp.comparePage();
    }
}
