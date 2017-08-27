package com.packt.webdriver.chapter5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class IAmTheDriver {
	public static void main(String[] args){
		WebDriver driver = new FirefoxDriver();
		EventFiringWebDriver eventFiringDriver = new EventFiringWebDriver(driver);
		IAmTheEventListener eventListener = new IAmTheEventListener();
		eventFiringDriver.register(eventListener);
		//NAVIGATION RELATED EVENTS
		eventFiringDriver.get("http://www.google.com");
		eventFiringDriver.get("http://www.facebook.com");
		eventFiringDriver.navigate().back();
		eventFiringDriver.navigate().forward();
		eventFiringDriver.navigate().back();
		eventFiringDriver.navigate().refresh();
		//CHANGE OF VALUE RELATED EVENTS
		WebElement searchBox = eventFiringDriver.findElement(By.name("q"));
		searchBox.sendKeys("omgubuntu");
		searchBox.clear();
		//CLICK ON RELATED EVENTS
		searchBox.sendKeys("webdriver");
		WebElement searchButton = eventFiringDriver.findElement(By.name("btnG"));
		searchButton.click();
		//FIND BY RELATED EVENTS
		WebElement enterButton = eventFiringDriver.findElement(By.id("gb_70"));
		enterButton.click();
		driver.close();
	}
}