package Selenium_Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isselectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver",
			//	"E:\\Automation-2022\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
           driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	       driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
	       
	     WebElement check1= driver.findElement(By.xpath("//label[@class='ui-btn ui-corner-all ui-btn-inherit ui-btn-icon-left ui-radio-off']"));
	  	 boolean status=check1.isSelected(); 
	  	 System.out.println(status);
	  	 driver.close();

	}

}
