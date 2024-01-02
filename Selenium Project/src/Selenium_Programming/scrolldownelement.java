package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolldownelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver ;
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\Automation-2022\\chromedriver_win32\\chromedriver.exe");
	        driver = new ChromeDriver();
	        
	        driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        
	        WebElement Element = driver.findElement(By.id("toc4"));
	        
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        

	}

}
