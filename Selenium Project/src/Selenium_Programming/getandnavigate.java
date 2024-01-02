package Selenium_Programming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getandnavigate {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"F:\\Automation-2022\\chromedriver_win32\\chromedriver.exe");
		       WebDriver alertbox = new ChromeDriver();
		       alertbox.get("http://www.leafground.com/pages/Alert.html");

	}

}
