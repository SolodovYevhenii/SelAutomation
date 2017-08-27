package com.packt.webdriver.chapter6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.Zip;

public class ZipDir {
	public static void main(String... args) {
		Zip z = new Zip();
		try {
			z.zip(new File("C:\\TmpFS"), new File("C:\\TmpFS.zip"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}