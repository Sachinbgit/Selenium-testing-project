package com.Cucumber;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaskStepDefination {
	WebDriver w;
	@Given("Launch the browser and validate the title")
	public void launch_the_browser_and_validate_the_title() {
	  w = new ChromeDriver();
	  w.get("https://www.google.com/");
	  w.manage().window().maximize();
	}

	@When("Enter the {string} name And click it.")
	public void enter_the_name_and_click_it(String Product) {
	    
		w.findElement(By.cssSelector("textarea[aria-controls=\"Alh6id\"]")).sendKeys(Product,Keys.ENTER);
	}

	@Then("Validate the {string} is matching.")
	public void validate_the_title_is_matching(String Title) {
	   Assert.assertEquals(Title, w.getTitle());
	}
}
