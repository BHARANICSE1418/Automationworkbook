package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tooltip {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Automation-2022\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	      
	       driver.get("http://www.leafground.com/pages/tooltip.html");
	       WebElement element=driver.findElement(By.id("age"));
	       
	     String tip= element.getAttribute("title");
	     System.out.println(tip);
	     
	       

	}

}
