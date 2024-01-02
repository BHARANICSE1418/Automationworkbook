package Selenium_Programming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edittest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       System.setProperty("webdriver.chrome.driver","F:\\Automation-2022\\chromedriver_win32\\chromedriver.exe");
       WebDriver edittext = new ChromeDriver();
       edittext.get("http://www.leafground.com/pages/Edit.html");
       WebElement mail=edittext.findElement(By.id("email"));
       mail.sendKeys("bharanicse1418@gmail.com");
       WebElement append = edittext.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
       append.sendKeys("bharani");
       WebElement getword= edittext.findElement(By.name("username"));
       String value =getword.getAttribute("value");
       System.out.println(value);
       WebElement clearword= edittext.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
       clearword.clear();
       WebElement editable= edittext.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
        boolean is= editable.isEnabled();
        System.out.println(is);
       
       
       
	}

}

