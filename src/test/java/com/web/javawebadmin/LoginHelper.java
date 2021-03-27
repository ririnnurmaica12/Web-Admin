package com.web.javawebadmin;


import org.openqa.selenium.WebDriver;

public class LoginHelper {
    WebDriver driver;

    public LoginHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void navigate_to_login_page() throws Throwable {
        this.driver.get("http://localhost:8080/admin/login");
        this.driver.manage().window().maximize();
    }

    public void enter_user_name_as(String userName) throws Throwable {

    }

    public void enter_password_as(String password) throws Throwable {

    }

    public void click_login_button() throws Throwable {

    }

    public void login_should_be(String arg1) throws Throwable {

    }
}
