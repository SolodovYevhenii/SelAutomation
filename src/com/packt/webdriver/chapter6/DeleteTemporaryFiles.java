package com.packt.webdriver.chapter6;

import java.io.File;
import org.openqa.selenium.io.TemporaryFilesystem;

public class DeleteTemporaryFiles {
	public static void main(String... args) {
		File f1 = TemporaryFilesystem.getDefaultTmpFS().createTempDir("MyTemp1", "Folder1");
		System.out.println("File1: " + f1.getAbsolutePath());
		File f2 = TemporaryFilesystem.getDefaultTmpFS().createTempDir("MyTemp2", "Folder2");
		System.out.println("File2: " + f2.getAbsolutePath());
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		TemporaryFilesystem.getDefaultTmpFS().deleteTemporaryFiles();
	}
}