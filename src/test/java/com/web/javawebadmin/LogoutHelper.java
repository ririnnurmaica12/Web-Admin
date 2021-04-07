package com.web.javawebadmin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutHelper {
    WebDriver driver;

    public LogoutHelper(WebDriver driver){
        this.driver = driver;
    }
    public void click_link_logout() throws Throwable {
        this.driver.findElement(By.xpath("//a[contains(@href, \"/admin/login\")]")).click();
    }

    public void logout_should_be(String result) throws Throwable {
        String url = this.driver.getCurrentUrl();
        if(result.equalsIgnoreCase("Success")){
            Assert.assertEquals("http://localhost:8080/admin/login", url);
        }else {
            Assert.assertNotEquals("http://localhost:8080/admin/login", url);
        }
    }
}
