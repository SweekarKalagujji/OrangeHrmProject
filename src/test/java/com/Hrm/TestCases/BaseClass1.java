package com.Hrm.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.Hrm.Pages.AdminPage1;
import com.Hrm.Pages.LoginPage1;

public class BaseClass1 {
	public WebDriver driver;
	public LoginPage1 lp;
	public AdminPage1 ap;
	
	@BeforeTest
	public void setUpBrowser() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp= new LoginPage1(driver);
		ap= new AdminPage1(driver);
		
	}
	@BeforeClass
	public void pageSetUp() {
		System.out.println("*************Login page*****************");
		System.out.println("Url is: "+lp.getUrl());
		System.out.println("Title is: "+lp.getAppTitle());
		lp.doLogin("Admin","admin123");
		Reporter.log("Log: Login is completed with valid data set",true);
		System.out.println("*************Admin page*****************");
		
	}

}
