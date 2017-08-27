package com.packt.webdriver.chapter6;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

public class CreateAndDeleteDirectory {
	public static void main(String... args){
		try {
			FileHandler.createDir(new File("D:/From Home/Автоматизация/Ubuntu/Документы/SelDir"));
			FileHandler.delete(new File("D:/From Home/Автоматизация/Ubuntu/Документы/SelDir"));
			FileHandler.delete(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src2/file44.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}