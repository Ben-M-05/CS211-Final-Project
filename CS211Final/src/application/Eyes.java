package application;

import java.io.FileNotFoundException;

class Eyes extends BodyParts
{
	String type;
	String name;
	static int xAxis = 15;
	static int yAxis = 15;
	String filePath;
	
	Eyes() throws FileNotFoundException
	{
		filePath = "eye01";
	}
	
	@Override
	public void setFilePath(String fp)
	{
		filePath = fp;
		System.out.println(fp);
	}
}