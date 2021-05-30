package com.web.javawebadmin;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout {
    WebDriver driver = new ChromeDriver();

    LogoutHelper logoutHelper = new LogoutHelper(driver);
    LoginHelper loginHelper = new LoginHelper(driver);

    @Given("^I is logged in use \"(.*?)\" and \"(.*?)\" for test the logout$")
    public void i_is_logged_in_use_and_for_test_the_logout(String userName, String password) throws Throwable {
        loginHelper.navigate_to_login_page();
        loginHelper.enter_user_name_as(userName);
        loginHelper.enter_password_as(password);
        loginHelper.click_login_button();
    }

    @When("^I click link logout$")
    public void i_click_link_logout() throws Throwable {
        logoutHelper.click_link_logout();
    }

    @Then("^Logout should be \"(.*?)\"$")
    public void logout_should_be(String result) throws Throwable {
        logoutHelper.logout_should_be(result);
    }

}
