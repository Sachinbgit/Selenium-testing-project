package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageFactoryFrontAccounting {

	public static void main(String[] args) throws Exception {
		
          WebDriver w=new ChromeDriver();
          w.get("https://demo.frontaccounting.eu/index.php");
          w.manage().window().maximize();
          Thread.sleep(2000);
          FrontAccountingRepoWithPageFactory r=new FrontAccountingRepoWithPageFactory(w);
          r.loginclear();
          Thread.sleep(2000);
          r.EnterLoginData();
          Thread.sleep(2000);
          r.login();
          Thread.sleep(2000);
          r.logout();
	}

}
