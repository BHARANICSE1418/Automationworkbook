package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open_chrome
{
	
	public static void main(String[] args) 
	{  
	      
		 System.setProperty("webdriver.chrome.driver","I:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
     driver.navigate().to("http://www.leafground.com/");  
     driver.manage().window().maximize();
     driver.findElement(By.linkText("Edit")).click();
     driver.get("https://www.facebook.com/");
     
	}

}
