package com.packt.webdriver.chapter4;

import java.io.File;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxCustomProfile {
	public static void main(String... args){
		FirefoxProfile profile = new FirefoxProfile(new File("C://Users/yevhenii.solodov/AppData/Roaming/Mozilla/Firefox/Profiles/n2w0r4yo.default"));
		FirefoxDriver driver = new FirefoxDriver(profile);
		driver.get("http://www.google.com"); 
	}
}