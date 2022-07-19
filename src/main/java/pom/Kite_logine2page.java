package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Util1;

public class Kite_logine2page
{

	//1 Step declare DM globally (private)
	
	@FindBy(xpath="//input[@id='pin']") private WebElement pin;
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement btn;
	
	
	
	//Step2 initialize the constructor publically 
	
	public Kite_logine2page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//Step 3 declare methods 
	
	public void enterpin() throws EncryptedDocumentException, IOException
	{
		String Pin2 = Util1.readdata(0, 2);
		pin.sendKeys(Pin2);
	}
	
	public void clickonbtn() 
	{
	btn.click();	
	}
	
	
	
	
	
}
