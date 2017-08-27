package com.packt.webdriver.chapter9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestAddNewPostUsingPageObject {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();

        // Login to Admin portal
        //AdminLoginPage admLoginPage = new AdminLoginPage(driver);
        //admLoginPage.login();

        // Login to Admin portal using PageFactory
        //AdminLoginPageWithFindByAnnotation admLoginPage = PageFactory.initElements(driver, AdminLoginPageWithFindByAnnotation.class);
        //admLoginPage.login();

        // Login to Admin portal using LoadableComponent
        AdminLoginPageUsingLoadableComponent admLoginPage = new AdminLoginPageUsingLoadableComponent(driver).get();
        AllPostsPage allPosts = admLoginPage.login();

        // Go to All Posts page
        driver.get("https://evgsldv.wordpress.com/wp-admin/edit.php");

        // Add new post
        WebElement addNewPost = driver.findElement(By.linkText("Add New"));
        addNewPost.click();

        // Add New Post
        driver.switchTo().frame("content_ifr");
        WebElement postBody = driver.findElement(By.id("tinymce"));
        postBody.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry. " +
                "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, " +
                "when an unknown printer took a galley of type and scrambled it to make a type " +
                "specimen book. It has survived not only five centuries, but also the leap into " +
                "electronic typesetting, remaining essentially unchanged. " +
                "It was popularised in the 1960s with the release of Letraset sheets containing " +
                "Lorem Ipsum passages, and more recently with desktop publishing software like " +
                "Aldus PageMaker including versions of Lorem Ipsum.");
        driver.switchTo().defaultContent();
        WebElement title = driver.findElement(By.id("title"));
        title.click();
        title.sendKeys("My First Post");
        WebElement publish = driver.findElement(By.id("publish"));
        publish.click();
    }
}