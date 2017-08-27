package com.packt.webdriver.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestPostsCount {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();
        AdminLoginPage loginPage = PageFactory.initElements(driver, AdminLoginPage.class);
        AllPostsPage allPosts = loginPage.login();
        System.out.println(allPosts.getAllPostsCount());
    }
}