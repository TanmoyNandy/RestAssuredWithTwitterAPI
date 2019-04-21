package dataProvider;

import java.io.FileInputStream;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataHub {
	
	public static HashMap<String, String> DataMap(String worksheet, int rowCount)
	{
		HashMap<String, String> currentHash = new HashMap<String, String>();
		try
		{
			FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\testdata\\testdata.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheet(worksheet);
			Row headerRow = sheet.getRow(0);			
			Row currentRow = sheet.getRow(rowCount);
		    for(int j=0;j<currentRow.getPhysicalNumberOfCells();j++)
			{			
				currentHash.put(headerRow.getCell(j).getStringCellValue(), currentRow.getCell(j).getStringCellValue());			
			}
			workbook.close();
			fs.close();
		    
		    
		}catch(Exception ioe)
		{
			ioe.printStackTrace();
		}
		return currentHash;
	}

}
