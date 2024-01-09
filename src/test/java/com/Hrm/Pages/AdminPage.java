package com.Hrm.Pages;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AdminPage{
 private WebDriver driver;
 public AdminPage(WebDriver driver){
	 this.driver=driver;}
 private By list=By.xpath("//ul[@class='oxd-main-menu']//li"); 
 private By usernameinputbox = By.xpath("(//div//input[@class='oxd-input oxd-input--active'])[2]");
 private By search= By.xpath("//div//button[@type='submit']");
 private By totalrecord1=By.xpath("//span[text()='(1) Record Found']");
 private By dropdown1=By.xpath("(//div[@class='oxd-select-text--after']//i)[1]");
 private By admin1 =By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']//span[text()='Admin']");
 private By totalrecord2= By.xpath("//span[text()=' (10) Records Found']");
 private By dropdown2=By.xpath("(//div[@class='oxd-select-text--after']//i)[2]");
 private By enable=By.xpath("(//div[text()='Enabled'])[1]");  
 private By totalrecord3=By.xpath("//span[text()=' (42) Records Found']");
 private By list12=By.xpath("//ul[@class='oxd-main-menu']");
public void dropDown(){
	String d=driver.findElement(list12).getText();
	System.out.println(d);
    List<WebElement> l1= driver.findElements(list);
    System.out.println("Total options are: "+l1.size());
    for(WebElement j:l1) {
	   if(j.getText().equals("Admin")){
		 j.click();
		  System.out.println("Clicked on the admin option");
		  break;}}}
 public void searchByUserName(){
	 driver.findElement(usernameinputbox).sendKeys("Admin");
	 driver.findElement(search).click();
	 String text= driver.findElement(totalrecord1).getText();
	 System.out.println("Total record of Users with Admin as username: "+text);
	 driver.navigate().refresh();}
 public void searchByUserRole() {
	 driver.findElement(dropdown1).click();
	 driver.findElement(admin1).click();
	 driver.findElement(search).click();
	 String text2= driver.findElement(totalrecord2).getText();
	 System.out.println("Total record of Users with Admin as userrole: "+text2);
	 driver.navigate().refresh();}
public void searchByUserStatus() {
	 driver.findElement(dropdown2).click();
	 driver.findElement(enable).click();
	 driver.findElement(search).click();
	 String text3=driver.findElement(totalrecord3).getText();
	 System.out.println("Total record of Users with Enabled status: "+text3);  }}
 
 
 
 
 


