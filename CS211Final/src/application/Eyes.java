package application;

import java.io.FileNotFoundException;

/**
 * @author Joy Janney
 * The eyes class for the avatar
 */
class Eyes extends BodyParts
{
	String type;
	String name;
	static int xAxis = 15;
	static int yAxis = 15;
	String filePath;
	
	/**
	 * Default constructor that sets a default eye
	 * @throws FileNotFoundException
	 */
	Eyes() throws FileNotFoundException
	{
		filePath = "eye01";
	}
	
	@Override
	/**
	 * Sets the eye to the image file provided
	 * @param fp - the filepath of the image to set the eye to
	 */
	public void setFilePath(String fp)
	{
		filePath = fp;
		System.out.println(fp);
	}
}