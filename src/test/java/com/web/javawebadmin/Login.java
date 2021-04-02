package com.web.javawebadmin;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    WebDriver driver = new ChromeDriver();
    LoginHelper loginHelper = new LoginHelper(driver);
    @Given("^I navigate to login page$")
    public void i_navigate_to_login_page() throws Throwable {
        loginHelper.navigate_to_login_page();
    }

    @When("^I enter user name as \"(.*?)\"$")
    public void i_enter_user_name_as(String userName) throws Throwable {
        loginHelper.enter_user_name_as(userName);
    }

    @When("^I enter password as \"(.*?)\"$")
    public void i_enter_password_as(String password) throws Throwable {
        loginHelper.enter_password_as(password);
    }

    @When("^I click login button$")
    public void i_click_login_button() throws Throwable {
        loginHelper.click_login_button();
    }

    @Then("^Login should be \"(.*?)\"$")
    public void login_should_be(String result) throws Throwable {
        loginHelper.login_should_be(result);
    }

}
