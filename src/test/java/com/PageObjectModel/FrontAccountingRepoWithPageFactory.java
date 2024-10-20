package com.PageObjectModel;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrontAccountingRepoWithPageFactory {

	public FrontAccountingRepoWithPageFactory(WebDriver w)
	{
		PageFactory.initElements(w, this);
	}
	
	@FindBy(name = "user_name_entry_field")
	WebElement Username;
	@FindBy(name ="password")
	WebElement Password;
	@FindBy(name="SubmitUser")
	WebElement login;
	@FindBy(linkText ="Logout")
	WebElement Logout;
	@FindBy(linkText = "Click here to Login Again.")
	WebElement loginAgain;
	
	public void loginclear() {
		Username.clear();
		Password.clear();
	}
    public void EnterLoginData() {
    	Username.sendKeys("demouser");
    	Password.sendKeys("password");
    }
    public void login() {
    	login.click();
    }
    public void logout() {
    	Logout.click();
    	loginAgain.click();
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
