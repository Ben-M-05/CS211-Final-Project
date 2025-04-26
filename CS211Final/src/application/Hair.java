package application;

import java.io.FileNotFoundException;

/**
 * Hair class
 * @author Joy Janney
 */
class Hair extends BodyParts
{
	
	/**
	 * Default constructor that sets the hair to Hair01 option
	 * @throws FileNotFoundException if file not found
	 */
	Hair() throws FileNotFoundException
	{
		super.setFilePath("Hair1-01");
	}

}