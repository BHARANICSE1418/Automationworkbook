package Selenium_Programming;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolldown {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		    WebDriver driver ;
	        driver = new ChromeDriver();
	        
	        driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,5250)", "");

	}

}
