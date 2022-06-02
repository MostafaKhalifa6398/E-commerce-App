package org.example.StepDefinitions;

import org.example.PagesElements.makeOrder;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Order {
    makeOrder ord = new makeOrder(open.driver);

    @When("user login with valid username and password")
    public void login() throws InterruptedException {
        ord.getLoginElement();
    }

    @And("user select product and add it to cart and confirm adding")
    public void addToCart() throws InterruptedException {
        ord.addToCartElements();
    }

    @And("user click on shopping cart button")
    public void viewShoppingCart() throws InterruptedException {
        ord.clickOnShopping();
    }

    @And("user agree the terms and click on checkout button")
    public void checkOut() throws InterruptedException {
        ord.checkout();
    }

    @And("user enter shipping Address")
    public void enterShippingAddress() throws InterruptedException {
        ord.shippingAddress();
    }
    @And("user enter shipping method")
    public void enterShippingMethod() throws InterruptedException {
        ord.shippingMethod();
    }
    @And("user enter payment method")
    public void enterPaymentMethod() throws InterruptedException {
        ord.paymentMethod();
    }
    @And("user enter payment Information")
    public void enterPaymentInfo() throws InterruptedException {
        ord.paymentInfo();
    }
    @And("user confirm his order")
    public void confirmOrder() throws InterruptedException {
        ord.confirmOrder();
    }
    @Then("the order made successfully")
    public void successfulOrder() throws InterruptedException {
        ord.successOrder();
    }
}
