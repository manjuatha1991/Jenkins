 package generic;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Reggretion.PropertyFiles;
public class Generic_Test  implements Auto_Contant{
	public WebDriver driver;
	public static ExtentHtmlReporter htmlReport;
	public static ExtentReports report;
	public static ExtentTest test;
	@BeforeSuite
    public void setup(){
    	htmlReport=new ExtentHtmlReporter(new File("./reportes/"+System.currentTimeMillis()+".html"));
    	report=new ExtentReports();
    	report.attachReporter(htmlReport);  
    }
	@BeforeMethod()
	public void oppenApp() throws IOException{
		System.setProperty(PropertyFiles.getGeckoKey(),PropertyFiles.getgeckoValue());
		driver=new FirefoxDriver();
		driver.get(PropertyFiles.getUrl());
	}
    @AfterMethod()
    public void close(ITestResult res) throws IOException{
    	     String testName = res.getName();
    	     Reporter.log(testName);
    	if(ITestResult.FAILURE==res.getStatus()){
    		test.pass("tsetCase Fail",MediaEntityBuilder.createScreenCaptureFromPath(SCreen.sreenShoot(driver,testName)).build());
    		
    	}
    	driver.quit();
    }
    @AfterSuite
    public void setReport(){
    	report.flush();
    }
}  
