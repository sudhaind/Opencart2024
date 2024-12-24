package utilities;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataProviders {
	
	//DataProvider 1
	
	
	@DataProvider(name="LoginData")
	public String[][] getData() throws IOException
	{
		
		String path =".\\testData\\Opencart_LoginData.xlsx"; //taking xl file from testData
		
		Excelutility xlutil = new Excelutility(path);
		
		
		int totalrows =xlutil.getRowCount("Sheet1");
		
		int totalcols=xlutil.getCellCount("Sheet1", 1);
		
		String logindata[][] = new String[totalrows][totalcols]; //created for 2 dimension array which can store
		
		for(int i=1;i<=totalrows;i++) //1 //read the data from xl storing in 2 dimension array
		{
			for(int j=0;j < totalcols;j++) //0 //i is rows j is col
				
			{
				
				logindata[i-1][j]=xlutil.getCellData("Sheet1", i, j); //1,0
			}
			
					
		}
			
			return logindata; //returning 2 dimension array
			
	}

}
