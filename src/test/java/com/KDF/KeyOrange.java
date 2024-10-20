package com.KDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjectModel.OrangeHrmRepowtihPageFactory;

public class KeyOrange {

	public static void main(String[] args) throws Exception {
		WebDriver w =new ChromeDriver();
		OrangeHrmRepowtihPageFactory r=new OrangeHrmRepowtihPageFactory(w);
		w.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		w.manage().window().maximize();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Downloads\\Kdf for Orange.xlsx");
	     XSSFWorkbook workbook=new XSSFWorkbook(fis);
	     XSSFSheet sheet1=workbook.getSheet("Sheet1");
	     
	     for(int i=1;i<=4;i++) {
	    	 XSSFRow row=sheet1.getRow(i);
	    	 XSSFCell teststep=row.getCell(0);	  
	    	 System.out.println(teststep.toString());
	    	 if(teststep.toString().equals("Login"))
	    	 {
	    		 r.logindata();
	    		 r.login();
	    	 }
	    	 else if(teststep.toString().equals("Logout")) {
	    		 r.dropdown();
	    		 r.logout();
	    	 }
	     
	     
	     }
	

	}

}
