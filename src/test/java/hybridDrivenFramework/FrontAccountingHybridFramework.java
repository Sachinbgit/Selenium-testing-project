package hybridDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class FrontAccountingHybridFramework {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new ChromeDriver();
		w.get("https://demo.frontaccounting.eu/index.php");
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		FrontAccountingHybridRepo r = new FrontAccountingHybridRepo(w);
		FileInputStream fis = new FileInputStream("C:\\Sachin\\FrontAccounting - HDF.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for (int i = 1; i <=4; i++) {
			
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = sheet.getRow(i).getCell(1);
			for(int j= 1; j<= 2; j++) {
				XSSFRow row1 = sheet.getRow(j);
				XSSFCell teststeps = row1.getCell(2);
			String	convert  = teststeps.toString();
			try {
				if(convert.equals("Login"))
				{
					Thread.sleep(2000);
					r.login(username.toString(),password.toString());
				}else if (convert.equals("Logout")) {
					Thread.sleep(2000);
					r.logout();
				}
			}
			catch (Exception e){
				TakesScreenshot tss = (TakesScreenshot) w;
				FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("C:\\Sachin\\"+username.toString()+password.toString()+".png"));
			}
			}
		}
	}
	
	

}
