package com.packt.webdriver.chapter4;

import java.io.File;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class AddExtensionToProfile {
	public static void main(String... args){
		FirefoxProfile profile = new FirefoxProfile();
		try {
			profile.addExtension(new File("D://From Home/Тестирование/Книги/Автоматизация/Satya Avasarala_Selenium WebDriver Practical Guide_2014/Code/Chapter 4/softwarefirebug-1.12.0-fx.xpi"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		FirefoxDriver driver = new FirefoxDriver(profile); 
		driver.get("http://www.google.com");
	}
}