package test;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base_class.BaseClass;

public class Test2 extends BaseClass
{

	public static void main(String[] args) throws IOException
	{
	
		ExtentReports reports=new ExtentReports();
		
		ExtentHtmlReporter html=new ExtentHtmlReporter("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\new.html");
		
		reports.attachReporter(html);
		 ExtentTest test = reports.createTest("MyFirstTest", "Sample description");
		
		BaseClass.openchromebrowser();
		
		
		System.out.println(driver.getTitle());
		test.log(Status.INFO, "google page open");
		test.log(Status.INFO, "We are getting google title");
		test.log(Status.WARNING, "some time page is taking too much time to load");
		
		test.pass("we are getting expected result");
		BaseClass.Screenshot(001);
		test.fail("fail", MediaEntityBuilder.createScreenCaptureFromPath("Kite002.png").build());
		
		test.addScreenCaptureFromPath("Kite002.png");
		
		
		//test.fail("second test case is failing");
		
		
		
		reports.flush();
		
		driver.close();
		
	}
	
	
	
}
