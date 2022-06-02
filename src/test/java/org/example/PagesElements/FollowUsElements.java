package org.example.PagesElements;

import org.example.StepDefinitions.open;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class FollowUsElements {
    public FollowUsElements(WebDriver driver)
    {
        open.driver=driver;
    }

    public void getFacebookElements() throws InterruptedException {
        Thread.sleep(1000);
        WebElement facebook = open.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[1]/a"));
        facebook.click();
        Thread.sleep(1000);

        SoftAssert soft = new SoftAssert();
        String URL = open.driver.getCurrentUrl();
        soft.assertEquals(URL, "https://www.facebook.com/nopCommerce");
        Thread.sleep(1000);

    }

    public void getTwitterElements() throws InterruptedException {
        Thread.sleep(1000);
        WebElement twitter = open.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[2]/a"));
        twitter.click();
        Thread.sleep(1000);

        SoftAssert soft = new SoftAssert();
        String URL = open.driver.getCurrentUrl();
        soft.assertEquals(URL, "https://twitter.com/nopCommerce");
        Thread.sleep(1000);
    }

    public void getRSSElements() throws InterruptedException {
        Thread.sleep(1000);
        WebElement RSS = open.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[3]/a"));
        RSS.click();
        Thread.sleep(1000);

        SoftAssert soft = new SoftAssert();
        String URL = open.driver.getCurrentUrl();
        soft.assertEquals(URL, "https://demo.nopcommerce.com/news/rss/1");
        Thread.sleep(1000);
    }

    public void getYoutubeElements() throws InterruptedException {
        Thread.sleep(1000);
        WebElement Youtube = open.driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[4]/div[1]/ul/li[4]/a"));
        Youtube.click();
        Thread.sleep(1000);

        SoftAssert soft = new SoftAssert();
        String URL = open.driver.getCurrentUrl();
        soft.assertEquals(URL, "https://www.youtube.com/user/nopCommerce");
        Thread.sleep(1000);
    }

}
