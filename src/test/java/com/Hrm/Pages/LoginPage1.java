package com.Hrm.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage1 
{
	private WebDriver driver;
	public LoginPage1(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 

	//Locators
	private  By username=By.name("username");
	  //password
	 private By password=By.name("password");
	  //button
	 private By button=By.className("orangehrm-login-button");
	  
	  //Actions 
	 public String getUrl() {
			return driver.getCurrentUrl();
		}
		
		public String getAppTitle() {
			return driver.getTitle();
		}
		
		public String doLogin(String un,String psw)
		{
			driver.findElement(username).sendKeys(un);
			driver.findElement(password).sendKeys(psw);
			driver.findElement(button).click();
			String curl=driver.getCurrentUrl();
			return curl;
		}
	  
	  

}
