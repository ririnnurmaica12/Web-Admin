package com.web.javawebadmin;


import org.junit.Assert;
import org.openqa.selenium.By;
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
        this.driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(userName);
    }

    public void enter_password_as(String password) throws Throwable {
        this.driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(password);

    }

    public void click_login_button() throws Throwable {

        this.driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

    }

    public void login_should_be(String result) throws Throwable {
        String url = this.driver.getCurrentUrl();
        if (result.equalsIgnoreCase("Success")){
            Assert.assertNotEquals("http://localhost:8080/admin/login", url);
        }else{
            Assert.assertEquals("http://localhost:8080/admin/login", url);
        }
    }
}
