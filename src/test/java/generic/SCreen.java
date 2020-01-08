package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class SCreen implements Auto_Contant {
	public static String sreenShoot(WebDriver driver,String testName) throws IOException{
		Date d = new Date();
		String d1 = d.toString();
		d1=d1.replace(":","-");
		String path=photo_path+System.currentTimeMillis()+testName+".png";
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(path);
		try{
		FileHandler.copy(src,dst);
		System.out.println("photo is saved");
		}
		catch(Exception e){
			System.out.println("photo is not save");
		}
		return path;
	  }

}
