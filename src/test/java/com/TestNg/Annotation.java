package com.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {

	WebDriver w;
	@BeforeMethod  // Pre conditions  --->search ---> shoes and mobile
	
	public void openBrowser()
	{
		w = new ChromeDriver();
		w.get("https://www.flipkart.com/");
	}
	
	@Test
	public void shoes() {
		w.findElement(By.name("q")).sendKeys("shoes",Keys.ENTER);
		w.findElement(By.partialLinkText("Lace Up For Men")).click();
	}
@Test
public void mobile() {
	w.findElement(By.name("q")).sendKeys("Mobile",Keys.ENTER);
	w.findElement(By.partialLinkText("Apple iPhone 15 (Black, 128 GB)")).click();
}
	
@AfterMethod
public void quit() {
	
	w.quit();
}
}
