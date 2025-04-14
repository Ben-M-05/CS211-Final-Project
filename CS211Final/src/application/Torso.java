package application;

import java.io.FileNotFoundException;

class Torso extends BodyParts
{
	String type;
	String name;
	static int xAxis = 30;
	static int yAxis = 5;
	String filePath;
	
	Torso() throws FileNotFoundException
	{
		filePath= FileOrg.torsoFindFile("torso01");
	}
}