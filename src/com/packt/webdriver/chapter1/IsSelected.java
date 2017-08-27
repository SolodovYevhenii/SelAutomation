package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsSelected {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ukr.net");
		WebElement checkBox = driver.findElement(By.id("anoc"));
		System.out.println(checkBox.isSelected());
	}
}