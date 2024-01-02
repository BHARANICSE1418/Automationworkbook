package Selenium_Programming;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver","I:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       String oldwin= driver.getWindowHandle();
	       driver.get("http://www.leafground.com/pages/Window.html");
	       driver.findElement(By.id("home")).click();
	      Set<String>  handle=driver.getWindowHandles();
	      
	      for (String newwin : handle) {
	    	  driver.switchTo().window(newwin);}
	      
	      driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[3]/a")).click();
	      driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/a")).click();
	      //driver.close();
	      driver.switchTo().defaultContent();
	}

}
