
package application;
import java.util.HashMap; // taken from https://www.w3schools.com/java/java_hashmap.asp
import java.io.FileNotFoundException;
/**
 * holds the file locations and the getters for those locations
 * @author Joy Janney
 */
public final class FileOrg
{
	/**
	 * defualt construcotr for FileOrg
	 */
	FileOrg(){
		
	}
	
	/**
	 * Hashmaps to hold the filepaths
	 * holds the file locations under their buttons names
	 * 
	 */
	static HashMap<String, HashMap<String, String>> eyeHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> eyeStyle1 = new HashMap<String, String>();
		//importing eyes with no lashes
		eyeHashMap.put("eyeStyle1", eyeStyle1);//https://www.baeldung.com/java-initialize-hashmap

			//importing eyes with no lashes
		eyeStyle1.put("eye1-01", "CS211Final/src/Images/eyes/noLash/eyes1-1.png");
		eyeStyle1.put("eye1-02", "CS211Final/src/Images/eyes/noLash/eyes1-2.png");
		eyeStyle1.put("eye1-03", "CS211Final/src/Images/eyes/noLash/eyes1-3.png");
		eyeStyle1.put("eye1-04", "CS211Final/src/Images/eyes/noLash/eyes1-4.png");
		eyeStyle1.put("eye1-05", "CS211Final/src/Images/eyes/noLash/eyes1-5.png");
		eyeStyle1.put("eye1-06", "CS211Final/src/Images/eyes/noLash/eyes1-6.png");

		HashMap<String, String> eyeStyle2 = new HashMap<String, String>();
		eyeHashMap.put("eyeStyle2", eyeStyle2);//https://www.baeldung.com/java-initialize-hashmap

