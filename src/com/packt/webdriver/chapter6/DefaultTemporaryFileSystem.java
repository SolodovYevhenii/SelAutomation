package com.packt.webdriver.chapter6;

import java.io.File;
import org.openqa.selenium.io.TemporaryFilesystem;

public class DefaultTemporaryFileSystem {
	public static void main(String... args) {
		File f = TemporaryFilesystem.getDefaultTmpFS().createTempDir("MyTemp", "Folder");
		System.out.println(f.getAbsolutePath());
		try {
			Thread.sleep(15000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}