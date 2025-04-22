package application;

import java.io.FileNotFoundException;

/**
 * @author Joy Janney
 * The class for the torso of a person
 */
class Torso extends BodyParts
{
	String type;
	String name;
	static int xAxis = 30;
	static int yAxis = 5;
	String filePath;
	
	/**
	 * Default constructor that sets the torso equal to option torso01
	 * @throws FileNotFoundException
	 */
	Torso() throws FileNotFoundException
	{
		filePath = "torso1-01";
	}
	
	@Override
	/**
	 * Sets the eye to the image file provided
	 * @param fp - the filepath of the image to set the eye to
	 */
	public void setFilePath(String fp)
	{
		filePath = fp;
		System.out.println("Torso New FilePath: " + filePath);
	}
}