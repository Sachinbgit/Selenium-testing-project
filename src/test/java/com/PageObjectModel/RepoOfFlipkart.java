package com.PageObjectModel;

import java.awt.RenderingHints.Key;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
// By using ctrl+ shit+o we can import all the packages at once
public class RepoOfFlipkart {
	
	WebDriver w;
	public RepoOfFlipkart(WebDriver wd)
	{
		w=wd;
		// WebDriver w =new ChromeDriver();
		
	}
	
	By search= By.cssSelector("input[placeholder='Search for Products, Brands and More'] ");
	By product = By.partialLinkText("Apple iPhone 15 Plus (Blue, 128 GB)");
	By  AddtoCart = By.cssSelector("button[class='QqFHMw vslbG+ In9uk2']");
	
	public void search(String s) {
		
		w.findElement(search).sendKeys(s,Keys.ENTER);
	}
	public void product() {
		
		
		w.findElement(product).click();
	}
	
	public void windowHandle(String parent , Set<String> child)
	{
		for (String ch: child) {
		
			
			if(!ch.equals(parent))
			{
				w.switchTo().window(ch);
			}
			
		}
	}
	public void AddtoCart()
	{
		w.findElement(AddtoCart);
			
			
		}
		
	}
	


