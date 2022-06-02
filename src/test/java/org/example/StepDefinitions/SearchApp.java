package org.example.StepDefinitions;

import org.example.PagesElements.SearchElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchApp {
    SearchElements search = new SearchElements(open.driver);

    @When("user enter product name in search box")
    public void searchProduct() throws InterruptedException {
        search.getElements();
    }

    @And("Click search")
    public void clickSearch()
    {
        WebElement searchButton = open.driver.findElement(By.cssSelector("#small-search-box-form > button"));
        searchButton.click();
    }
}
