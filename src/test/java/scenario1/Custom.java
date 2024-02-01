package scenario1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Custom
{
	@DataProvider(name="ExcelData")
	public Object[][] fileData()
	{
		XSSFWorkbook workbook;
		Object data[][]=null;
	    File f1 = new File("./" + "\\TestData\\Data.xlsx");
	    FileInputStream fs;
	    try 
	    {
		    fs = new FileInputStream(f1);
		    workbook = new XSSFWorkbook(fs);
		    
			int rows =workbook.getSheet("userdata").getPhysicalNumberOfRows();
			System.out.println("Number of rows are: "+rows);
					  
			int column =workbook.getSheet("userdata").getRow(0).getPhysicalNumberOfCells();
			System.out.println("Number of colums are: "+column);
					  
			data= new Object [rows-1][column];
			for(int r=1;r<rows;r++)
			{
				for(int c=0;c<column;c++) 
				{
					 data [r-1][c] = workbook.getSheet("userdata").getRow(r).getCell(c).getStringCellValue();
					
							
			     }
			 }} catch(FileNotFoundException e){
					e.printStackTrace();
				}catch (IOException e) {
					e.printStackTrace();
				}
			 return data;
	}
}
	
