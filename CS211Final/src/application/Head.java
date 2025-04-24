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
}