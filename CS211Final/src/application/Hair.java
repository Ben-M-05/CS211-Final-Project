package application;

import java.io.FileNotFoundException;

/**
 * Hair class
 * @author Joy Janney
 */
class Hair extends BodyParts
{
	/**
	 * type
	 */
	String type;
	/**
	 * name
	 */
	String name;
	/**
	 * x axis
	 */
	static int xAxis = 30;
	/**
	 * y axis
	 */
	static int yAxis = 30;
	/**
	 * filepath
	 */
	String filePath;
	
	/**
	 * Default constructor that sets the hair to Hair01 option
	 * @throws FileNotFoundException if file not found
	 */
	Hair() throws FileNotFoundException
	{
		super.setFilePath("Hair1-01");
	}

}