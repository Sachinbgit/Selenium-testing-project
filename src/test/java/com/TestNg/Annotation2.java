package com.TestNg;

import java.awt.Desktop.Action;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation2 {

	
	WebDriver w;
	String parent;
	@BeforeClass   // it is run only once before method in test script
	public void Launch() {
		w= new ChromeDriver();
	}
	@BeforeMethod    // its is run before main test execution
	public void openBrowser() {
		w.get("https://www.flipkart.com/");
		w.manage().window().maximize();
	}
	
	@Test
	public void watch() throws Exception {
		w.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("fastrack watch smart", Keys.ENTER);
		w.findElement(By.partialLinkText("Fastrack Revoltt FS1|1.83 Display|BT Calling|Fastcharge...")).click();
	
		// String parentw = w.getWindowHandle();
		Set<String> Childw = w.getWindowHandles();
		for (String c1 : Childw) {
			if(!c1.equals(parent)) {
				w.switchTo().window(c1);
				Thread.sleep(2000);
				Actions act = new Actions(w);
			
				WebElement add = w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]"));
			     act.moveToElement(add).click().perform();
	
			}
		}
	}
	
	@Test
	public void cap() throws Exception {
		w.findElement(By.cssSelector("input[placeholder='Search for Products, Brands and More']")).sendKeys("cap",Keys.ENTER);
		w.findElement(By.partialLinkText("Sports/Regular Cap")).click();
		String parentw = w.getWindowHandle();
		parent = parentw;
		Set<String> Childw = w.getWindowHandles();
		for (String c1 : Childw) {
			if(!c1.equals(parentw)) {
				w.switchTo().window(c1);
				Thread.sleep(2000);
				Actions act = new Actions(w);
			
				WebElement add = w.findElement(By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]"));
			     act.moveToElement(add).click().perform();
			     w.close();
			     w.switchTo().window(parentw);
			
			}
		}
	}
	
	@AfterClass
	public void quit() throws Exception {
		Thread.sleep(5000);
		w.quit();
	}
	
	
}
