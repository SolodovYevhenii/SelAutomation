package com.packt.webdriver.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickOnWebElement {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file://E:/Книги/Тестирование/Книги/Автоматизация/Satya Avasarala_Selenium WebDriver Practical Guide_2014/Code/Chapter 2/HTML/Selectable.html");
		WebElement one = driver.findElement(By.name("one"));
		WebElement eleven = driver.findElement(By.name("eleven"));
		WebElement five = driver.findElement(By.name("five"));
		Actions builder = new Actions(driver);
		//Click on one
		builder.click(one);
		builder.build().perform();
		//Click on eleven
		builder.click(eleven);
		builder.build().perform();
		//Click on five
		builder.click(five);
		builder.build().perform();
		//Click on One, Eleven and Five
		builder.click(one).click(eleven).click(five);
		builder.build().perform();
	}
}