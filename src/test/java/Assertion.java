import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Assertion {

	
	@Test
	public void Google() {
		
		WebDriver w = new ChromeDriver();
		w.get("https://www.google.com/");
		w.findElement(By.id("APjFqb")).sendKeys("cricket",Keys.ENTER);
		
		String exp = "cricket - Google Search";
		String act = w.getTitle();
		// Hard Assertion
		Assert.assertEquals(exp, act);
		
		
		// soft assertion
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(exp, act);
		w.quit();
		soft.assertAll();
	}
	
	
	
	
	
	
	
}
