package com.Hrm.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest1 extends BaseClass1{
	 
		  @Test(priority=1)
		  public void verifyUrl() 
		  {
			  String curl=lp.getUrl();
			  Assert.assertTrue(curl.contains("demo"),"Fail: Url is not matched");
			  System.out.println("Url is matched!" +curl);
		  }
		  
		  @Test(priority=2)
		  public void verifyTitle() 
		  {
			  String title=lp.getAppTitle();
			  Assert.assertTrue(title.contains("OrangeHRM"),"Fail: Title is not matched");
			  System.out.println("Title is matched!" +title);
		  }
		  
		  @Test(priority=3)
		  public void verifyLogin() 
		  {
			 String curl= lp.doLogin("Admin","admin123");
			  Assert.assertTrue(curl.contains("dashboard"),"Login Fail");
			  System.out.println("Login completed!");
		  }
  }

