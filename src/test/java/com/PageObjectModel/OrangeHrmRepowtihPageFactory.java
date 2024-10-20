package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHrmRepowtihPageFactory {

	public  OrangeHrmRepowtihPageFactory(WebDriver w) {
		PageFactory.initElements(w,this);
	}
	
	@FindBy(css="input[placeholder='Username']")
	WebElement USername;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement Login;
	@FindBy( className ="oxd-userdropdown")
	WebElement Dropdown;
	@FindBy( linkText="Logout")
	WebElement Logout;
	
	public void logindata()
	{
		USername.sendKeys("Admin");
		Password.sendKeys("admin123");
	}
	 public void login()
	 {
		 Login.click();
	 }
	 
	 public void dropdown() {
		 Dropdown.click();
	 }
	 
	 public void logout() {
		 Logout.click();
	 }
	
	
	
	
	
	
}
