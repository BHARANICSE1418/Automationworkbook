package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Automation-2022\\chromedriver_win32\\chromedriver.exe");
	       WebDriver editdropdown = new ChromeDriver();
	       editdropdown.get("http://www.leafground.com/pages/Dropdown.html");
	       
	       WebElement drop = editdropdown.findElement(By.id("dropdown1"));
	       Select sel = new Select(drop);
	       sel.selectByIndex(1);
	       Thread.sleep(10000);
	       sel.selectByValue("4");
	       Thread.sleep(10000);
	       sel.selectByVisibleText("Appium");
	       
	       

	       
	       
	       
	       

	}

}
