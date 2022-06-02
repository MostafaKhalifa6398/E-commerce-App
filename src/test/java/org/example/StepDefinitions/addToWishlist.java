package org.example.StepDefinitions;

import org.example.PagesElements.WishlistElements;
import io.cucumber.java.en.When;

import static org.example.StepDefinitions.open.driver;

public class addToWishlist {
    WishlistElements wishList = new WishlistElements(driver);

    @When("user click add to wishlist")
    public void addToList() throws InterruptedException {
        wishList.getElements();
    }
}
