package com.packt.webdriver.chapter2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file://E:/Книги/Тестирование/Книги/Автоматизация/Satya Avasarala_Selenium WebDriver Practical Guide_2014/Code/Chapter 2/HTML/Sortable.html");
		Actions builder = new Actions(driver);
		builder.moveByOffset(200, 20).clickAndHold().moveByOffset(120, 0).perform();
	}
}