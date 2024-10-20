package com.KDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.PageObjectModel.FrontAccountingRepoWithPageFactory;

public class FrontAccounting {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		FrontAccountingRepoWithPageFactory r = new FrontAccountingRepoWithPageFactory(w);
		w.get("https://demo.frontaccounting.eu/");
		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Downloads\\KDF for Frontaccounting.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = work.getSheet("Sheet1");
		for(int i = 1;i<=4;i++) {
			XSSFRow row = sheet1.getRow(i);
			XSSFCell teststep = row.getCell(0);  //--> Login --> "Login"
			
			if (teststep.toString().equals("Login")) {
				r.loginclear();
				r.EnterLoginData();
				r.login();
			}
			else if (teststep.toString().equals("Logout")) {
				r.logout();
			}
			
		}
		
		
		

	}

}
