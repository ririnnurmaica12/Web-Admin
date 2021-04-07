package com.web.javawebadmin;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class About {
    WebDriver driver = new ChromeDriver();

    AboutHelper aboutHelper = new AboutHelper(driver);

    @When("^I click button about$")
    public void i_click_button_about() {
        aboutHelper.click_button_about();
    }

    @Then("^About page should be \"(.*?)\"$")
    public void about_page_should_be(String result) throws Throwable {
        aboutHelper.about_page_should_be(result);
    }

}
