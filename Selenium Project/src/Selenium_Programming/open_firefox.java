package Selenium_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class open_firefox {
	
	public static void main(String[] args) {  
	      
        // System Property for Chrome Driver   
     System.setProperty("webdriver.gecko.driver", "F:\\Automation-2022\\geckodriver-v0.30.0-win64 (1)\\geckodriver.exe");  
       
          // Instantiate a ChromeDriver class.     
     WebDriver driver = new FirefoxDriver();  
       
        // Launch Website  
     driver.navigate().to("http://www.javatpoint.com/");  
       
      //Maximize the browser  
       driver.manage().window().maximize();
	}

}
