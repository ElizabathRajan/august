package utilitypkg;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import basepkg.Saucebase;

public class Sauceutility extends Saucebase {
	
	public static int getRowCount(String x2, String sheet)
	{
		try
		{
			FileInputStream fi=new FileInputStream(x2);
			XSSFWorkbook wb=new XSSFWorkbook(fi);
			return wb.getSheet(sheet).getLastRowNum();
		}catch(Exception e)
		{
			return 0;
		}
	}
	
	public static String getCellValue(String x1,String sheet,int row,int column)
	{
		try
		{
			 FileInputStream fi = new FileInputStream(x1);
	         XSSFWorkbook wb = new XSSFWorkbook(fi);
	         XSSFCell cell=wb.getSheet(sheet).getRow(row).getCell(column);
	         if (cell.getCellType() == CellType.STRING)
	         {
	                return cell.getStringCellValue();
	          } 
	         else 
	         {
	                return cell.getRawValue();  // Return the raw value if it's not a string
	          }
		}
	         catch (Exception e)
		       {
	            return "";  // Return empty string if an error occurs
	           }
		}
	}



