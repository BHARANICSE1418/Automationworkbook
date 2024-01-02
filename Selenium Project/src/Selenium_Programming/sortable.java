package Selenium_Programming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortable {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","F:\\Automation-2022\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/sortable.html");
	       
	       List<WebElement> element7=driver.findElements(By.xpath("//*[@id='sortable']/li[7]"));
	       System.out.println(element7);
			
			 WebElement fromelement = element7.get(6);
			 System.out.println(fromelement);
			 WebElement toelement= element7.get(0); System.out.println(toelement);
			 
			 Actions action= new Actions(driver); 
			 action.clickAndHold(fromelement);
			 action.moveToElement(toelement); 
			 action.release(toelement);
			 action.build().perform();
			      
	}

}
