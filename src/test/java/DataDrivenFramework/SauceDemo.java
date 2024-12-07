package DataDrivenFramework;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SauceDemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver w=new ChromeDriver();
		w.get("https://www.saucedemo.com/");
		FileInputStream fis = new FileInputStream("C:\\Sachin\\Saucedemo.xlsx");
			XSSFWorkbook login = new XSSFWorkbook(fis);
			XSSFSheet sheet=login.getSheet("Sheet1");
			XSSFCell pass = sheet.getRow(1).getCell(1);
			for(int i=1;i<=sheet.getLastRowNum();i++)
			{
				
				XSSFRow row = sheet.getRow(i);
				XSSFCell user= row.getCell(0);
				Thread.sleep(2000);
				WebElement userf = w.findElement(By.cssSelector("input[placeholder='Username'] "));
				userf.clear();
				userf.sendKeys(user.toString());
				Thread.sleep(2000);
				WebElement passf = w.findElement(By.name("password"));
				passf.clear();
				passf.sendKeys(pass.toString());
				Thread.sleep(2000);
				w.findElement(By.id("login-button")).click();
				
				try {
					Thread.sleep(2000);
					w.findElement(By.id("react-burger-menu-btn")).click();
					Thread.sleep(2000);
					w.findElement(By.linkText("Logout")).click();
				} catch (Exception e) {
					TakesScreenshot tss= (TakesScreenshot) w;
					FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), 
							new File("C:\\Sachin\\"+"src"+".png"));
				}
				
				
				
				
				
				
				
				
				
			}

	}

}
