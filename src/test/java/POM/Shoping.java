package POM;
import generic.Bae_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
public class Shoping extends Bae_Page{
	@FindBy(xpath="(//div[@class='gdUKd9'])[2]")
	private WebElement ele1;
	
	@FindBy(xpath="//div[@class='gdUKd9 _3Z4XMp _2nQDKB']")
	private WebElement ele2;
	
	@FindBy(xpath="//div[.='Missing Cart items?']")
	private WebElement ele3;


public Shoping(WebDriver driver) {
		super(driver);
	}
	public void clickRemove(){
		visibilityEle(3,ele1);
		ele1.click();
	}
	public void clickRemove1(){
		visibilityEle(3,ele2);
		ele2.click();
	}
	public void verify(String expectedResult){
		String actual = ele3.getText();
		Assert.assertEquals(actual,expectedResult);
	}
}
                                                                           