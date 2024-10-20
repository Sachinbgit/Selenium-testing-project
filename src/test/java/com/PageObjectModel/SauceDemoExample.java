package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceDemoExample {

	public static void main(String[] args) throws Exception {
		
		WebDriver cd=new ChromeDriver();
		
		SauceDemoRepo f=new SauceDemoRepo(cd);

		cd.get("https://www.saucedemo.com/v1/");
		cd.manage().window().maximize();
		Thread.sleep(2000);
		f.User();
		Thread.sleep(2000);
		f.Pass();
		Thread.sleep(2000);
		f.Login();
		Thread.sleep(2000);
		
		f.AddToCart();
		Thread.sleep(2000);
		f.CartIcon();
		Thread.sleep(2000);
		f.Checkout();
		Thread.sleep(2000);
		f.Fname();
		Thread.sleep(2000);
		f.Lname();
		Thread.sleep(2000);
		f.ZipCode();
		Thread.sleep(2000);
		f.Continue();
		Thread.sleep(2000);
		f.Finish();
		Thread.sleep(2000);
		f.Hamburger();
		Thread.sleep(2000);
		f.Logout();
		
	}

}
