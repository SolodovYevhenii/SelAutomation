package com.packt.webdriver.chapter9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestDeletePost {
    public static void main(String... args) {
        WebDriver driver = new FirefoxDriver();

        // Login to Admin portal
        driver.get("https://evgsldv.wordpress.com/wp-admin");
        WebElement email = driver.findElement(By.id("user_login"));
        WebElement pwd = driver.findElement(By.id("user_pass"));
        WebElement submit = driver.findElement(By.id("wp-submit"));
        email.sendKeys("evgsldv");
        pwd.sendKeys("159753_seo");
        submit.click();

        // Go to All Posts page
        driver.get("https://evgsldv.wordpress.com/wp-admin/edit.php");

        // Click on the post to be deleted
        WebElement post = driver.findElement(By.linkText("My First Post"));
        post.click();

        // Delete Post
        WebElement publish = driver.findElement(By.linkText("Move to Trash"));
        publish.click();
    }
}