package com.web.javawebadmin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterHelper {
    WebDriver driver;

    public RegisterHelper(WebDriver driver){
        this.driver = driver;
    }
    public void go_to_register_page() throws Throwable {
        this.driver.findElement(By.xpath("//button[@onclick=\"location.href='/admin/register'\"]")).click();
    }

    public void fill_the_user_name(String userName) throws Throwable {
        this.driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
    }

    public void fill_the_email(String email) throws Throwable {
        this.driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
    }

    public void fill_the_password(String password) throws Throwable {
        this.driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public void fill_the_first_name(String firstName) throws Throwable {
        this.driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstName);
    }

    public void fill_the_last_name(String lastName) throws Throwable {
        this.driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastName);
    }

    public void fill_the_address(String address) throws Throwable {
        this.driver.findElement(By.xpath("//input[@name='address']")).sendKeys(address);
    }

    public void click_the_button_submit() throws Throwable {
        this.driver.findElement(By.xpath("//input[@type='submit']")).click();
    }

    public void register_should_be(String result) throws Throwable {

    }
}
