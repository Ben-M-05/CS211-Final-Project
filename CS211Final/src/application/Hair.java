package application;

import java.io.FileNotFoundException;

class Hair extends BodyParts
{
	String type;
	String name;
	static int xAxis = 30;
	static int yAxis = 30;
	String filePath;
	
	Hair() throws FileNotFoundException
	{
		String filePath = FileOrg.hairFindFile("Hair01");
	}
}