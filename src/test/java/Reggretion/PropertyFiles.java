package Reggretion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.Reporter;

public class PropertyFiles {
  public static String getUrl() throws IOException{
	  String url="";
	  try{
	  Properties pr = new Properties();
	  FileInputStream fl = new FileInputStream("./UrlFolder.Properties");
	  pr.load(fl);
	  url=pr.getProperty("url");
	  }
	  catch(Exception e){
	  Reporter.log("file not able read url",true);
	  }
	  return url;
  }
  public static String getGeckoKey() throws IOException{
	  String key="";
	  try{
	  Properties pr = new Properties();
	  FileInputStream fl = new FileInputStream("./UrlFolder.Properties");
	  pr.load(fl);
	  key=pr.getProperty("geckoKey");
	  }
	  catch(Exception e){
	  Reporter.log("file not able read url",true);
	  }
	  return key;
  }
  public static String getchromeKey() throws IOException{
	  String key="";
	  try{
	  Properties pr = new Properties();
	  FileInputStream fl = new FileInputStream("./UrlFolder.Properties");
	  pr.load(fl);
	  key=pr.getProperty("chromeKey");
	  }
	  catch(Exception e){
	  Reporter.log("file not able read url",true);
	  }
	  return key;
  }
  public static String getgeckoValue() throws IOException{
	  String val="";
	  try{
	  Properties pr = new Properties();
	  FileInputStream fl = new FileInputStream("./UrlFolder.Properties");
	  pr.load(fl);
	  val=pr.getProperty("geckovalue");
	  }
	  catch(Exception e){
	  Reporter.log("file not able read url",true);
	  }
	  return val;
  }
  public static String getChromeValue() throws IOException{
	  String val="";
	  try{
	  Properties pr = new Properties();
	  FileInputStream fl = new FileInputStream("./UrlFolder.Properties");
	  pr.load(fl);
	  val=pr.getProperty("chromevalue");
	  }
	  catch(Exception e){
	  Reporter.log("file not able read url",true);
	  }
	  return val;
  }
}
