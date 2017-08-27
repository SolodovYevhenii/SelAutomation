package com.packt.webdriver.chapter5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class IAmTheEventListener implements WebDriverEventListener {
////////// NAVIGATION RELATED METHODS ///////////////
	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigate To: " + url + " and Current url is: " + driver.getCurrentUrl());
	}
	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigate To: " + url + " and Current url is: "+ driver.getCurrentUrl());
	}
	@Override
	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before Navigate Back. Right now I'm at " + driver.getCurrentUrl());
}
	@Override
	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After Navigate Back. Right now I'm at " + driver.getCurrentUrl());
	}
	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Before Navigate Forward. Right now I'm at " + driver.getCurrentUrl());
	}
	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("After Navigate Forward. Right now I'm at " + driver.getCurrentUrl());
	}
	@Override
	public void beforeNavigateRefresh(WebDriver driver) {
		System.out.println("Before Navigate Refresh");
	}
	@Override
	public void afterNavigateRefresh(WebDriver driver) {
		System.out.println("After Navigate Refresh");
	}
/////////////////// FIND BY RELATED METHODS ///////////////
	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before Find By Event");
	}
	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("After Find By Event");
	}
//////////////////// CLICK ON RELATED METHODS ///////////////
	@Override
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before Click On Event");
	}
	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After Click On Event");
	}
///////////////// CHANGE OF VALUE RELATED METHODS //////////////
	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("Before Change Value Of Event");
	}
	@Override
	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		System.out.println("After Change Value Of Event");
	}
/////////////// SCRIPT EXECUTION RELATED METHODS ///////////////
	@Override
	public void beforeScript(String script, WebDriver driver) {
		System.out.println("Before Script Event");
	}
	@Override
	public void afterScript(String script, WebDriver driver) {
		System.out.println("After Script Event");
	}
/////////////// EXCEPTION RELATED METHODS ///////////////////////
	@Override
	public void onException(Throwable throwable, WebDriver driver) {
		System.out.println("On Exception");
	}
}