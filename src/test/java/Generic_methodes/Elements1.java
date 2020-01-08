package Generic_methodes;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Elements1 {
	public static List<String> getvalues(WebDriver driver, String xpath) {
		List<WebElement> ele = driver.findElements(By.xpath(xpath));
		List<String> value = new ArrayList<String>();
		for (WebElement we : ele) {
			value.add(we.getText());
		}
		return value;
	}

	public static int findSize(WebDriver driver, String xpath) {
		List<WebElement> ele = driver.findElements(By.xpath(xpath));
		return ele.size();
	}

	public static List<String> getUrl(WebDriver driver, String xpath) {
		List<WebElement> ele = driver.findElements(By.xpath(xpath));
		List<String> value = new ArrayList<String>();
		for (WebElement we : ele) {
			value.add(we.getAttribute("href")); 
		}
		return value;
	}

}
