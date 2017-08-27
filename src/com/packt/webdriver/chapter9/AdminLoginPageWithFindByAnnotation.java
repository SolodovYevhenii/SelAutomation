package com.packt.webdriver.chapter9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminLoginPageWithFindByAnnotation {
    WebDriver driver;
    @FindBy (how = How.ID, using = "user_login")
    WebElement email;
    @FindBy (how = How.ID, using = "user_pass")
    WebElement pwd;
    @FindBy (how = How.ID, using = "wp-submit")
    WebElement submit;
    public AdminLoginPageWithFindByAnnotation(WebDriver driver) {
        this.driver = driver;
        driver.get("https://evgsldv.wordpress.com/wp-admin");
    }
    public void login() {
        email.sendKeys("evgsldv");
        pwd.sendKeys("159753_seo");
        submit.click();
    }
}