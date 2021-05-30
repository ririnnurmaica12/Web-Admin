package com.web.javawebadmin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class About {
    WebDriver driver = new ChromeDriver();

    AboutHelper aboutHelper = new AboutHelper(driver);
    LoginHelper loginHelper = new LoginHelper(driver);

    @Given("^I is logged in use \"(.*?)\" and \"(.*?)\" for test about page$")
    public void i_is_logged_in_use_and_for_test_about_page(String userName, String password) throws Throwable {
        loginHelper.navigate_to_login_page();
        loginHelper.enter_user_name_as(userName);
        loginHelper.enter_password_as(password);
        loginHelper.click_login_button();
    }
    @When("^I click button about$")
    public void i_click_button_about() {
        aboutHelper.click_button_about();
    }

    @Then("^About page should be \"(.*?)\"$")
    public void about_page_should_be(String result) throws Throwable {
        aboutHelper.about_page_should_be(result);
    }

}
