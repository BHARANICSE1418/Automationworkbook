package Selenium_Programming;


import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class takesscreenshot1 
{
    
	public static void main(String[] args)throws Exception
    {

		   System.setProperty("webdriver.chrome.driver","I:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.get("https://www.facebook.com/login/");
	        
	        TakesScreenshot screenshot = (TakesScreenshot)driver;
	        File source = screenshot.getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(source, new File("F:\\Automation-2022\\homePageScreenshot3.jpg"));
	        System.out.println("the Screenshot is taken");
	        driver.quit();
	       
	      
	     


	}
  
	
}