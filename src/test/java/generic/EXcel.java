package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class EXcel implements Auto_Contant{
	  public static void writeToCell(String sheetname,int rowno,int cell,String value){
		  try{
	    		FileInputStream fl = new FileInputStream(excel_path);
	    	    Workbook wb = WorkbookFactory.create(fl);
	    	    Sheet sh = wb.getSheet(sheetname);
	    	    Row r = sh.getRow(rowno);
	    	    Cell c = r.createCell(cell);
	    	    c.setCellValue(value);
	    	    FileOutputStream fs = new FileOutputStream(excel_path);
	    	    wb.write(fs);
	    	}
	    	catch(Exception e){
	    		Reporter.log("file is not copyed",true);
	    	}
	    }
	    public static String readCellValue(String sheetname,int rowno,int cell){
	    	String val=null;
	    	try{
	    		FileInputStream fl = new FileInputStream(excel_path);
	    	    Workbook wb = WorkbookFactory.create(fl);
	    	    Sheet sh = wb.getSheet(sheetname);
	    	    Row r = sh.getRow(rowno);
	    	    Cell cel = r.getCell(cell);
	    	    val=cel.getStringCellValue();
	    	}
	    	catch(Exception e){
	    		Reporter.log("reading cell value is fail",true);
	    	}
	    	return val;
	    	
	    }
}
