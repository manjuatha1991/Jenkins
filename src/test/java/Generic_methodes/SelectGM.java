package Generic_methodes;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectGM {
public void selectIndex(WebElement ele,int index){
		Select s1 = new Select(ele);
		s1.selectByIndex(index);
            }
public void selecttext(WebElement ele,String text){
	Select s1 = new Select(ele);
	s1.selectByVisibleText(text);
            }
public void selectvalue(WebElement ele,String value){
	Select s1 = new Select(ele);
	s1.selectByValue(value);
       }
public List<String> printAlloptions(WebElement ele){
	  Select s1 = new Select(ele);
	  List<WebElement> ops = s1.getOptions();
	  List<String> l1=new ArrayList<String>();
	  for(WebElement we:ops){
		  l1.add(we.getText());
	  }
	  return l1;
     }
public void deselecttext(WebElement ele,String text){
	Select s1 = new Select(ele);
	s1.selectByVisibleText(text);
           }
public void deselectIndex(WebElement ele,int index){
	Select s1 = new Select(ele);
	s1.selectByIndex(index);
        }
public void deselectvalue(WebElement ele,String value){
	Select s1 = new Select(ele);
	s1.selectByValue(value);
       }


}
