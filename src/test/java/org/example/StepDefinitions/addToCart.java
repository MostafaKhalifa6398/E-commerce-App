package org.example.StepDefinitions;

import org.example.PagesElements.CartElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class addToCart {
    CartElements element = new CartElements(open.driver);

    @Given("user select product and click add to cart")
    public void addCart() throws InterruptedException {
        element.addCartHome();
    }

    @And("determine the quantity of products and click add to cart")
    public void enterQuantity() throws InterruptedException {
        element.confirmAdd();
    }

    @Then("product added to cart successfully")
    public void addedSuccessfully()
    {
        element.notification();
    }
}
