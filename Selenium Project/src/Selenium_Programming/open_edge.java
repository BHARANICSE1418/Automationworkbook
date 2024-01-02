package Selenium_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class open_edge {
	
	public static void main(String[] args) {  
    
    // System Property for Chrome Driver   
 System.setProperty("webdriver.edge.driver", "F:\\Automation-2022\\edgedriver_win64\\msedgedriver.exe");  
   
      // Instantiate a ChromeDriver class.     
 WebDriver driver = new EdgeDriver();  
   
    // Launch Website  
 driver.navigate().to("http://www.facebook.com/");  
   
  //Maximize the browser  
   driver.manage().window().maximize();
}

}
