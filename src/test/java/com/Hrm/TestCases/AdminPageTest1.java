package com.Hrm.TestCases;


import org.testng.annotations.Test;



public class AdminPageTest1 extends BaseClass1 {
  @Test(priority=1)
  public void verifyDropDown() 
  {
	  ap.dropDown();  
  }
  @Test(priority=2)
  public void verifySearchByUserName() 
  {
	ap.searchByUserName(); 
	  
  }
  @Test(priority=3)
  public void verifysearchByUserRole() 
  {
	
	  ap.searchByUserRole();
	  
  }
@Test(priority=4)
public void verifysearchByUserStatus() 
{
	ap.searchByUserStatus();
}
}
