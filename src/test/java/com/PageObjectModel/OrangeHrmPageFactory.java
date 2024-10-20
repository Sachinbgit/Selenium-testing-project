package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmPageFactory {

	public static void main(String[] args) throws Exception {
		
		WebDriver w=new ChromeDriver();
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		w.manage().window().maximize();
		OrangeHrmRepowtihPageFactory r=new OrangeHrmRepowtihPageFactory(w);
		Thread.sleep(2000);
		 r.logindata();
		 Thread.sleep(2000);
		 r.login();
		 Thread.sleep(2000);
		 r.dropdown();
		 Thread.sleep(2000);
		 r.logout();
		 
	}

}
