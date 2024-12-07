package com.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FrontAccountingLoginStepDefination {
	WebDriver w;
	@Given("Open browser And open frontaccounting")
	public void open_browser_and_open_frontaccounting() {
	    w = new ChromeDriver();
	    w.get("https://demo.frontaccounting.eu/");
		w.manage().window().maximize();
	}

	@When("Clear data of username and password.")
	public void clear_data_of_username_and_password() {
	    w.findElement(By.name("user_name_entry_field")).clear();;
	    w.findElement(By.xpath("//input[@value='password']")).clear();;
		
	}

	@When("Enter username and password data in username and password edit field")
	public void enter_username_and_password_data_in_username_and_password_edit_field() {
		 w.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		    w.findElement(By.xpath("//input[@value='password']")
		    		
		    		
		    		).sendKeys("password");
		    w.findElement(By.name("SubmitUser")).click();;
		    
	}

	@Then("Verify the title after login")
	public void verify_the_title_after_login() {
	   
		Assert.assertEquals("Main Menu", w.getTitle());
		
	}

	@Then("verify that Sales quotation Entry is available.")
	public void verify_that_sales_quotation_entry_is_available() {
	   
	String sales = w.findElement(By.cssSelector(" a[href=\"./sales/sales_order_entry.php?NewQuotation=Yes\"]")).getText();
		
	Assert.assertEquals( "Sales Quotation Entry",sales );
		
	}
}