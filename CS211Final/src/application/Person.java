package application;

import java.io.FileNotFoundException;

/**
 * @author Joy Janney
 * This class will contain all of the objects for the person
 * This will allows for multiple avatars
 */
public class Person
{
	Head head;
	Torso torso;
	Eyes eyes;
	Hair hair;
	
	Person() throws FileNotFoundException
	{
		head = new Head();
		torso = new Torso();
		eyes = new Eyes();
		hair = new Hair();
	}
	
	/**
	 * Will return the head object for the avatar
	 * @return Head: the head object
	 */
	public Head getHead()
	{
		return head;
	}
	
	/**
	 * Will return the torso object for the person
	 * @return Torso: the torso object
	 */
	public Torso getTorso()
	{
		return torso;
	}
	
	/**
	 * Will return the eye object for the person
	 * @return Eyes: the eyes object
	 */
	public Eyes getEyes()
	{
		return eyes;
	}
	
	/**
	 * 
	 * @return Hair: the hair object
	 */
	public Hair getHair()
	{
		return hair;
	}
	
	/**
	 * Will copy a head object and set it to avatar's head
	 * @param h - Head: the head object to be copied
	 */
	public void setHead(Head h)
	{
		head.setFilePath(h.getFilePath());
		head.setName(h.getName());
		head.setType(h.getType());
		head.setXAxis(h.getXAxis());
		head.setYAxis(h.getYAxis());
	}
	
	/**
	 * Will copy a torso object and set it to the avatar's torso
	 * @param t - Torso: the torso object to be copies\d
	 */
	public void setTorso(Torso t)
	{
		torso.setFilePath(t.getFilePath());
		torso.setName(t.getName());
		torso.setType(t.getType());
		torso.setXAxis(t.getXAxis());
		torso.setYAxis(t.getYAxis());
	}
	
	/**
	 * Will copy a eye object and set it to the avatar's eyes
	 * @param e - Eyes: the eye object to be copied
	 */
	public void setEyes(Eyes e)
	{
		eyes.setFilePath(e.getFilePath());
		eyes.setName(e.getName());
		eyes.setType(e.getType());
		eyes.setXAxis(e.getXAxis());
		eyes.setYAxis(e.getYAxis());
	}
	
	/**
	 * Will copy a hair object and set it to the avatar's hair
	 * @param h - Hair: the hair object to be copied
	 */
	public void setHair(Hair h)
	{
		hair.setFilePath(h.getFilePath());
		hair.setName(h.getName());
		hair.setType(h.getType());
		hair.setXAxis(h.getXAxis());
		hair.setYAxis(h.getYAxis());
	}
}