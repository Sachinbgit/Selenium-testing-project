package com.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SauceDemoStepDefination {
     WebDriver w;
	
	@Given("Launch browser And open Saucedemo site.")
	public void launch_browser_and_open_saucedemo_site() {
            w = new ChromeDriver();
            w.get("https://www.saucedemo.com/");
            w.manage().window().maximize();
	}

	@When("Enter {string} in username field And Enter {string} in password field.")
	public void enter_in_username_field_and_enter_in_password_field(String username, String password) {
	
		w.findElement(By.id("user-name")).sendKeys(username);;
		w.findElement(By.name("password")).sendKeys(password);;
		  
	}

	@When("Click on login button.")
	public void click_on_login_button() {
	    
		w.findElement(By.cssSelector("input[data-test=\"login-button\"]")).click();
	}

	@Then("Validate login is successful.")
	public void validate_login_is_successful() {
	   
		String ExpUrl = "https://www.saucedemo.com/inventory.html";
		String ActUrl = w.getCurrentUrl();
		Assert.assertEquals(ExpUrl, ActUrl);
	}
	
	
	}



	
	
	
	
	







