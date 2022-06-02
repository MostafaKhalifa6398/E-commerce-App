package org.example.StepDefinitions;

import org.example.PagesElements.FollowUsElements;
import io.cucumber.java.en.When;

public class FollowUS {
    FollowUsElements follow = new FollowUsElements(open.driver);

    @When("user click on facebook icon redirect to website's facebook page")
    public void facebook() throws InterruptedException {
        follow.getFacebookElements();
    }

    @When("user click on Twitter icon redirect to website's twitter page")
    public void Twitter() throws InterruptedException {
        follow.getTwitterElements();
    }

    @When("user click on rss icon redirect to website's rss page")
    public void RSS() throws InterruptedException {
        follow.getRSSElements();
    }

    @When("user click on youtube icon redirect to website's youtube channel")
    public void Youtube() throws InterruptedException {
        follow.getYoutubeElements();
    }

}
