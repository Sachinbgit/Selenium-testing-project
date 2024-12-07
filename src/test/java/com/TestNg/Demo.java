package com.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {

	WebDriver w;
	
	@Test (priority = 2 , invocationCount = 3  )
	public void Amazon()
	{
		w = new ChromeDriver();
		w.get("https://www.amazon.in/");
	}
	
	@Test (priority = 1)
	public void Facebook() {
		
		w = new ChromeDriver();
		w.get("https://www.facebook.com/login");
	}
	
	@Test (priority = 3 , enabled = false)
	public void GoogleSearch()
	{
		w = new ChromeDriver();
		w.get("https://www.google.com/");
	}
}
