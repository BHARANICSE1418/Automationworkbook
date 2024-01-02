package Selenium_Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class impliciwait {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	     
	     driver.get("https://www.leafground.com/checkbox.xhtml");
	     WebElement check3= driver.findElement(By.id("j_idt87:basic:1"));
		 boolean status1=check3.isSelected();
		 System.out.println(status1);
		 System.out.println("1 Success");
		 driver.quit();

	}

}
