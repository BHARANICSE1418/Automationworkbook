package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class getcssvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    
		
		//System.setProperty("webdriver.chrome.driver",
			//	"E:\\Automation-2022\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           
	        driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
	       WebElement k= driver.findElement(By.xpath("//div[@class='doc-header-breadcrumbs mob-breadcrumbs']"));	
	       String val = k.getAttribute("class");
	       System.out.println("Class attribute value: " + val);
	       
	       String s = k.getCssValue("color");
	       String c = Color.fromString(s).asHex();
	       System.out.println("Color is :" + s);
	       System.out.println("Hex code for color:" + c);

	       driver.quit();

	}
}
