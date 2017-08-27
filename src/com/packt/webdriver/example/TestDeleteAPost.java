package com.packt.webdriver.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestDeleteAPost {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        AdminLoginPage loginPage = PageFactory.initElements(driver, AdminLoginPage.class);
        AllPostsPage allPosts = loginPage.login();
        allPosts.deleteAPost("Editing Post using PageObjects");
    }
}