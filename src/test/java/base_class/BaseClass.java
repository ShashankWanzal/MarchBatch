package base_class;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class BaseClass
{
	public static WebDriver driver;
	
	

	
	public static void openchromebrowser() throws IOException
	{
		ChromeOptions option =new ChromeOptions();
		option.addArguments("--disable--notification");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\shash\\eclipse-workspace\\March_001\\Browser\\chromedriver.exe");
		
		 driver=new ChromeDriver(option);
		 
	
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		
	
	}

	
	public void openfirefoxbrowser() throws IOException
	{
		
		System.setProperty("webdriver.gecko.driver", 
				"C:\\Users\\shash\\eclipse-workspace\\March_001\\Browser\\geckodriver.exe");
		
		driver=new FirefoxDriver();
		
	
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	public static void Screenshot(int TCID) 
	{
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\shash\\OneDrive\\Desktop\\Screenshot\\Kite0010.png");
		
		try {
			FileHandler.copy(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	

	
	
	
}
