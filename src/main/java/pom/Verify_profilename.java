package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utility.Util1;

public class Verify_profilename
{

	
	@FindBy(xpath="//span[@class='user-id']") private WebElement Profile;
	
	
	
	public Verify_profilename(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void Vprofile() throws EncryptedDocumentException, IOException
	{
		 
		String act = Profile.getText();

		String exp = Util1.readdata(0, 0);
		
		Assert.assertEquals(act, exp);
		Profile.click();
		
	}
	
	
	
	
	
}
