package com.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       WebDriver cd=new ChromeDriver();
		 RepoOfFlipkart f = new RepoOfFlipkart(cd);
		 cd.get("https://www.flipkart.com/ ");
		 Thread.sleep(2000);
		 f.search("iphone 15");
		 Thread.sleep(2000);
		 f.product();
		 
		 Thread.sleep(2000);
		 f.windowHandle(cd.getWindowHandle(), cd.getWindowHandles());
		 
		 Thread.sleep(2000);
		 f.AddtoCart();
	}

}
