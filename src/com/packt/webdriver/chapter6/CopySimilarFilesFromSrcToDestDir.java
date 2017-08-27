package com.packt.webdriver.chapter6;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

public class CopySimilarFilesFromSrcToDestDir {
	public static void main(String... args){
		try {
			FileHandler.copy(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src/"), new File("D:/From Home/Автоматизация/Ubuntu/Документы/Dest/"), ".odt");
			FileHandler.copy(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src/"), new File("D:/From Home/Автоматизация/Ubuntu/Документы/Dest2/"), "3.odt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}