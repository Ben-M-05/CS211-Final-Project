package application;

import java.io.FileNotFoundException;

/**
 * @author Joy Janney
 * class for the head of the avatar
 */
class Head extends BodyParts
{
	String type;
	String name;
	static int xAxis = 10;
	static int yAxis = 30;
	String filePath;
	
	/**
	 * Default constructor that sets the head to head01 option
	 * @throws FileNotFoundException
	 */
	Head() throws FileNotFoundException{
		filePath = FileOrg.headFindFile("head01");
	}
}