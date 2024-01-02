package Selenium_Programming;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   System.setProperty("webdriver.chrome.driver","I:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
		driver.get("https://currentaffairs.adda247.com/countries-capital-and-currencies/");

		String innerText = driver.findElement(
				By.xpath("//table/tbody/tr[2]/td[1]")).getText(); 		
		        System.out.println(innerText);
		        
		        String innerText1 = driver.findElement(
						By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 		
				        System.out.println(innerText1);
				        
				        System.out.println("Country= "+innerText+" Capital= "+innerText1);
				        
				        String innerText2 = driver.findElement(
								By.xpath("//table/tbody/tr[10]/td[1]")).getText(); 		
						        System.out.println(innerText2);
						        
						        String innerText3 = driver.findElement(
										By.xpath("//table/tbody/tr[10]/td[2]")).getText(); 		
								        System.out.println(innerText3);
								        
								        System.out.println("Country= "+innerText2+" Capital= "+innerText3);
						
		
	}

}
