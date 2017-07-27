package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility 
{
	private static XSSFWorkbook ExcelWorkbook;
	private static XSSFSheet ExcelSheet;
	private static XSSFRow Row;
	private static XSSFCell Cell;
	
	public static void setExcelfile(String Path) throws Exception
	{
		try
		{
			FileInputStream ExcelFile = new FileInputStream(Path);
			ExcelWorkbook = new XSSFWorkbook(ExcelFile);
			ExcelSheet = ExcelWorkbook.getSheetAt(0);
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
	
	//This method is to read the test data from the Excel cell, in this we are passing parameters as Row num and Col num
	public static String getCellData(int RowNum, int ColNum) throws Exception
	{
		try
		{
			Cell = ExcelSheet.getRow(RowNum).getCell(ColNum);
			Cell.setCellType(XSSFCell.CELL_TYPE_STRING);
			String CellData = Cell.getStringCellValue();
			return CellData;
		}
		catch(Exception e)
		{
			return "";
		}
	}
	
	//This method is to write in the Excel cell, Row num and Col num are the parameters
	public static void setCellData(String Result, int RowNum, int ColNum) throws Exception
	{
		try
		{
			Row = ExcelSheet.getRow(RowNum);
			Cell = Row.getCell(ColNum, MissingCellPolicy.RETURN_BLANK_AS_NULL);
			if(Cell==null)
			{
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			}
			else
			{
				Cell.setCellValue(Result);
			}
			
			FileOutputStream fo = new FileOutputStream(Constant1.Excel_Path + Constant1.Excel_File);
			ExcelWorkbook.write(fo);
			fo.flush();
			fo.close();
		}
		catch(Exception e)
		{
			throw(e);
		}
	}
}
