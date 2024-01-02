package Selenium_Programming;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardandsoftasseertion
{

	
		@Test(priority=0)
		public void softAssert()
		{
			SoftAssert  soft = new SoftAssert();
			System.out.println("soft_sarted");
			soft.assertTrue(false);
			System.out.println("soft_ended");			
		}
//        @Test(priority=1)
//	    public void hardAssert() 
//	    {
//
//        	System.out.println("hard_sarted");
//			Assert.assertTrue(false);
//			System.out.println("hard_ended");	
//	    	
//	    }

}
