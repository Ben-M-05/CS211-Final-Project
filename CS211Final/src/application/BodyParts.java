package application;

import java.io.FileNotFoundException;

/**
 * Abstract class that all of the part parts will inherit from.
 * It includes basic items and functions that are needed to 
 * 	set and get the accessories
 * @author Joy Janney
 */
public class BodyParts
{
	/**
	 * where on the xAxis the iamge is placed
	 */
	int xAxis;
	/**
	 * y axis
	 */
	int yAxis;
	/**
	 * filepath
	 */
	String filePath;
	
	/**
	 * the scale size of the image
	 */
	int size;

	/**
	 * Default constructor for BodyParts
	 */
	BodyParts()
	{
		this.xAxis = 0;
		this.yAxis = 0;
		this.filePath = "";
		this.size = 500;
	}
	
	/**
	 * Full constructor for BodyParts
	 * @param t - the type
	 * @param n - the name of the class
	 * @param url - where the image is stored
	 * @param x - where on xAxis to display the image
	 * @param y - where on yAxis to display the image
	 */
	BodyParts(String t, String n, String url, int x, int y)
	{
		this.filePath = url;
		this.xAxis = x;
		this.yAxis = y;
	}

	/**
	 * returns the xaxis
	 * @return the xAxis
	 */
	public int getXAxis()
	{
		return this.xAxis;
	}
	
	/**
	 * returns the y axis
	 * @return the y axis
	 */
	public int getYAxis()
	{
		return this.yAxis;
	}
	
	/**
	 * returns the filepath
	 * @return the filepath
	 */
	public String getFilePath()
	{
		return filePath;
	}
	
	/**
	 * returns the scalable size of the image
	 * @return the size of the image
	 */
	public int getSize()
	{
		return size;
	}
	
	/**
	 * sets the xAxis
	 * @param x - xAxis of where to display the image
	 */
	public void setXAxis(int x)
	{
		this.xAxis = x;
	}
	
	/**
	 * sets the yAxis
	 * @param y - yAxis of where to display the image
	 */
	public void setYAxis(int y)
	{
		this.yAxis = y;
	}
	
	/**
	 * sets the URL
	 * @param fP - String: where the image is stored
	 */
	public void setFilePath(String fP)
	{
		filePath = fP;
	}
	
	public void setSize(int s)
	{
		size = s;
	}
}