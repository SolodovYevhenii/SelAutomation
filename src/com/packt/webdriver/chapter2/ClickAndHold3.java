package com.packt.webdriver.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold3 {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file://E:/Книги/Тестирование/Книги/Автоматизация/Satya Avasarala_Selenium WebDriver Practical Guide_2014/Code/Chapter 2/HTML/Selectable.html");
		WebElement three = driver.findElement(By.name("three"));
		WebElement ten = driver.findElement(By.name("ten"));
		Actions builder = new Actions(driver);
		//Move tile3 to the position of tile10
		builder.moveToElement(three).clickAndHold().moveByOffset(120, 0).release().clickAndHold().release(ten).perform();
	}
}