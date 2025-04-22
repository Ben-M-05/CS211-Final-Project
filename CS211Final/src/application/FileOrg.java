
package application;
import java.util.HashMap; // taken from https://www.w3schools.com/java/java_hashmap.asp
import java.io.FileNotFoundException;
/**
 * @author Joy Janney
 * This will hold the file locations and the getters for those locations
 */
public final class FileOrg
{
	
	//Hashmaps to hold the filepaths
	//This will hold the file locations under their buttons names
	static HashMap<String, String> eyeHashMap = new HashMap<String, String>();
	static{//https://www.baeldung.com/java-initialize-hashmap

		//importing eyes with no lashes
		eyeHashMap.put("eye01", "CS211Final/src/Images/eyes/noLash/eyes1-1.png");
		eyeHashMap.put("eye02", "CS211Final/src/Images/eyes/noLash/eyes1-2.png");
		eyeHashMap.put("eye03", "CS211Final/src/Images/eyes/noLash/eyes1-3.png");
		eyeHashMap.put("eye04", "CS211Final/src/Images/eyes/noLash/eyes1-4.png");
		eyeHashMap.put("eye05", "CS211Final/src/Images/eyes/noLash/eyes1-5.png");
		eyeHashMap.put("eye06", "CS211Final/src/Images/eyes/noLash/eyes1-6.png");

		//importing eyes with lashes
		eyeHashMap.put("eye07", "CS211Final/src/Images/eyes/withLash/eyes2-1.png");
		eyeHashMap.put("eye08", "CS211Final/src/Images/eyes/withLash/eyes2-2.png");
		eyeHashMap.put("eye09", "CS211Final/src/Images/eyes/withLash/eyes2-3.png");
		eyeHashMap.put("eye10", "CS211Final/src/Images/eyes/withLash/eyes2-4.png");
		eyeHashMap.put("eye11", "CS211Final/src/Images/eyes/withLash/eyes2-5.png");
		eyeHashMap.put("eye12", "CS211Final/src/Images/eyes/withLash/eyes2-6.png");
		
		
	}
	
	
	static HashMap<String, String> hairHashMap = new HashMap<String, String>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		
		//importing front female hair
		hairHashMap.put("Hair01", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-1.png");
		hairHashMap.put("Hair02", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-2.png");
		hairHashMap.put("Hair03", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-3.png");
		hairHashMap.put("Hair04", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-4.png");
		hairHashMap.put("Hair05", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-5.png");
		hairHashMap.put("Hair06", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-6.png");
		hairHashMap.put("Hair07", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-7.png");
		hairHashMap.put("Hair08", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-8.png");
		
		//importing front male hair
		hairHashMap.put("Hair09","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-1.png");
		hairHashMap.put("Hair10","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-2.png");
		hairHashMap.put("Hair11","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-3.png");
		hairHashMap.put("Hair12","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-4.png");
		hairHashMap.put("Hair13","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-5.png");
		hairHashMap.put("Hair14","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-6.png");
		hairHashMap.put("Hair15","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-7.png");
		hairHashMap.put("Hair16","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-8.png");
		
		//importing back female hair
		/*hairHashMap.put("","src/Images/hair/hairBack/Female/hairBackF1-1.png");
		hairHashMap.put("","src/Images/hair/hairBack/Female/hairBackF1-2.png");
		hairHashMap.put("","src/Images/hair/hairBack/Female/hairBackF1-3.png");
		hairHashMap.put("","src/Images/hair/hairBack/Female/hairBackF1-4.png");
		hairHashMap.put("","src/Images/hair/hairBack/Female/hairBackF1-5.png");
		hairHashMap.put("","src/Images/hair/hairBack/Female/hairBackF1-6.png");
		hairHashMap.put("","src/Images/hair/hairBack/Female/hairBackF1-7.png");
		hairHashMap.put("","src/Images/hair/hairBack/Female/hairBackF1-8.png");*/
		
		
	}
	
	static HashMap<String, String> headHashMap = new HashMap<String, String>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		
		//importing the heads
		headHashMap.put("head01","CS211Final/src/Images/head/head1-1.png");
		headHashMap.put("head02","CS211Final/src/Images/head/head1-2.png");
		headHashMap.put("head03","CS211Final/src/Images/head/head1-3.png");
		headHashMap.put("head04","CS211Final/src/Images/head/head1-4.png");
		headHashMap.put("head05","CS211Final/src/Images/head/head1-5.png");
		headHashMap.put("head06","CS211Final/src/Images/head/head1-6.png");
		
		
	}
	
	static HashMap<String, String> torsoHashMap = new HashMap<String, String>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		
		//importing the torsos
		torsoHashMap.put("torso01","CS211Final/src/Images/torso/torso1-01.png");
		torsoHashMap.put("torso02","CS211Final/src/Images/torso/torso1-02.png");
		torsoHashMap.put("torso03","CS211Final/src/Images/torso/torso1-03.png");
		torsoHashMap.put("torso04","CS211Final/src/Images/torso/torso1-04.png");
		torsoHashMap.put("torso05","CS211Final/src/Images/torso/torso1-05.png");
		torsoHashMap.put("torso06","CS211Final/src/Images/torso/torso1-06.png");
		torsoHashMap.put("torso07","CS211Final/src/Images/torso/torso1-07.png");
		torsoHashMap.put("torso08","CS211Final/src/Images/torso/torso1-08.png");
		torsoHashMap.put("torso09","CS211Final/src/Images/torso/torso1-09.png");
		torsoHashMap.put("torso10","CS211Final/src/Images/torso/torso1-10.png");
		torsoHashMap.put("torso11","CS211Final/src/Images/torso/torso1-11.png");
		torsoHashMap.put("torso12","CS211Final/src/Images/torso/torso1-12.png");
		
		
	}
	
	//Getters for the length of the hashmap
	
	/**
	 * 
	 * @return size of the eyeHashMap
	 */
	static public int getEyeLength()
	{
		return eyeHashMap.size();
	}
	
	/**
	 * 
	 * @return size of the hairHashMap
	 */
	static public int getHairLength()
	{
		return hairHashMap.size();
	}
	
	/**
	 * 
	 * @return size of the torsoHashMap
	 */
	static public int getTorsoLength()
	{
		return torsoHashMap.size();
	}
	
	/**
	 * 
	 * @return size of the headHashMap
	 */
	static public int getHeadLength()
	{
		return headHashMap.size();
	}
	
	
	//Getters for the filepath
	/**
	 * Takes the button name and returns the file path
	 * @author Joy Janney
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException 
	 */
	public static String eyeFindFile(String key) throws FileNotFoundException
	{
		if(eyeHashMap.get(key)==null)
			throw new FileNotFoundException("ERROR: FILE NOT FOUND IN ANY HASHMAP");
		return eyeHashMap.get(key);
	}
	
	/**
	 * Takes the button name and returns the file path
	 * @author Joy Janney
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException 
	 */
	public static String hairFindFile(String key) throws FileNotFoundException
	{
		if(hairHashMap.get(key)==null)
			throw new FileNotFoundException("ERROR: FILE NOT FOUND IN HAIR HASHMAP");
		return hairHashMap.get(key);
	}
	
	/**
	 * Takes the button name and returns the file path
	 * @author Joy Janney
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException 
	 */
	public static String headFindFile(String key) throws FileNotFoundException
	{
		if(headHashMap.get(key)==null)
			throw new FileNotFoundException("ERROR: FILE NOT FOUND IN HEAD HASHMAP");
		return headHashMap.get(key);
	}
	
	/**
	 * Takes the button name and returns the file path
	 * @author Joy Janney
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException 
	 */
	public static String torsoFindFile(String key) throws FileNotFoundException
	{
		if(torsoHashMap.get(key)==null)
			throw new FileNotFoundException("ERROR: FILE NOT FOUND IN TORSO HASHMAP");
		return torsoHashMap.get(key);
	}
	
	/**
	 * Takes the button name and returns the file path
	 * This one searched all of the hasmaps not just a specific one
	 * @author Joy Janney
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 */
	public static String findFile(String key) throws FileNotFoundException
	{
		//It calls the other methods to see if they have the file path
		//If not, it moves on to the next one
		if(eyeHashMap.get(key)!= null)
			return eyeFindFile(key);
		else if(hairHashMap.get(key)!= null)
			return hairFindFile(key);
		else if(headHashMap.get(key)!= null)
			return headFindFile(key);
		else if(torsoHashMap.get(key)!= null)
			return torsoFindFile(key);
		else
			throw new FileNotFoundException("ERROR: FILE NOT FOUND IN ANY HASHMAP");
			//if not hashmap has the file, return null
			
	}
}
