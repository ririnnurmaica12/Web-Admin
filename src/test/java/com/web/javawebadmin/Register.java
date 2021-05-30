package com.web.javawebadmin;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {
    WebDriver driver = new ChromeDriver();

    LoginHelper loginHelper = new LoginHelper(driver);
    RegisterHelper registerHelper = new RegisterHelper(driver);
    @Given("^Go to register page$")
    public void go_to_register_page() throws Throwable {
        loginHelper.navigate_to_login_page();
        registerHelper.go_to_register_page();
    }

    @When("^Fill the user name \"(.*?)\"$")
    public void fill_the_user_name(String userName) throws Throwable {
        registerHelper.fill_the_user_name(userName);
    }

    @When("^Fill the email \"(.*?)\"$")
    public void fill_the_email(String email) throws Throwable {
        registerHelper.fill_the_email(email);
    }

    @When("^Fill the password \"(.*?)\"$")
    public void fill_the_password(String password) throws Throwable {
        registerHelper.fill_the_password(password);
    }

    @When("^Fill the first name \"(.*?)\"$")
    public void fill_the_first_name(String firstName) throws Throwable {
        registerHelper.fill_the_first_name(firstName);
    }

    @When("^Fill the last name \"(.*?)\"$")
    public void fill_the_last_name(String lastName) throws Throwable {
        registerHelper.fill_the_last_name(lastName);
    }

    @When("^Fill the address \"(.*?)\"$")
    public void fill_the_address(String address) throws Throwable {
        registerHelper.fill_the_address(address);
    }

    @When("^Click the button submit$")
    public void click_the_button_submit() throws Throwable {
        registerHelper.click_the_button_submit();
    }

    @Then("^Register should be \"(.*?)\"$")
    public void register_should_be(String result) throws Throwable {
        registerHelper.register_should_be(result);
    }
}

