package Selenium_Programming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
  
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/table.xhtml");         
        //No.of Columns
        List <WebElement> col = driver.findElements(By.xpath(""));
        System.out.println("No of cols are : " +col.size()); 
        //No.of rows 
        List <WebElement> rows = driver.findElements(By.xpath("")); 
        System.out.println("No of rows are : " + rows.size());
        driver.close();
	}

}
