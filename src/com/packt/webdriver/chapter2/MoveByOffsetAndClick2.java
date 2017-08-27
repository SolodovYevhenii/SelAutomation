package com.packt.webdriver.chapter2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetAndClick2 {
	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("file://E:/Книги/Тестирование/Книги/Автоматизация/Satya Avasarala_Selenium WebDriver Practical Guide_2014/Code/Chapter 2/HTML/Selectable.html");
		WebElement one = driver.findElement(By.name("one"));
		int border = 1;
		int tileWidth = 100;
		int tileHeight = 80;
		Actions builder = new Actions(driver);
		//Click on one
		builder.moveByOffset(one.getLocation().getX() + border, one.getLocation().getY() + border).click();
		builder.build().perform();
		//Click on eleven
		builder.moveByOffset(2*tileWidth + 4*border, 2*tileHeight + 4*border).click();
		builder.build().perform();
		//Click on five
		builder.moveByOffset(-2*tileWidth - 4*border, -tileHeight-2*border).click();
		builder.build().perform();
	}
}