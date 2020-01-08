package Generic_methodes;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Scroll {
 public static void srceenOnElement(WebDriver driver,String xpath){
	 WebElement ele = driver.findElement(By.xpath(xpath));	
		Point p = ele.getLocation();
		int x = p.getX();
		int y = p.getY();  
   JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("window.scrollBy("+x+","+y+")");
 }

}
