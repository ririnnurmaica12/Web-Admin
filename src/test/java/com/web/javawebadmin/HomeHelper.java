package com.web.javawebadmin;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeHelper {
    WebDriver driver;

    public HomeHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void access_home_page(String result) throws Throwable {
       String url = this.driver.getCurrentUrl();
        if(result.equalsIgnoreCase("Success")){
            Assert.assertEquals("http://localhost:8080/home/getDataCovid", url);
        }else{
            Assert.assertNotEquals("http://localhost:8080/home/getDataCovid", url);
        }
    }

    public void view_data_covid(String result) throws Throwable {
        String text= this.driver.findElement(By.xpath("//h4[@class=\"card-title mb-0\"]")).getText();
        if(result.equalsIgnoreCase("Success")){
            Assert.assertEquals("Covid-19", text);
        }else{
            Assert.assertNotEquals("Covid-19", text);
        }
    }
}
