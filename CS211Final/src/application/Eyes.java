package application;

import java.io.FileNotFoundException;

/**
 * 
 * eye class for the avatar
 * @author Joy Janney
 */
class Eyes extends BodyParts
{
	
	/**
	 * Default constructor that sets a default eye
	 * @throws FileNotFoundException if file not found
	 */
	Eyes() throws FileNotFoundException
	{
		super.setFilePath("eye1-01");
	}
	
	/*@Override
	/**
	 * Sets the eye to the image file provided
	 * @param fp - the filepath of the image to set the eye to
	 */
	/*public void setFilePath(String fp)
	{
		filePath = fp;
	}*/
}