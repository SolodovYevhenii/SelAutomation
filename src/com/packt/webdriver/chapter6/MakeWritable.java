package com.packt.webdriver.chapter6;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;

public class MakeWritable {
	public static void main(String... args){
		try {
			FileHandler.makeWritable(new File("D:/From Home/Автоматизация/Ubuntu/Документы/Src/file2.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}