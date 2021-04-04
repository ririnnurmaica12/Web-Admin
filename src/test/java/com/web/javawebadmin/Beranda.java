package com.web.javawebadmin;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Beranda {
    WebDriver driver = new ChromeDriver();
    LoginHelper loginHelper = new LoginHelper(driver);

    @Given("^I is logedin use \"(.*?)\" and \"(.*?)\"$")
    public void i_is_logedin_use_and(String userName, String password) throws Throwable {
        loginHelper.navigate_to_login_page();
        loginHelper.enter_user_name_as(userName);
        loginHelper.enter_password_as(password);
        loginHelper.click_login_button();
    }

    @When("^I access beranda page$")
    public void i_access_beranda_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I view data covid-(\\d+)$")
    public void i_view_data_covid(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
