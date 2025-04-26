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
}