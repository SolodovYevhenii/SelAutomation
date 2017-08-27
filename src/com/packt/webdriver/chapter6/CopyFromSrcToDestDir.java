package com.packt.webdriver.chapter6;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

public class CopyFromSrcToDestDir {
	public static void main(String... args){
		try {
			FileHandler.copy(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src/"), new File("D:/From Home/Автоматизация/Ubuntu/Документы/Dest/"));
			FileHandler.copy(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Dest/file1.txt"), new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src2/file1.txt"));
			FileHandler.copy(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src/"), new File("D:/From Home/Автоматизация/Ubuntu/Документы/Dest/"), ".odt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}