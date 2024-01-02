package Selenium_Programming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class linktext 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/block.html");
		
		/*Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.linkText("Inside a block-level tag."));
		action.doubleClick(link).build().perform();*/
		
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 for(WebElement link:allLinks)
		 {
			
			 System.out.println(link.getText()+ " - " +link.getAttribute("href"));
		 }
        
	}

}
