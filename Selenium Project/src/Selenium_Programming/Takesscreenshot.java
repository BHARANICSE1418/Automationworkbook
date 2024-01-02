package Selenium_Programming;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Takesscreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\Automation-2022\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	       
	       driver.get("http://demo.guru99.com/V4/");
	       
	        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            
	        try {
	            Files.copy(screenshot, new File("F:\\Automation-2022\\homePageScreenshot.jpg"));
	        } 
	        catch (IOException e) 
	        {
	            System.out.println(e.getMessage());
	        }



	}

}
