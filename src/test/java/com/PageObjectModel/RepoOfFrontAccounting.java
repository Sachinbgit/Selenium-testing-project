package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RepoOfFrontAccounting {

	WebDriver w;
	public  RepoOfFrontAccounting(WebDriver wd) {
		 w=wd;
	}
	
	By Login=By.name("SubmitUser");
	By SalesQ=By.partialLinkText("Quotation Entry");
	By Cancel=By.name("CancelOrder");
	By Back=By.linkText("Back");
	By SalesO=By.linkText("Sales Order Entry");
	By Logout=By.cssSelector("img[alt='Logout']");
	
	public void Login() {
		
		w.findElement(Login).click();;
	}
	
	public void SaleQ() {
		w.findElement(SalesQ).click();
	}
	public void Cancel() {
		w.findElement(Cancel).click();;
	}
	public void Popup()
	{
		w.switchTo().alert().accept();
	}
	public void Back() {
		w.findElement(Back).click();;
	}
	public void SalesO() {
		w.findElement(SalesO).click();;	}
	
	
	public void Logout() {
		w.findElement(Logout).click();;
	}
	
	
	
	
	
}

