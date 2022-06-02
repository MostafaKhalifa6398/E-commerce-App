package org.example.StepDefinitions;

import org.example.PagesElements.CategoryElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class selectCategory {

    CategoryElements cat = new CategoryElements(open.driver);

    @When("user select category and click")
    public void selectCat() throws InterruptedException {
        cat.getElements();
    }
    @Then("user can view category's products")
    public void showCat() throws InterruptedException {
        cat.showProducts();
    }
}
