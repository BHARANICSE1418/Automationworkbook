package Selenium_Programming;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver","I:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
		 driver.get("https://www.leafground.com/checkbox.xhtml");
		 WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
		 wait.until(ExpectedConditions.elementToBeClickable(By.id("j_idt87:j_idt89"))).click();
	}

}
