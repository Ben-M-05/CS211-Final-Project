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
}