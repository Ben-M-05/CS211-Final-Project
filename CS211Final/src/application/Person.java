package application;

import java.io.FileNotFoundException;

/**
 * This class houses the avatar Person
 * @author Joy Janney
 * This class will contain all of the objects for the person
 * This will allows for multiple avatars
 */
public class Person
{
	/**
	 * head object
	 */
	Head head;
	/**
	 * torso object
	 */
	Torso torso;
	/**
	 * eye object
	 */
	Eyes eyes;
	/**
	 * hair object
	 */
	Hair hair;
	/**
	 * default constructor for the person
	 * @throws FileNotFoundException if file not found
	 */
	Person() throws FileNotFoundException
	{
		head = new Head();
		torso = new Torso();
		eyes = new Eyes();
		hair = new Hair();
	}
	
	/**
	 * returns the head object for the avatar
	 * @return Head: the head object
	 */
	public Head getHead()
	{
		return head;
	}
	
	/**
	 * returns the torso object for the person
	 * @return Torso: the torso object
	 */
	public Torso getTorso()
	{
		return torso;
	}
	
	/**
	 * returns the eye object for the person
	 * @return Eyes: the eyes object
	 */
	public Eyes getEyes()
	{
		return eyes;
	}
	
	/**
	 * returns the hair object
	 * @return Hair: the hair object
	 */
	public Hair getHair()
	{
		return hair;
	}
	
	/**
	 * copies a head object and set it to avatar's head
	 * @param h - Head: the head object to be copied
	 */
	public void setHead(Head h)
	{
		head.setFilePath(h.getFilePath());
		head.setXAxis(h.getXAxis());
		head.setYAxis(h.getYAxis());
	}
	
	/**
	 * copies a torso object and set it to the avatar's torso
	 * @param t - Torso: the torso object to be copies\d
	 */
	public void setTorso(Torso t)
	{
		torso.setFilePath(t.getFilePath());
		torso.setXAxis(t.getXAxis());
		torso.setYAxis(t.getYAxis());
	}
	
	/**
	 * copes eye object and set it to the avatar's eyes
	 * @param e - Eyes: the eye object to be copied
	 */
	public void setEyes(Eyes e)
	{
		eyes.setFilePath(e.getFilePath());
		eyes.setXAxis(e.getXAxis());
		eyes.setYAxis(e.getYAxis());
	}
	
	/**
	 * copies a hair object and set it to the avatar's hair
	 * @param h - Hair: the hair object to be copied
	 */
	public void setHair(Hair h)
	{
		hair.setFilePath(h.getFilePath());
		hair.setXAxis(h.getXAxis());
		hair.setYAxis(h.getYAxis());
	}
}