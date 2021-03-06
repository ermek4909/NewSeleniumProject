package test;

	import java.util.Random;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;

	public class SeleniumDemo {
		
		public static void main(String[] args) throws InterruptedException {
			
			// Telling to system to use chrome driver at the given path when trying to launch a browser  // esens code
			System.setProperty("webdriver.chrome.driver", "/Users/ermekru/Documents/selenium dependencies/drivers");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://cybertek-bnb.herokuapp.com");
			
			String title = driver.getTitle();
			String url = driver.getCurrentUrl();
			System.out.println("Title: " + title);
			System.out.println("Url: " + url);
			if(title.equals("Intro | cybertek-bnb")) {
				System.out.println("Title verification passed");
			}
			else {
				System.out.println("Title verification failed");
			}
			
			Random random = new Random();
			int r = random.nextInt(100000);
			String firstName = "John";
			String lastName = "Wick";
			String email = "jwi" + r + "@yahoo.com";
			String password = "JW2018";
			System.out.println("Email: " + email);
			
			WebElement signUpBtn = driver.findElement(By.linkText("sign up"));
			signUpBtn.click();
//			
			
			WebElement fName = driver.findElement(By.name("first-name"));
			WebElement lName = driver.findElement(By.name("last-name"));
			WebElement eMail = driver.findElement(By.name("email"));
			WebElement passwordEl = driver.findElement(By.name("password"));
			WebElement signUp = driver.findElement(By.xpath("//button[.='sign up']"));
			
			fName.sendKeys(firstName);
			lName.sendKeys(lastName);
			eMail.sendKeys(email);
			passwordEl.sendKeys(password);
			signUp.click();
			
			if(driver.getTitle().equals("Sing in | cybertek-bnb")) {
				System.out.println("Sign up successfully");
			}
			else {
				System.out.println("Sign up failed");
			}
			
			driver.findElement(By.name("email")).sendKeys(email);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//button[.='sign in']")).click();
			
			String loggedInTitle = driver.getTitle();
			if(loggedInTitle.equals("Map | cybertek-bnb")) {
				System.out.println("User signed - in successfully");
			}
			else {
				System.out.println("User signed - in failed");
			}
		
///////////////////////////////////////////////////////////////////////////////////////////		
	    
//		public static void main(String[] args)throws InterruptedException{   // my code 
//			
//			System.setProperty("webdriver.chrome.driver",
//					"/Users/ermekru/Documents/selenium dependencies/drivers/chromedriver");
//			
//			
//			WebDriver driver = new ChromeDriver();
//			driver.get("https://cybertek-bnb.herokuapp.com/");
//			
//			
//			String title = driver.getTitle();
//			driver.getCurrentUrl();
//			System.out.println("Title: "+title);
//			// System.out.println("Url: "+url);
//			
//			
//			
//			if(title.equals("Intro | cybertek-bnb")) {
//				System.out.println("Title verification passed");
//			}
//			else {
//				System.out.println("Title verification failed");
//			}
//			
//			Random rd = new Random();
//			int temp = rd.nextInt(10000);
//			String firstName ="John";
//			String lastName = " Wick";
//			String email= "a"+temp+ "jnr123@yahoo.com";
//			String password = "B2018123";
//			  System.out.println("Email: "+email);
//			  
//			  WebElement signUpBth = driver.findElement(By.linkText("sign up"));
//			  signUpBth.click();
//			  
//			  WebElement fName = driver.findElement(By.linkText("first-name"));
//			  WebElement IName = driver.findElement(By.linkText("last-name"));
//			  WebElement eMail = driver.findElement(By.linkText("email"));
//			  WebElement signUp = driver.findElement(By.linkText("//button[.='sign up']"));
//			
//			  
//			driver.findElement(By.linkText("sign up")).click();
////			Thread.sleep(2000);
//			driver.findElement(By.name("first-name")).click();
//			driver.findElement(By.name("first-name")).sendKeys(firstName);
//			driver.findElement(By.name("last-name")).sendKeys(lastName);
//			driver.findElement(By.name("email")).sendKeys(email);
//			driver.findElement(By.name("password")).sendKeys(password);
////			Thread.sleep(2000);  // time like step by step, every 2 seconds
//			driver.findElement(By.xpath("//button[.='sign up']")).click();
//			
//			
//			
//			if(driver.getTitle().equals("Sing in | cybertek-bnb")) {
//				System.out.println("Sign in successfully");
//			}
//			else {
//				System.out.println("Sign up failed");
//			}
//
//			
//			driver.findElement(By.name("email")).sendKeys(email);
//			driver.findElement(By.name("password")).sendKeys(password);
//			driver.findElement(By.xpath("//button[.='sign up']")).click();
//
//			
//			String loggenTitle = driver.getTitle();
//			if(loggenTitle.equals("Map | cybertek-bnb")) {
//				System.out.println("User sign in successfully");
//			}
//			else {
//				System.out.println("Sign up failed");
//			}
 
			
			//driver.quit();
			
/////////////////////////////////////////////////////////////////////////////
			
//		public static void main(String[] args) throws InterruptedException {   /// husein code
//			
//			
//			System.setProperty("webdriver.chrome.driver","/Users/ermekru/Documents/selenium dependencies/drivers" );
//			WebDriver driver = new ChromeDriver();
//			driver.get("http://cybertek-bnb.herokuapp.com/");
//			String title = driver.getTitle();
//			System.out.println("Title:" +title);
//			String url= driver.getCurrentUrl();
//			System.out.println("Url: "+ url);
//			
//			
//			
//			if (title.equals("Intro | cybertek-bnb")) {
//				System.out.println("Title verification passed");
//				
//			}
//			
//			else {
//				System.out.println("Title verification failed");
//			}
//			Random random=new Random();
//			int r=random.nextInt(1000);
//			String firsName="Huso";
//			String lastName="Al";
//			String email="alt"+r+"@hotmail.com";
//			String password= "JW2018";
//			
//			driver.findElement(By.linkText("sign up")).click();
//			
////			Thread.sleep(2000);
//			
//			driver.findElement(By.name("first-name")).sendKeys(firsName);
//			driver.findElement(By.name("last-name")).sendKeys(lastName);
//			driver.findElement(By.name("email")).sendKeys(email);
//			driver.findElement(By.name("password")).sendKeys(password);
//			
////			driver.findElement(By.className("button is-dark")).click();
//			
//			driver.findElement(By.xpath("//button[.='sign up']")).click();
//			
//			if (driver.getTitle().equals("Sing in | cybertek-bnb")) {
//				System.out.println("sign up successfully");
//				
//			}
//			else {
//				System.out.println("sign up failed");
//			}
//			
//			driver.findElement(By.name("email")).sendKeys(email);
//			driver.findElement(By.name("password")).sendKeys(password);
//			driver.findElement(By.xpath("//button[.='sign in']")).click();
//			
//			String loggedInTitle = driver.getTitle();
//			if(loggedInTitle.equals("Map | cybertek-bnb")) {
//				System.out.println("User signed - in successfully");
//			}
//			else {
//				System.out.println("user signed - in failed");
//			}
			
			
			
		
		}
}
