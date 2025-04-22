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
		filePath = "Hair1-01";
	}
	
	@Override
	/**
	 * Sets the eye to the image file provided
	 * @param fp - the filepath of the image to set the eye to
	 */
	public void setFilePath(String fp)
	{

		filePath = fp;
		System.out.println("Hair New FilePath: " + filePath);
	}
}