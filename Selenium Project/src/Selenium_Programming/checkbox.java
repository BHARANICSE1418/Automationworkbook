package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/checkbox.html");
	       WebElement check= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div[4]/input"));
	       check.click();
	 WebElement check1= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/input"));
	       
	 if(check1.isSelected())
	 {
		 check1.click();
	 }
	 
	 WebElement check2= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[1]/input"));
	 boolean status=check2.isSelected();
	 System.out.println(status);
	 WebElement check3= driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div[2]/input"));
	 boolean status1=check3.isSelected();
	 System.out.println(status1);
	 
	 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[1]/input")).click();
	 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[2]/input")).click();
	 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[3]/input")).click();
	 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[4]/input")).click();
	 driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div[5]/input")).click();


	
	}

}
