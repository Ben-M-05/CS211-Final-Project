package application;

public class Person
{
	Head head = new Head();
	Torso torso = new Torso();
	Eyes eyes = new Eyes();
	Hair hair = new Hair();
	
	public Head getHead()
	{
		return head;
	}
	
	public Torso getTorso()
	{
		return torso;
	}
	
	public Eyes getEyes()
	{
		return eyes;
	}
	
	public Hair getHair()
	{
		return hair;
	}
	
	
	public void setHead(Head h)
	{
		head.setFilePath(h.getFilePath());
		head.setName(h.getName());
		head.setType(h.getType());
		head.setXAxis(h.getXAxis());
		head.setYAxis(h.getYAxis());
	}
	
	public void setTorso(Torso t)
	{
		torso.setFilePath(t.getFilePath());
		torso.setName(t.getName());
		torso.setType(t.getType());
		torso.setXAxis(t.getXAxis());
		torso.setYAxis(t.getYAxis());
	}
	
	public void setEyes(Eyes e)
	{
		eyes.setFilePath(e.getFilePath());
		eyes.setName(e.getName());
		eyes.setType(e.getType());
		eyes.setXAxis(e.getXAxis());
		eyes.setYAxis(e.getYAxis());
	}
	
	public void setHair(Hair h)
	{
		hair.setFilePath(h.getFilePath());
		hair.setName(h.getName());
		hair.setType(h.getType());
		hair.setXAxis(h.getXAxis());
		hair.setYAxis(h.getYAxis());
	}
}
