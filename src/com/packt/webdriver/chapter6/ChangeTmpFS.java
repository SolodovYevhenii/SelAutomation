package com.packt.webdriver.chapter6;

import java.io.File;
import org.openqa.selenium.io.TemporaryFilesystem;

public class ChangeTmpFS {
	public static void main(String... args) {
		TemporaryFilesystem newTmpFS = TemporaryFilesystem.getTmpFsBasedOn(new File("C:\\TmpFs"));
		File f = newTmpFS.createTempDir("My1", "Directoy1");
		System.out.println(f.getAbsolutePath());
	}
}