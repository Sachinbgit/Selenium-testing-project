package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrontAccounting {


	public static void main(String[] args) throws Exception {
	
		 WebDriver cd=new ChromeDriver();
		
		
		 RepoOfFrontAccounting f=new RepoOfFrontAccounting(cd);
		cd.get("https://demo.frontaccounting.eu/");
		Thread.sleep(2000);
		f.Login();
		Thread.sleep(2000);
		f.SaleQ();
		Thread.sleep(2000);
		f.Cancel();
		Thread.sleep(2000);
		f.Popup();
		Thread.sleep(2000);
		f.Back();
		Thread.sleep(2000);
		f.SalesO();
		Thread.sleep(2000);
		f.Cancel();
		Thread.sleep(2000);
		f.Popup();
		Thread.sleep(2000);
		f.Logout();
		
		
	}

}
