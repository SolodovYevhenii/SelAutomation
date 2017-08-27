package com.packt.webdriver.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestEditPost {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        AdminLoginPage loginPage = PageFactory.initElements(driver, AdminLoginPage.class);
        AllPostsPage allPosts = loginPage.login();
        allPosts.editAPost("Creating New Post using PageObject", "Editing Post using PageObjects", "Test framework low maintenance");
    }
}