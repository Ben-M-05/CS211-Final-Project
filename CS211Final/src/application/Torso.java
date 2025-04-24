package application;

import java.io.FileNotFoundException;

/**
 * Torso class
 * @author Joy Janney
 */
class Torso extends BodyParts
{
	
	/**
	 * Default constructor that sets the torso equal to option torso01
	 * @throws FileNotFoundException if file not found
	 */
	Torso() throws FileNotFoundException
	{
		super.setFilePath("torso1-01");
	}
	
	//@Override
	/**
	 * Sets the eye to the image file provided
	 * @param fp - the filepath of the image to set the eye to
	 */
	/*public void setFilePath(String fp)
	{
		filePath = fp;
		System.out.println("Torso New FilePath: " + filePath);
	}*/
}