   package Next;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic_methodes.Scroll;
import POM.BuyProduct;
import POM.Login_page;
import POM.RedMi8;
import POM.Shoping;
import generic.EXcel;
import generic.Generic_Test;
public class Test1 extends Generic_Test {
	@Test
	public void next() throws InterruptedException{
	  test=report.createTest("Test1","End to End Senrio of filpkart");
		Login_page lp = new Login_page(driver);
		test.info("test case is started");
		lp.ClickX();
		test.pass("click on X button");
		String pn = EXcel.readCellValue("ProductName",1,0);
		lp.searchProduct(pn);
		Thread.sleep(3000);
		Scroll.srceenOnElement(driver,"//div[.='Redmi 8 (Sapphire Blue, 64 GB)']");
		test.pass("product name is enterd in serach box");
		BuyProduct pp = new BuyProduct(driver);
		Thread.sleep(3000);
		pp.select();
        test.pass("product is selected");
        test.info("test is ended");
        Thread.sleep(2000);
        Set<String> allwindow =driver.getWindowHandles();
        for(String str:allwindow){
        	driver.switchTo().window(str);
        	Thread.sleep(2000);
        }
         RedMi8 re = new RedMi8(driver);
         re.selectColour();
         re.clickAddCart();
         Reporter.log(driver.getTitle(),true);
         Shoping sh = new Shoping(driver);
         sh.clickRemove();
         sh.clickRemove1();
     	String expected= EXcel.readCellValue("expectedResult",1,0);   
     	Thread.sleep(3000);
        sh.verify(expected);
	}
}
