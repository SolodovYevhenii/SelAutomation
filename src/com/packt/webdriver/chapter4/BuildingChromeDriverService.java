package com.packt.webdriver.chapter4;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BuildingChromeDriverService {
	public static void main(String... args){
		System.setProperty("webdriver.chrome.driver", "C://Users/yevhenii.solodov/chromedriver_win32/chromedriver.exe");
		ChromeDriverService.Builder builder = new ChromeDriverService.Builder();
		ChromeDriverService srvc = builder.usingDriverExecutable(new File("C://Users/yevhenii.solodov/chromedriver_win32/chromedriver.exe")).usingPort(9515).build();
		try {
			srvc.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		WebDriver driver = new ChromeDriver(srvc);
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("omgubuntu");
		driver.quit();
		srvc.stop();
	}
}