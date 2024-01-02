package Selenium_Programming;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_box {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("https://www.leafground.com/alert.xhtml");
	       Thread.sleep(5000);
			
	       driver.findElement(By.id("j_idt88:j_idt91")).click(); 
			 Alert alert=driver.switchTo().alert(); 
			 Thread.sleep(5000); 
			 alert.accept();
			 
	       
			 driver.findElement(By.id("j_idt88:j_idt95")).click();
	       Alert alert1= driver.switchTo().alert();
	       Thread.sleep(5000);
	       alert1.dismiss();
	       
	       
			
	       driver.findElement(By.id("j_idt88:j_idt104")).click(); 
			 Alert prompt= driver.switchTo().alert();
			 Thread.sleep(5000); 
			 prompt.sendKeys("VISHA");
			 prompt.accept();
			 
	}

}
