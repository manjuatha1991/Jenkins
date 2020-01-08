package POM;

import generic.Bae_Page;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page extends Bae_Page{
	public WebDriver driver;
	@FindBy(xpath="//button[.='✕']")
	
	private WebElement ele;
	@FindBy(name="q")
	
	private WebElement ele1;
		public Login_page(WebDriver driver){
        super(driver);
	}
	public void ClickX(){
  		ele.click();
	}
		public void searchProduct(String mobiles){
		ele1.sendKeys(mobiles);
		ele1.sendKeys(Keys.ENTER );
	}
 
}
