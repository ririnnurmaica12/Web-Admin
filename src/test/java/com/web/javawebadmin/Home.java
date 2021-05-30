package com.web.javawebadmin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Home {
    WebDriver driver = new ChromeDriver();
    LoginHelper loginHelper = new LoginHelper(driver);
    HomeHelper homeHelper = new HomeHelper(driver);

    @Given("^I is logged in use \"(.*?)\" and \"(.*?)\"$")
    public void i_is_logged_in_use_and(String userName, String password) throws Throwable {
        loginHelper.navigate_to_login_page();
        loginHelper.enter_user_name_as(userName);
        loginHelper.enter_password_as(password);
        loginHelper.click_login_button();
    }

    @When("^I access home page \"(.*?)\"$")
    public void i_access_home_page(String result) throws Throwable {
        homeHelper.access_home_page(result);
    }

    @Then("^I view data covid \"(.*?)\"$")
    public void i_view_data_covid(String result) throws Throwable {
        homeHelper.view_data_covid(result);
    }

}
