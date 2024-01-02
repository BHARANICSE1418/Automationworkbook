package Selenium_Programming;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class frame {
	
	WebDriver driver;
	String Testleaf="https://www.leafground.com/frame.xhtml";
	String reddy="https://www.hyrtutorials.com/p/frames-practice.html";
	
	@Test(priority=3)
	public void testleafframe() throws InterruptedException
	{
		driver= new ChromeDriver();

		driver.get(Testleaf);
		WebElement ele=driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(ele);	
		driver.findElement(By.xpath("//button[@id='Click']")).click();
		System.out.println("Success1");
		Thread.sleep(5000);
		driver.close();
	}
	@Test(priority=1)
	public void testreddyframe() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get(reddy);
		 driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = driver.findElement(By.xpath("//input[@id='name']"));
	    js.executeScript("arguments[0].scrollIntoView();", Element);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("bharani");
		
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm1']")));	
		WebElement elements=driver.findElement(By.xpath("//select[@id='course']"));
		Select sele=new Select(elements);
		sele.selectByVisibleText("Java");
		
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("dharan");
		System.out.println("Completed Successfully");
	}
	@Test(priority=2)
	public void nestedframe() throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.get(reddy);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    WebElement Element1 = driver.findElement(By.xpath("//input[@id='name']"));
	    js1.executeScript("arguments[0].scrollIntoView();", Element1);
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("bharani");
		System.out.println("ok1");
	
		    JavascriptExecutor js2 = (JavascriptExecutor) driver;
		    WebElement Element2 = driver.findElement(By.xpath("//iframe[@id='frm2']"));
		    js2.executeScript("arguments[0].scrollIntoView();", Element2);
		    driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm2']")));	
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Shalini");
			System.out.println("ok2");
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys(" Shalini");
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm3']")));
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("ShaliniPriya");
			System.out.println("ok3");
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frm2']")));
			driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ShaliniPriya183@gmail.com");
			System.out.println("Completed Successfully");
	}
	
	
	
	/*public static void main(String[] args) throws InterruptedException 
	{
		frame f=new frame();
		//f.testreddyframe();
		f.nestedframe();
		
	}*/

}

