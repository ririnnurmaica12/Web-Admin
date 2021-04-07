package com.web.javawebadmin;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
    WebDriver driver = new ChromeDriver();

    LogoutHelper logoutHelper = new LogoutHelper(driver);

    @When("^I click link logout$")
    public void i_click_link_logout() throws Throwable {
        logoutHelper.click_link_logout();
    }

    @Then("^Logout should be \"(.*?)\"$")
    public void logout_should_be(String result) throws Throwable {
        logoutHelper.logout_should_be(result);
    }

}
