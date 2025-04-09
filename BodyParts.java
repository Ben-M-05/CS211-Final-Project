package application;
/**
 * @author Joy Janney
 * This is the abstract class that all of the part parts will
 * 	inherit from.
 * It includes basic items and functions that are needed to 
 * 	set and get the accessories
 */
public abstract class BodyParts
{
	String type;
	String name;
	int xAxis;
	int yAxis;
	String filePath;
	
	/**
	 * Default constructor for BodyParts
	 */
	BodyParts()
	{
		this.type = "";
		this.name = "";
		this.xAxis = 0;
		this.yAxis = 0;
		this.filePath = "";
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
		this.type = t;
		this.name = n;
		this.filePath = url;
		this.xAxis = x;
		this.yAxis = y;
	}
	
	/**
	 * @return the type
	 */
	public String getType()
	{
		return this.type;
	}
	
	/**
	 *
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * 
	 * @return the xAxis
	 */
	public int getXAxis()
	{
		return this.xAxis;
	}
	
	/**
	 * the y axis
	 * @return
	 */
	public int getYAxis()
	{
		return this.yAxis;
	}
	
	/**
	 * 
	 * @return the URL
	 */
	public String getFilePath()
	{
		return this.filePath;
	}
	
	
	/**
	 * sets the type
	 * @param t - the type
	 */
	public void setType(String t)
	{
		this.type = t;
	}
	
	/**
	 * sets the name
	 * @param n - the name
	 */
	public void setName(String n)
	{
		this.name =n;
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
	 * @param url - where the image is stored
	 */
	public void setFilePath(String fP)
	{
		this.filePath = fP;
		System.out.println("NEW FILEPATH: " + fP);
	}
}
