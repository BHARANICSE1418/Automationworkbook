package Selenium_Programming;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdtable {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","I:\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.letcode.in/table");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("----------------Find all the values in 1st table----------------------");
		WebElement table1=driver.findElement(By.id("shopping"));
		List<WebElement> alldata1=table1.findElements(By.tagName("td"));
		for(WebElement data1:alldata1 )
		{
			String getdata1=data1.getText();
			System.out.println(getdata1);
		} 
		System.out.println("---------------Find all the values in 2st table-----------------------");
		
		WebElement table2=driver.findElement(By.id("simpletable"));
		List<WebElement> alldata2=table2.findElements(By.tagName("td"));
		for(WebElement data2: alldata2 )
		{
			String getdata2=data2.getText();
			System.out.println(getdata2);
		} 
		
		System.out.println("----------------find fist value----------------------");
		
		WebElement alltable=driver.findElement(By.id("simpletable"));
		List<WebElement> allvalue= driver.findElements(By.cssSelector("tbody tr"));
		for(WebElement colum1:allvalue )
		{
			List<WebElement> allcolum1=colum1.findElements(By.tagName("td"));
			WebElement firstcolum1=allcolum1.get(0);
			System.out.println(firstcolum1.getText());
		}
		
      System.out.println("----------------find second value----------------------");
		
		WebElement alltable22=driver.findElement(By.id("shopping"));
		List<WebElement> allvalue2= driver.findElements(By.cssSelector("tbody tr"));
		for(WebElement colum2:allvalue2 )
		{
			List<WebElement> allcolum2=colum2.findElements(By.tagName("td"));
			WebElement secondcolum2=allcolum2.get(1);
			System.out.println(secondcolum2.getText());
		}
		System.out.println("----------------present or not----------------------");
		WebElement table12=driver.findElement(By.id("shopping"));
		List<WebElement> alldata12=table12.findElements(By.tagName("td"));
		 String rowValue="" ;
		 
	        for (WebElement webElement : alldata12) {
	            if (webElement.getText().contains("Apple")) {
	               rowValue = webElement.getText();
	            }
	        }
	        System.out.println(rowValue);
	    
			 System.out.println("----------------to get the data from 2nd row and 2nd column directly----------------------");
			 WebElement table111=driver.findElement(By.id("shopping"));
	         WebElement val= table111.findElement(By.xpath("//table/tbody/tr[1]/td[1]"));
	         String valueIneed = val.getText();
			 System.out.println("Cell value is : " + valueIneed);
			 
			 System.out.println("----------------to get the data Total directly----------------------");
			 WebElement total1=driver.findElement(By.id("shopping"));
	         WebElement val1= total1.findElement(By.xpath("//table/tfoot[1]/td[1]/i[1]"));
	         String valueIneed1 = val1.getText();
	         
	         WebElement amount=driver.findElement(By.id("shopping"));
	         WebElement am= amount.findElement(By.xpath("//table/tfoot[1]/td[2]/b[1]"));
	         String amountvalue = am.getText();
	         
			 System.out.println("Total Amount value:" +valueIneed1+"="+amountvalue );
			 
			 System.out.println("----------------2nd table first name and last name----------------------");
			 WebElement name01=driver.findElement(By.id("simpletable"));
	         WebElement n01= name01.findElement(By.xpath("//table[@id='simpletable']/tbody/tr[3]/td[1]"));
	         String firstname = n01.getText();
	         
	         WebElement name02=driver.findElement(By.id("simpletable"));
	         WebElement n02= name02.findElement(By.xpath("//table[@id='simpletable']/tbody/tr[3]/td[2]"));
	         String lastname = n02.getText();
	         
	         WebElement mailid=driver.findElement(By.id("simpletable"));
	         WebElement mailide= mailid.findElement(By.xpath("//table[@id='simpletable']/tbody/tr[3]/td[3]"));
	         String email= mailide.getText();
	         System.out.println("First Last name is= "+firstname+lastname+"  Email= "+email);
			 
	         
	         
			 /*WebElement table1=driver.findElement(By.xpath("//table[@id='simpletable']"));
				List<WebElement> name= driver.findElements(By.cssSelector("tbody"));
				for(WebElement n:name)
				{
					List<WebElement> rk=n.findElements(By.tagName("td"));
					WebElement first=rk.get(3);
					System.out.println(first.getText());}*/
					
		
		
			 driver.quit();
		
		
		
		

	}

}
