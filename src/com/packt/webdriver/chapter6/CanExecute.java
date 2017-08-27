package com.packt.webdriver.chapter6;

import java.io.File;
import org.openqa.selenium.io.FileHandler;
import java.io.IOException;

public class CanExecute {
	public static void main(String... args){
		try {
			System.out.println(FileHandler.canExecute(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src/file2.txt")));
			FileHandler.makeExecutable(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src/file2.txt"));
			System.out.println(FileHandler.canExecute(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src/file2.txt")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}