			//importing eyes with lashes
		eyeStyle2.put("eye2-01", "CS211Final/src/Images/eyes/withLash/eyes2-1.png");
		eyeStyle2.put("eye2-02", "CS211Final/src/Images/eyes/withLash/eyes2-2.png");
		eyeStyle2.put("eye2-03", "CS211Final/src/Images/eyes/withLash/eyes2-3.png");
		eyeStyle2.put("eye2-04", "CS211Final/src/Images/eyes/withLash/eyes2-4.png");
		eyeStyle2.put("eye2-05", "CS211Final/src/Images/eyes/withLash/eyes2-5.png");
		eyeStyle2.put("eye2-06", "CS211Final/src/Images/eyes/withLash/eyes2-6.png");
		
	}
	
	/**
	 * This will hold the hair style hash maps
	 */
	static HashMap<String, HashMap<String, String>> hairHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> hairStyle1 = new HashMap<String, String>();
		hairHashMap.put("hairStyle1", hairStyle1);
		//front female hair
		hairStyle1.put("Hair1-01", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-1.png");
		hairStyle1.put("Hair1-02", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-2.png");
		hairStyle1.put("Hair1-03", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-3.png");
		hairStyle1.put("Hair1-04", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-4.png");
		hairStyle1.put("Hair1-05", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-5.png");
		hairStyle1.put("Hair1-06", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-6.png");
		hairStyle1.put("Hair1-07", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-7.png");
		hairStyle1.put("Hair1-08", "CS211Final/src/Images/hair/hairFront/Female/hairFrontF1-8.png");
		
		HashMap<String, String> hairStyle2 = new HashMap<String, String>();
		hairHashMap.put("hairStyle2", hairStyle2);
		//front male hair
		hairStyle2.put("Hair2-01","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-1.png");
		hairStyle2.put("Hair2-02","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-2.png");
		hairStyle2.put("Hair2-03","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-3.png");
		hairStyle2.put("Hair2-04","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-4.png");
		hairStyle2.put("Hair2-05","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-5.png");
		hairStyle2.put("Hair2-06","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-6.png");
		hairStyle2.put("Hair2-07","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-7.png");
		hairStyle2.put("Hair2-08","CS211Final/src/Images/hair/hairFront/Male/hairFrontM1-8.png");
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
	
	/**
	 * holds the head style hashmaps
	 */
	static HashMap<String, HashMap<String, String>> headHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> headStyle1 = new HashMap<String, String>();
		headHashMap.put("headStyle1", headStyle1);
		//importing the heads
		headStyle1.put("head1-01","CS211Final/src/Images/head/head1-1.png");
		headStyle1.put("head1-02","CS211Final/src/Images/head/head1-2.png");
		headStyle1.put("head1-03","CS211Final/src/Images/head/head1-3.png");
		headStyle1.put("head1-04","CS211Final/src/Images/head/head1-4.png");
		headStyle1.put("head1-05","CS211Final/src/Images/head/head1-5.png");
		headStyle1.put("head1-06","CS211Final/src/Images/head/head1-6.png");
	}
	/**
	 * Holds the torso style hashmaps
	 */
	static HashMap<String, HashMap<String, String>> torsoHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> torsoStyle1 = new HashMap<String, String>();
		torsoHashMap.put("torsoStyle1", torsoStyle1);
		//importing the torsos
		torsoStyle1.put("torso1-12","CS211Final/src/Images/torso/torso1-01.png");
		torsoStyle1.put("torso1-02","CS211Final/src/Images/torso/torso1-02.png");
		torsoStyle1.put("torso1-03","CS211Final/src/Images/torso/torso1-03.png");
		torsoStyle1.put("torso1-04","CS211Final/src/Images/torso/torso1-04.png");
		torsoStyle1.put("torso1-05","CS211Final/src/Images/torso/torso1-05.png");
		torsoStyle1.put("torso1-06","CS211Final/src/Images/torso/torso1-06.png");
		torsoStyle1.put("torso1-07","CS211Final/src/Images/torso/torso1-07.png");
		torsoStyle1.put("torso1-08","CS211Final/src/Images/torso/torso1-08.png");
		torsoStyle1.put("torso1-09","CS211Final/src/Images/torso/torso1-09.png");
		torsoStyle1.put("torso1-10","CS211Final/src/Images/torso/torso1-10.png");
		torsoStyle1.put("torso1-11","CS211Final/src/Images/torso/torso1-11.png");
		torsoStyle1.put("torso1-01","CS211Final/src/Images/torso/torso1-12.png");	
	}
	
	/**
	 * keeps track of the color associated with each image
	 */
	static HashMap<String, String> colorHashMap = new HashMap<String, String>();
	static{
		/* Eye */
		//style 1
		colorHashMap.put("eye1-01", "#000000");
		colorHashMap.put("eye1-02", "#6d7070");	
		colorHashMap.put("eye1-03", "#603e2f");	
		colorHashMap.put("eye1-04", "#605e36");	
		colorHashMap.put("eye1-05", "#4954a3");	
		colorHashMap.put("eye1-06", "#466f5a");
		//style 2
		colorHashMap.put("eye2-01", "#000000");	
		colorHashMap.put("eye2-02", "#6d7070");	
		colorHashMap.put("eye2-03", "#60402f");	
		colorHashMap.put("eye2-04", "#605e36");	
		colorHashMap.put("eye2-05", "#4954a2");	
		colorHashMap.put("eye2-06", "#466f5a");	
	
		/* Hair */
		//style 1
		colorHashMap.put("Hair1-01", "#191919");
		colorHashMap.put("Hair1-02", "#3b2213");
		colorHashMap.put("Hair1-03", "#541d10");
		colorHashMap.put("Hair1-04", "#733d1e");
		colorHashMap.put("Hair1-05", "#7e7e85");
		colorHashMap.put("Hair1-06", "#55471c");
		colorHashMap.put("Hair1-07", "#714f22");
		colorHashMap.put("Hair1-08", "#cfad61");
		//style 2
		colorHashMap.put("Hair2-01", "#1c1c1c");
		colorHashMap.put("Hair2-02", "#462817");
		colorHashMap.put("Hair2-03", "#682414");
		colorHashMap.put("Hair2-04", "#8e4c24");
		colorHashMap.put("Hair2-05", "#8e8e95");
		colorHashMap.put("Hair2-06", "#5b4c1e");
		colorHashMap.put("Hair2-07", "#956a2e");
		colorHashMap.put("Hair2-08", "#d0b063");

		/* Head */
		//style 1
		colorHashMap.put("head1-01","#fbe5d1");
		colorHashMap.put("head1-02","#f7d097");
		colorHashMap.put("head1-03","#e0a867");
		colorHashMap.put("head1-04","#f8d3c2");
		colorHashMap.put("head1-05","#b1693d");
		colorHashMap.put("head1-06","#4d3d30");
		
		/* Torso */
		//style 1
		colorHashMap.put("torso1-12","#c43526");
		colorHashMap.put("torso1-02","#ee7c38");
		colorHashMap.put("torso1-03","#f9db51");
		colorHashMap.put("torso1-04","#93d349");
		colorHashMap.put("torso1-05","#377d3c");
		colorHashMap.put("torso1-06","#224bb1");
		colorHashMap.put("torso1-07","#60addb");
		colorHashMap.put("torso1-08","#e46985");
		colorHashMap.put("torso1-09","#712fac");
		colorHashMap.put("torso1-10","#493c1e");
		colorHashMap.put("torso1-11","#e2e2e2");
		colorHashMap.put("torso1-01","#191916");	
		
	}
	
	//Getters for the length of the hashmap
	
	/**
	 * return the size of the eye hashmap
	 * @return size of the eyeHashMap
	 */
	static public int getEyeLength()
	{
		return eyeHashMap.size();
	}
	
	/**
	 * returns the size of the hair hashmap
	 * @return size of the hairHashMap
	 */
	static public int getHairLength()
	{
		return hairHashMap.size();
	}
	
	/**
	 * returns the size of the torso hashmap
	 * @return size of the torsoHashMap
	 */
	static public int getTorsoLength()
	{
		return torsoHashMap.size();
	}
	
	/**
	 * returns the size of the head hashmap
	 * @return size of the headHashMap
	 */
	static public int getHeadLength()
	{
		return headHashMap.size();
	}
	
	
	//Getters for the filepath
	/**
	 * Takes the button name and returns the file path
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found
	 */
	public static String eyeFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		for(String i : eyeHashMap.keySet())
		{
			temp = eyeHashMap.get(i);
			if(temp.get(key)!=null)
			{
				//System.out.println("File found: " + temp.get(key));
				return temp.get(key);
			}
				
		}
		return "";
	}
	
	/**
	 * Takes the button name and returns the file path
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found in png hashmap
	 */
	public static String hairFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		for(String i : hairHashMap.keySet())
		{
			//System.out.println("HashMap Big: " + i);
			temp = hairHashMap.get(i);
			//System.out.println("Key: " + key);
			//System.out.println("HashMap: " + temp.keySet());
			if(temp.get(key)!=null)
			{
				//System.out.println("\n***File found: " + temp.get(key) + "\n\n\n");
				return temp.get(key);
			}
				
		}
		return "";
	}
	
	/**
	 * Takes the button name and returns the file path
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found
	 */
	public static String headFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		for(String i : headHashMap.keySet())
		{
			temp = headHashMap.get(i);
			if(temp.get(key)!=null)
			{
				//System.out.println("File found: " + temp.get(key));
				return temp.get(key);
			}
				
		}
		return "";
	}
	
	/**
	 * Takes the button name and returns the file path
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found in png hashmaps
	 */
	public static String torsoFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		for(String i : torsoHashMap.keySet())
		{
			temp = torsoHashMap.get(i);
			if(temp.get(key)!=null)
			{
				//System.out.println("File found: " + temp.get(key));
				return temp.get(key);
			}
				
		}
		return "";
	}
	
	/**
	 * Takes the button name and returns the file path
	 * This one searched all of the hasmaps not just a specific one
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found
	 */
	public static String findFile(String key) throws FileNotFoundException
	{
		//It calls the other methods to see if they have the file path
		//If not, it moves on to the next one
		if(eyeFindFile(key)!= "")
			return eyeFindFile(key);
		else if(hairFindFile(key)!= "")
			return hairFindFile(key);
		else if(headFindFile(key)!= "")
			return headFindFile(key);
		else if(torsoFindFile(key)!= "")
			return torsoFindFile(key);
		else
			throw new FileNotFoundException("ERROR: FILE NOT FOUND IN ANY HASHMAP");
			//if not hashmap has the file, return null
			
	}
}
