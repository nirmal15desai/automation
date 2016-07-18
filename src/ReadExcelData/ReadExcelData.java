package ReadExcelData;

import lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ExcelDataConfig excel=new ExcelDataConfig("D:\\ExcelData\\TestData.xlsx");
		System.out.println(excel.getData(1,0, 1));
	}

}
