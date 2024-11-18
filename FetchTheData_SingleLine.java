package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTheData_SingleLine {

	FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\Selenium_Project1\\DDT\\TestData.xlsx");


	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step1: let java know the file location by creating a object of fileinputstream class by passing the paramter as file location - parameterized constructor
		FileInputStream f = new FileInputStream("C:\\Users\\yamin\\eclipse-workspace\\Selenium_Project1\\DDT\\TestData.xlsx");
		//Step :2 now open the excel file by using a create method of  WorkbookFactory class
		  Workbook w = WorkbookFactory.create(f);
		   String url =w.getSheet("Login").getRow(1).getCell(2).getStringCellValue();
		System.out.println(url);
		   //to launch the url
		   ChromeDriver driver = new ChromeDriver();
			driver.get(url);
	}
}
