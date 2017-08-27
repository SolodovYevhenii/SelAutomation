package com.packt.webdriver.chapter4;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class StoringAndCreatingTheProfile {
	public static void main(String... args){
		FirefoxProfile profile = new FirefoxProfile(new File("C://Users/Евгений/AppData/Roaming/Mozilla/Firefox/Profiles/lir3dkhu.default"));
		String json="";
		try {
			json = profile.toJson();
			System.out.println(json);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			FirefoxDriver driver = new FirefoxDriver(FirefoxProfile.fromJson(json));
			driver.get("http://www.google.com");
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}