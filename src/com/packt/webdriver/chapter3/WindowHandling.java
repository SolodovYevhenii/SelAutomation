package com.packt.webdriver.chapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file://E:/Книги/Тестирование/Книги/Автоматизация/Satya Avasarala_Selenium WebDriver Practical Guide_2014/Code/Chapter 3/HTML/Window.html");
		String window1 = driver.getWindowHandle();
		System.out.println("First Window Handle is: " + window1);
		WebElement link = driver.findElement(By.linkText("Google Search"));
		link.click();
		String window2 = driver.getWindowHandle();
		System.out.println("Second Window Handle is: " + window2);
		System.out.println("Number of Window Handles so far: " + driver.getWindowHandles().size());
		driver.switchTo().window(window1);
	}
}