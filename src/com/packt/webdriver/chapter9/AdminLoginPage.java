package com.packt.webdriver.chapter9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminLoginPage {
    WebDriver driver;
    WebElement email;
    WebElement pwd;
    WebElement submit;
    public AdminLoginPage(WebDriver driver) {
        this.driver = driver;
        driver.get("https://evgsldv.wordpress.com/wp-admin");
        email = driver.findElement(By.id("user_login"));
        pwd = driver.findElement(By.id("user_pass"));
        submit = driver.findElement(By.id("wp-submit"));
    }
    public void login() {
        email.sendKeys("evgsldv");
        pwd.sendKeys("159753_seo");
        submit.click();
    }
}