import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.cucumber.java.After;

public class GoogleSearchWithDataProvider {

	WebDriver w;
	@BeforeMethod
	public void BrowserLaunch() {
		w = new ChromeDriver();
		w.get("https://www.google.com/");
	}
	
	@Test (dataProviderClass = GoogleData.class, dataProvider = "GetData")
	public void Search(String s) throws Exception {
		
		w.findElement(By.id("APjFqb")).clear();
		w.findElement(By.id("APjFqb")).sendKeys(s,Keys.ENTER);
		Thread.sleep(5000);
	}
	
	@AfterMethod
	public void quit()
	{
		w.quit();
	}
	
	
	// we can use also used before and after class instead of method annotation
}
