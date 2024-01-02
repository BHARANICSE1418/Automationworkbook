package Selenium_Programming;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileuplaod 
{

	WebDriver driver;
	
		
	public void uploadusingsendkeys()
	{
		driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
		driver.findElement(By.xpath("//input[@name='userfile']")).sendKeys("C:\\Users\\Hp\\Desktop\\interview.txt");	
	}
	public void downloadusingsendkeys()
	{
		driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dwsamplefiles.com/download-pptx-sample-files/");
		driver.findElement(By.linkText("Download Sample1.PPTX")).click();		
	}
	public void uploadusingrobotclass() throws AWTException
	{
       driver= new ChromeDriver();
       driver.manage().deleteAllCookies();
       driver.get("https://demo.guru99.com/selenium/upload/");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.findElement(By.xpath("//*[@id='uploadfile_0']")).click();
       StringSelection upload = new StringSelection("C:\\Users\\Hp\\Desktop\\interview.txt");
       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(upload, null);
       Robot robot = new Robot();
       robot.delay(250);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.keyRelease(KeyEvent.VK_ENTER);
       robot.keyPress(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_V);
       robot.keyRelease(KeyEvent.VK_CONTROL);
       robot.keyPress(KeyEvent.VK_ENTER);
       robot.delay(90);
       robot.keyRelease(KeyEvent.VK_ENTER);
	   System.out.println("Success");
	    }
		public void downloadusingrobotclass()
		{
			driver= new ChromeDriver();
			
		}
	
	public static void main(String[] args) throws AWTException
	{
		Fileuplaod updownload= new Fileuplaod();
		updownload.uploadusingrobotclass();
	}

}
