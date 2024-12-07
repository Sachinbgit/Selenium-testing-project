package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing {

	WebDriver w;
	@Test
	@Parameters("browser")
	//parameters "browser" will find value in xml and name attribute
	// value match with "browser" as a value then it will capture value 
	// attribute value and pass to the string parameter in the method
	
	public void GoogleSearch(String browser) throws Exception
	{
		switch (browser) {
		case "firefox":
			w = new FirefoxDriver();
			break;
		case "edge":
			w = new EdgeDriver();
			break;

		default:
			break;
		}
		
		w.get("https://www.saucedemo.com/");
		w.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		w.quit();
	}
	
	
}
