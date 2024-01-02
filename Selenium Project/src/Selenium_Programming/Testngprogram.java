package Selenium_Programming;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngprogram {
    @BeforeMethod
	public void bhar()
	{
		System.out.println("asas-@BeforeMethod");
	}
	@BeforeMethod
	public void bhar1()
	{
		System.out.println("bsbs-@BeforeMethod");
	}
	@AfterMethod
	public void bhar2()
	{
		System.out.println("asas1-@AfterMethod");
	}
	@AfterMethod
	public void bhar12()
	{
		System.out.println("bsbs2-@AfterMethod");
	}
	@BeforeClass
	public void bhar121()
	{
		System.out.println("vsvs-@BeforeClass");
	}
	@AfterClass
	public void bhar1212()
	{
		System.out.println("msms-@AfterClass");
	}
	@Test
	public void bhar12122()
	{
		System.out.println("Cricket-@Test");
	}
	@Test
	public void bhar121221()
	{
		System.out.println("Cricket1-@Test");
	}
}
