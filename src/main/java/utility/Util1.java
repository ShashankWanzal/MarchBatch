package utility;
import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
 
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.internal.BaseClassFinder;


public class Util1 
{


	public static String readdata(int rowname, int cellname) throws EncryptedDocumentException, IOException 
	{
	
		FileInputStream file=new FileInputStream("C:\\Users\\shash\\eclipse-workspace\\March_001\\Excel\\AprilBatch.xlsx");
		
		String name = WorkbookFactory.create(file).getSheet("Kite").getRow(rowname).getCell(cellname).getStringCellValue();
		
		return name;
		
	}
   
	public static String property_file(String key) throws IOException
	{
		
		Properties obj=new Properties();
		FileInputStream objfile=new FileInputStream("C:\\Users\\shash\\eclipse-workspace\\March_001\\Property\\Propertyfile.properties");
		
		obj.load(objfile);
		
		String value = obj.getProperty("URL");
		
		//System.out.println(value);
		
		return value;
		
	}




	

	
	
	
	
	
	
}
