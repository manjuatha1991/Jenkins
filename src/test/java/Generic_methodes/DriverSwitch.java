package Generic_methodes;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class DriverSwitch {
  public static void to(WebDriver driver,int tabNo){
     Set<String> all = driver.getWindowHandles();
     
   List<String>str=new ArrayList<String>();
   for(String str1:all){
	 str.add(str1);
   }
   driver.switchTo().window(str.get(tabNo));
  }

}
