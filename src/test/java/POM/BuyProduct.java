package POM;
import generic.Bae_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class BuyProduct extends Bae_Page{
	@FindBy(xpath="//div[.='Redmi 8 (Sapphire Blue, 64 GB)']")
	private WebElement ele3;
	public BuyProduct(WebDriver driver){
		super(driver);
	}
	public void select(){
		visibilityEle(3,ele3);
		ele3.click();
	}
}
