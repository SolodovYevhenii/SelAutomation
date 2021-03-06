package com.packt.webdriver.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick2AndHandleAlert {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file://E:/Книги/Тестирование/Книги/Автоматизация/Satya Avasarala_Selenium WebDriver Practical Guide_2014/Code/Chapter 2/HTML/DoubleClick.html");
		WebElement dblClick = driver.findElement(By.name("dblClick"));
		Actions builder = new Actions(driver);
		builder.doubleClick(dblClick).perform();
		driver.switchTo().alert().accept();
	}
}