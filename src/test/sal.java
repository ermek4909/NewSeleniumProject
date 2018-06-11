package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sal {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver",
				"/Users/ermekru/Documents/selenium dependencies/drivers/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cybertek-bnb.herokuapp.com/");
		
	}

}
