package application;

import java.io.FileNotFoundException;

/**
 * Head class
 * @author Joy Janney
 */
class Head extends BodyParts
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
	static int xAxis = 10;
	/**
	 * y axis
	 */
	static int yAxis = 30;
	/**
	 * filepath
	 */
	String filePath;
	
	/**
	 * Default constructor that sets the head to head01 option
	 */
	Head(){
		super.setFilePath("head1-01");
	}
	//@Override
	/**
	 * Sets the eye to the image file provided
	 * @param fp - the filepath of the image to set the eye to
	 */
	/*public void setFilePath(String fp)
	{
		filePath = fp;
	}*/
}