package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Util1;

public class Kite_login1
{

	
	//DF4359     //input[@id='password']
	
	//annotation 
	
	//Step1 :declare D.M. Globally 
	
	@FindBy(xpath="//input[@id='userid']") private WebElement UN;
	
	@FindBy(xpath="//input[@id='password']") private WebElement Pass;
	
	@FindBy(xpath="//button[@class='button-orange wide']") private WebElement btn;
	
	//Step 2 initialize within constructor with access level public 
	
	public Kite_login1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
		
	//Step 3
	
	public void enterUN(String UN1) throws EncryptedDocumentException, IOException
	{
		//String UN1 = Util1.readdata(0, 0);
		UN.sendKeys(UN1);
	}
	
	public void enterPass(String Pass1) throws EncryptedDocumentException, IOException
	{
	
		//String Pass1 = Util1.readdata(0, 1);
		
		Pass.sendKeys(Pass1);
		
	}
	
	public void click()
	{
		btn.click();
	}
	
	
	
	
}
