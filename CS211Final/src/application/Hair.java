package application;

import java.io.FileNotFoundException;

/**
 * @author Joy Janney
 * the hair class for the avatar
 */
class Hair extends BodyParts
{
	String type;
	String name;
	static int xAxis = 30;
	static int yAxis = 30;
	String filePath;
	
	/**
	 * Default constructor that sets the hair to Hair01 option
	 * @throws FileNotFoundException
	 */
	Hair() throws FileNotFoundException
	{
		filePath = "Hair01";
	}
}