package POM;

import generic.Bae_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedMi8 extends Bae_Page {
	@FindBy(xpath = "(//div[@class='_2fXpRR'])[1]")
	private WebElement ele6;
	
	@FindBy(xpath = "//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")
	private WebElement ele7;

	public RedMi8(WebDriver driver) {
		super(driver);
	}

	public void selectColour() {
		visibilityEle(5, ele6);
		ele6.click();
	}

	public void clickAddCart() {
		ele7.click();
	}
}
