package com.packt.webdriver.chapter6;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.io.FileHandler;

public class MakeExecutable {
	public static void main(String... args){
		try {
			FileHandler.makeExecutable(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src/file1.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}