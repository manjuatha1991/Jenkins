package generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
public class Bae_Page {
	public WebDriver driver;
	public Bae_Page(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void verifyTitle(int seconds, String title) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions.titleContains(title));
			Reporter.log("title is displayed", true);
		} 
		catch (Exception e) {
			Reporter.log("title is displayed", true);
		}
	}

	public void elementClickble(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions.elementToBeClickable(element));
			Reporter.log("element is clickable", true);
		} catch (Exception e) {
			Reporter.log("element is not clickable", true);
		}

	}
	public void visibilityEle(int seconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
		    wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is visibile", true);
		} catch (Exception e) {
			Reporter.log("element is not visibile", true);
		}
       
	}
		public void uRL(int seconds,String url) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions.urlContains(url));
			Reporter.log("url is correct", true);
		} catch (Exception e) {
			Reporter.log("url is not correct", true);
		}

	}
	public void visibilityEleLocator(int seconds,String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
			Reporter.log("element is visibile", true);
		} catch (Exception e) {
			Reporter.log("element is not visibile", true);
		}

	}


}
