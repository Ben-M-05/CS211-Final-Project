package application;

import java.io.FileNotFoundException;

/**
 * Torso class
 * @author Joy Janney
 */
class Torso extends BodyParts
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
	static int yAxis = 5;
	/**
	 * filepath
	 */
	String filePath;
	
	/**
	 * Default constructor that sets the torso equal to option torso01
	 * @throws FileNotFoundException if file not found
	 */
	Torso() throws FileNotFoundException
	{
		super.setFilePath("torso1-01");
	}
}