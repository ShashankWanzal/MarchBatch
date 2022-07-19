package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import base_class.BaseClass;
import pom.Click_on_profile;
import pom.Kite_login1;
import pom.Kite_logine2page;
import pom.Verify_profilename;
import utility.Util1;

//@Listeners(base_class.Listner1.class)
public class VerifyProfileName12 extends BaseClass
{

	
	Kite_login1 login1;
	Kite_logine2page login2;
	Verify_profilename Pname;
	Click_on_profile click;
	ExtentReports reports;
	ExtentHtmlReporter html;
	ExtentTest test;
	SoftAssert as;
	
	
	@BeforeClass
	public void openbrowser() throws IOException
	{
		

		//extents reporter
		reports=new ExtentReports();
		html=new  ExtentHtmlReporter("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\new1.html");
		
		reports.attachReporter(html);
		
		test=reports.createTest("Kite validation", "Validate Profile Name of Kite");
		
		
		openchromebrowser();
		
		test.log(Status.INFO, "Chrome is sucessfully open");
		 String url = Util1.property_file("URL");
			
		  driver.get(url);
		  test.log(Status.INFO, "Zerodha is open");
		
		
		login1=new Kite_login1(driver);
		login2=new Kite_logine2page(driver);
		Pname=new Verify_profilename(driver);
		click=new Click_on_profile(driver);
		as=new SoftAssert();
		
	
		String title = driver.getTitle();
		
		test.log(Status.INFO, "Webpage Title ="+title);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@BeforeMethod
	public void LogintoKite() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//Reporter.log("Hi",true);
		Thread.sleep(2000);
		String UN = Util1.readdata(0, 0);
		test.log(Status.INFO, "We enter Username="+UN);
		String Pass = Util1.readdata(0, 1);
		test.log(Status.INFO, "We Enter Password="+Pass);
		login1.enterUN(UN);
		login1.enterPass(Pass);
		login1.click();
		test.log(Status.INFO, "first login is sucessfully done");
		
		login2.enterpin();
		test.log(Status.INFO, "Chrome is sucessfully open");
		login2.clickonbtn();
	
		test.log(Status.INFO, "login is sucessfully to zerodha");
		
	}
	
	@Test
	public void Test() throws EncryptedDocumentException, IOException, InterruptedException
	{
		int TCID=001;
		Pname.Vprofile();

	
		click.Pname1();
		
		as.assertEquals(true, false);
		as.assertAll();
		//Assert.fail();
		Thread.sleep(2000);
		//BaseClass.Screenshot(TCID);
	
	}
	
	@AfterMethod
	public void Logout(ITestResult result) throws IOException
	{
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.fail("test case is failing");
			BaseClass.Screenshot(001);
			test.fail("fail", MediaEntityBuilder.createScreenCaptureFromPath("Kite0010.png").build());
			
			test.addScreenCaptureFromPath("Kite0010.png");
			
		}
		else
		{
		
			BaseClass.Screenshot(001);
			test.pass("test case is Pass", MediaEntityBuilder.createScreenCaptureFromPath("Kite0010.png").build());
			test.addScreenCaptureFromPath("Kite0010.png");
			
		}
		
		
		
		
		driver.navigate().refresh();
		test.log(Status.INFO, "click on logout");
		
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		test.log(Status.INFO, "Closing the browser");
		
		reports.flush();
		
		driver.quit();
	
		
	}
	
	
}
