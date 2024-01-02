 package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class button {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","E:\\Automation-2022\\chromedriver_win32\\chromedriver.exe");
	       WebDriver editbutton = new ChromeDriver();
	       editbutton.get("http://www.leafground.com/pages/Button.html");
	       WebElement pos= editbutton.findElement(By.id("position"));
	       Point xypoint= pos.getLocation();
	        int xval= xypoint.getX();
	        int yval= xypoint.getY();
	        System.out.println(xval+" "+yval);
	        WebElement col= editbutton.findElement(By.id("color"));
	        String color=col.getCssValue("background-color");
	        System.out.println(color);
	        WebElement high= editbutton.findElement(By.id("size"));
	        int height = high.getSize().getHeight();
	        int weight = high.getSize().getWidth();
	        System.out.println(height+" "+weight);	      

	}

}
