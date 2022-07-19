package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Click_on_profile
{

	
	@FindBy(xpath="(//ul[contains(@class,'list-flat dropdow')]//a)[1]") private WebElement profilname;
	
	
	
	public Click_on_profile(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void Pname1()
	{
		profilname.click();
		
		
	}
	
	
}
