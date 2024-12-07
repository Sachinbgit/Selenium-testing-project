package com.TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class DemoParellel {

	@Test
	public void Flipkart() throws InterruptedException {
		WebDriver w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		w.quit();
	}
	
	@Test
	public void SauceDemo() throws InterruptedException
	{
		WebDriver w = new EdgeDriver();
		w.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		w.quit();
	}
	
	
	
}
