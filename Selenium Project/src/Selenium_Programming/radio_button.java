package Selenium_Programming;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio_button {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Automation-2022\\chromedriver_win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       driver.get("http://www.leafground.com/pages/radio.html");
	       
	       driver.findElement(By.id("no")).click();
	       WebElement selected1 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/label[3]/input"));
	       boolean sele1 = selected1.isSelected();
	       System.out.println(sele1);
	       WebElement selected2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[3]"));
	       boolean sele2 = selected2.isSelected();
	       System.out.println(sele2);
	      
	}

}




