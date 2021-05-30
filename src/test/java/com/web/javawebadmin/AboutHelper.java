package com.web.javawebadmin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AboutHelper {
    WebDriver driver;

    public AboutHelper(WebDriver driver){
        this.driver = driver;
    }

    public void click_button_about() {
        this.driver.findElement(By.xpath("//a[@href='/admin/about']")).click();
    }

    public void about_page_should_be(String result) throws Throwable {
        String url = this.driver.getCurrentUrl();
        if (result.equalsIgnoreCase("Success")){
            Assert.assertEquals("http://localhost:8080/admin/about", url);
        }else {
            Assert.assertNotEquals("http://localhost:8080/admin/about", url);
        }
    }


}
