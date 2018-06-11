package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ala {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/ermekru/Documents/selenium dependencies/drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cybertek-bnb.herokuapp.com/");
		
	}

}
