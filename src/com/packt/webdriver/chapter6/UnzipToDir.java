package com.packt.webdriver.chapter6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.Zip;

public class UnzipToDir {
	public static void main(String... args) {
		Zip z = new Zip();
		try {
			z.unzip(new File("C:\\TmpFS.zip"), new File("C:\\TestZip\\"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}