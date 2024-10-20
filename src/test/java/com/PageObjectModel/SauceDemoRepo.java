package com.PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SauceDemoRepo {

	WebDriver w;
	public SauceDemoRepo(WebDriver wd) {
		w=wd;
	}
	// to find locators
	By User=By.xpath("//input[@data-test='username'] ");
	By Pass=By.name("password");
	By Login=By.cssSelector("input[type='submit']");
	By AddToCart=By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div/div[3]/div[3]/button");
	By CartIcon=By.cssSelector("svg[data-icon='shopping-cart']");
	By Checkout=By.linkText("CHECKOUT");
	By Fname=By.id("first-name");
	By Lname=By.xpath("//input[@placeholder='Last Name']");
	By ZipCode=By.xpath("//input[@data-test='postalCode']");
	By Continue=By.xpath("//input[@value='CONTINUE']");
	By Finsih=By.linkText("FINISH");
	By Hamburger=By.className("bm-burger-button");
	By Logout=By.id("logout_sidebar_link");
	// to make methods
	public void User() {
		w.findElement(User).sendKeys("standard_user\r\n");
	}
	public void Pass() {
		w.findElement(Pass).sendKeys("secret_sauce");
	}
	public void Login() {
		w.findElement(Login).click();
	}
	
	public void AddToCart() {
		w.findElement(AddToCart).click();
	
	}
	public void CartIcon() {
		w.findElement(CartIcon).click();
	}
	public void Checkout() {
		w.findElement(Checkout).click();
	}
	public void Fname() {
		w.findElement(Fname).sendKeys("xyz");
	}
	public void Lname() {
		w.findElement(Lname).sendKeys("abc");
	}
	public void ZipCode() {
		w.findElement(ZipCode).sendKeys("34564");
	}
	public void Continue() {
		w.findElement(Continue).click();
	}
	
	public void Finish() {
		w.findElement(Finsih).click();
	}
	
	public void Hamburger() {
		w.findElement(Hamburger).click();
	}
	public void Logout() {
		w.findElement(Logout).click();
	}
	
	
}

