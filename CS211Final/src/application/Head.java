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
		filePath = "head1-01";
	}
	@Override
	/**
	 * Sets the eye to the image file provided
	 * @param fp - the filepath of the image to set the eye to
	 */
	public void setFilePath(String fp)
	{
		filePath = fp;
	}
}