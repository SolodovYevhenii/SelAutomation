package com.packt.webdriver.chapter3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchBetweenFrames {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file://E:/Книги/Тестирование/Книги/Автоматизация/Satya Avasarala_Selenium WebDriver Practical Guide_2014/Code/Chapter 3/HTML/Frames.html");
		driver.switchTo().frame(0);
		WebElement txt = driver.findElement(By.name("1"));
		txt.sendKeys("I'm Frame One");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		txt = driver.findElement(By.name("2"));
		txt.sendKeys("I'm Frame Two");
	}
}