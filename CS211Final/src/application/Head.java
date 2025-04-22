package application;

import java.io.FileNotFoundException;

class Head extends BodyParts
{
	String type;
	String name;
	static int xAxis = 10;
	static int yAxis = 30;
	String filePath;
	
	Head() throws FileNotFoundException{
		filePath = "head01";
	}

	@Override
	public void setFilePath(String fp)
	{
		filePath = fp;
		System.out.println(fp);
	}
}