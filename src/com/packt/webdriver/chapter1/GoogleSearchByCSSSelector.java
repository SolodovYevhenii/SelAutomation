package com.packt.webdriver.chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchByCSSSelector {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement Button = driver.findElement(By.cssSelector("#gb_70"));
		WebElement linkAboutGoogle = driver.findElement(By.cssSelector("#fsl>a[href='//www.google.com.ua/intl/ru/about.html?fg=1'"));
		System.out.println("searchButton is " + Button.getText());
		System.out.println("linkAboutGoogle is " + linkAboutGoogle.getText());
	}
}