package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook_automation {

	public static void main(String[] args) throws InterruptedException {
	
		 System.setProperty("webdriver.chrome.driver", "E:\\Automation-2022\\chromedriver.exe");  
		 ChromeOptions ops = new ChromeOptions();
         ops.addArguments("--disable-notifications");
		 WebDriver driver=new ChromeDriver(ops);  
	     driver.navigate().to("http://www.facebook.com/");
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.id("email")).sendKeys("thillbharani@gmail.com");
	     driver.findElement(By.id("pass")).sendKeys("9965927128");
	     driver.findElement(By.name("login")).click();
	   
        
	}

}
