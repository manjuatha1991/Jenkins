package Generic_methodes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsGM {
public void mouse(WebDriver driver,WebElement ele){
	   Actions act = new Actions(driver);
	   act.moveToElement(ele).perform();
   }
public void ActionRightClick(WebDriver driver,WebElement ele){
	   Actions act = new Actions(driver);
	   act.contextClick(ele).perform(); 
          }
}
