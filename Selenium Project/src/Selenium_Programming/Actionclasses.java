package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclasses {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
		   driver.get("https://www.amazon.in/");

		
	      WebElement element=driver.findElement(By.name("q"));
		  Actions action= new Actions(driver); 
		  action.sendKeys(element,"facebook").build().perform();
		 
		

		
		 WebElement element1=driver.findElement(By.id("twotabsearchtextbox")); 
		 Actions action1= new Actions(driver);
		  action1.sendKeys(element1,"iphone").build().perform();
		  action1.sendKeys(Keys.ENTER).build().perform();
		
		
		Actions action11 = new Actions(driver);
		WebElement link1 = driver.findElement(By.linkText("Amazon miniTV"));
		action11.doubleClick(link1).build().perform();
		

		Actions action2 = new Actions(driver);
		WebElement link2 = driver.findElement(By.linkText("Amazon miniTV"));
		action2.contextClick(link2).build().perform();
		
		
		System.out.println("1 Success");
		Thread.sleep(5000);
		driver.close();

	}

}
