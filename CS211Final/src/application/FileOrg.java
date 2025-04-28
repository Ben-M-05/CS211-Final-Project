
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
	 * holds the eye filepaths
	 */
	static HashMap<String, HashMap<String, String>> eyeHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> eyeStyle1 = new HashMap<String, String>();
		//importing eyes with no lashes
		eyeHashMap.put("eyeStyle1", eyeStyle1);//https://www.baeldung.com/java-initialize-hashmap

			//importing eyes with no lashes
		eyeStyle1.put("eye1-01", "Images/eyes/noLash/eyes1-1.png");
		
		eyeStyle1.put("eye1-02", "Images/eyes/noLash/eyes1-2.png");
		eyeStyle1.put("eye1-03", "Images/eyes/noLash/eyes1-3.png");
		eyeStyle1.put("eye1-04", "Images/eyes/noLash/eyes1-4.png");
		eyeStyle1.put("eye1-05", "Images/eyes/noLash/eyes1-5.png");
		eyeStyle1.put("eye1-06", "Images/eyes/noLash/eyes1-6.png");

		HashMap<String, String> eyeStyle2 = new HashMap<String, String>();
		eyeHashMap.put("eyeStyle2", eyeStyle2);//https://www.baeldung.com/java-initialize-hashmap

			//importing eyes with lashes
		eyeStyle2.put("eye2-01", "Images/eyes/withLash/eyes2-1.png");
		eyeStyle2.put("eye2-02", "Images/eyes/withLash/eyes2-2.png");
		eyeStyle2.put("eye2-03", "Images/eyes/withLash/eyes2-3.png");
		eyeStyle2.put("eye2-04", "Images/eyes/withLash/eyes2-4.png");
		eyeStyle2.put("eye2-05", "Images/eyes/withLash/eyes2-5.png");
		eyeStyle2.put("eye2-06", "Images/eyes/withLash/eyes2-6.png");
		
	}
	
	/**
	 * holds hairstyle filepaths
	 */
	static HashMap<String, HashMap<String, String>> hairHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> hairStyle1 = new HashMap<String, String>();
		hairHashMap.put("hairStyle1", hairStyle1);
		//front female hair
		hairStyle1.put("Hair1-01", "Images/hair/hairFront/Female/hairFrontF1-1.png");
		hairStyle1.put("Hair1-02", "Images/hair/hairFront/Female/hairFrontF1-2.png");
		hairStyle1.put("Hair1-03", "Images/hair/hairFront/Female/hairFrontF1-3.png");
		hairStyle1.put("Hair1-04", "Images/hair/hairFront/Female/hairFrontF1-4.png");
		hairStyle1.put("Hair1-05", "Images/hair/hairFront/Female/hairFrontF1-5.png");
		hairStyle1.put("Hair1-06", "Images/hair/hairFront/Female/hairFrontF1-6.png");
		hairStyle1.put("Hair1-07", "Images/hair/hairFront/Female/hairFrontF1-7.png");
		hairStyle1.put("Hair1-08", "Images/hair/hairFront/Female/hairFrontF1-8.png");
		
		HashMap<String, String> hairStyle2 = new HashMap<String, String>();
		hairHashMap.put("hairStyle2", hairStyle2);
		//front male hair
		hairStyle2.put("Hair2-01","Images/hair/hairFront/Male/hairFrontM1-1.png");
		hairStyle2.put("Hair2-02","Images/hair/hairFront/Male/hairFrontM1-2.png");
		hairStyle2.put("Hair2-03","Images/hair/hairFront/Male/hairFrontM1-3.png");
		hairStyle2.put("Hair2-04","Images/hair/hairFront/Male/hairFrontM1-4.png");
		hairStyle2.put("Hair2-05","Images/hair/hairFront/Male/hairFrontM1-5.png");
		hairStyle2.put("Hair2-06","Images/hair/hairFront/Male/hairFrontM1-6.png");
		hairStyle2.put("Hair2-07","Images/hair/hairFront/Male/hairFrontM1-7.png");
		hairStyle2.put("Hair2-08","Images/hair/hairFront/Male/hairFrontM1-8.png");
		//importing back female hair
		/*hairHashMap.put("","Images/hair/hairBack/Female/hairBackF1-1.png");
		hairHashMap.put("","Images/hair/hairBack/Female/hairBackF1-2.png");
		hairHashMap.put("","Images/hair/hairBack/Female/hairBackF1-3.png");
		hairHashMap.put("","Images/hair/hairBack/Female/hairBackF1-4.png");
		hairHashMap.put("","Images/hair/hairBack/Female/hairBackF1-5.png");
		hairHashMap.put("","Images/hair/hairBack/Female/hairBackF1-6.png");
		hairHashMap.put("","Images/hair/hairBack/Female/hairBackF1-7.png");
		hairHashMap.put("","Images/hair/hairBack/Female/hairBackF1-8.png");*/
		
		
	}
	
	/**
	 * holds head filepaths
	 */
	static HashMap<String, HashMap<String, String>> headHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> headStyle1 = new HashMap<String, String>();
		headHashMap.put("headStyle1", headStyle1);
		//importing the heads
		headStyle1.put("head1-01","Images/head/head1-1.png");
		headStyle1.put("head1-02","Images/head/head1-2.png");
		headStyle1.put("head1-03","Images/head/head1-3.png");
		headStyle1.put("head1-04","Images/head/head1-4.png");
		headStyle1.put("head1-05","Images/head/head1-5.png");
		headStyle1.put("head1-06","Images/head/head1-6.png");
	}
	/**
	 * Holds the torso style hashmaps
	 */
	static HashMap<String, HashMap<String, String>> torsoHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> torsoStyle1 = new HashMap<String, String>();
		torsoHashMap.put("torsoStyle1", torsoStyle1);
		//importing the torsos
		torsoStyle1.put("torso1-12","Images/torso/torso1-01.png");
		torsoStyle1.put("torso1-02","Images/torso/torso1-02.png");
		torsoStyle1.put("torso1-03","Images/torso/torso1-03.png");
		torsoStyle1.put("torso1-04","Images/torso/torso1-04.png");
		torsoStyle1.put("torso1-05","Images/torso/torso1-05.png");
		torsoStyle1.put("torso1-06","Images/torso/torso1-06.png");
		torsoStyle1.put("torso1-07","Images/torso/torso1-07.png");
		torsoStyle1.put("torso1-08","Images/torso/torso1-08.png");
		torsoStyle1.put("torso1-09","Images/torso/torso1-09.png");
		torsoStyle1.put("torso1-10","Images/torso/torso1-10.png");
		torsoStyle1.put("torso1-11","Images/torso/torso1-11.png");
		torsoStyle1.put("torso1-01","Images/torso/torso1-12.png");	
	}
	
	/**
	 * Holds mouths filepaths
	 */
	static HashMap<String, HashMap<String, String>> mouthHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> mouthStyle1 = new HashMap<String, String>();
		//importing eyes with no lashes
		mouthHashMap.put("mouthStyle1", mouthStyle1);//https://www.baeldung.com/java-initialize-hashmap

			//line
		mouthStyle1.put("mouth1-01", "Images/mouth/mouth1/mouth1-1.png");
		
		
		HashMap<String, String> mouthStyle2 = new HashMap<String, String>();
		//importing eyes with no lashes
		mouthHashMap.put("mouthStyle2", mouthStyle2);//https://www.baeldung.com/java-initialize-hashmap

			//lips
		mouthStyle2.put("mouth2-01", "Images/mouth/mouth2/mouth2-1.png");
		mouthStyle2.put("mouth2-02", "Images/mouth/mouth2/mouth2-2.png");
		mouthStyle2.put("mouth2-03", "Images/mouth/mouth2/mouth2-3.png");
		mouthStyle2.put("mouth2-04", "Images/mouth/mouth2/mouth2-4.png");
		mouthStyle2.put("mouth2-05", "Images/mouth/mouth2/mouth2-5.png");
		
	}
	
	/**
	 * holds the nose filepaths
	 */
	static HashMap<String, HashMap<String, String>> noseHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		//only one style currently
		HashMap<String, String> noseStyle1 = new HashMap<String, String>();
		noseStyle1.put("nose1-01", "Images/nose/nose1/nose1-1.png");
		noseStyle1.put("nose1-02", "Images/nose/nose1/nose1-2.png");
		noseStyle1.put("nose1-03", "Images/nose/nose1/nose1-3.png");
		noseStyle1.put("nose1-04", "Images/nose/nose1/nose1-4.png");
		noseStyle1.put("nose1-05", "Images/nose/nose1/nose1-5.png");
		noseStyle1.put("nose1-06", "Images/nose/nose1/nose1-6.png");
		noseHashMap.put("noseStyle1", noseStyle1);
		
	}
	
	/**
	 * holds the goatee filepaths
	 */
	static HashMap<String, HashMap<String, String>> goateeHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		HashMap<String, String> goateeStyle1 = new HashMap<String, String>();
		goateeStyle1.put("goatee1-01", "Images/facial/goatee/goatee1/goatee1-1.png");
		goateeStyle1.put("goatee1-02", "Images/facial/goatee/goatee1/goatee1-2.png");
		goateeStyle1.put("goatee1-03", "Images/facial/goatee/goatee1/goatee1-3.png");
		goateeStyle1.put("goatee1-04", "Images/facial/goatee/goatee1/goatee1-4.png");
		goateeStyle1.put("goatee1-05", "Images/facial/goatee/goatee1/goatee1-5.png");
		goateeStyle1.put("goatee1-06", "Images/facial/goatee/goatee1/goatee1-6.png");
		goateeStyle1.put("goatee1-07", "Images/facial/goatee/goatee1/goatee1-7.png");
		goateeStyle1.put("goatee1-08", "Images/facial/goatee/goatee1/goatee1-8.png");
		goateeStyle1.put("goatee1-09", "Images/blank.png");
		
		
		goateeHashMap.put("goateeStyle1", goateeStyle1);
	}
	
	/**
	 * holds the mustache filepaths
	 */
	static HashMap<String, HashMap<String, String>> mustacheHashMap = new HashMap<String, HashMap<String, String>>();
	static {
		
		HashMap<String, String> mustahceStyle1 = new HashMap<String, String>();
		mustahceStyle1.put("mustache1-01", "Images/facial/mustache/mustache1/mustache1-1.png");
		mustahceStyle1.put("mustache1-02", "Images/facial/mustache/mustache1/mustache1-2.png");
		mustahceStyle1.put("mustache1-03", "Images/facial/mustache/mustache1/mustache1-3.png");
		mustahceStyle1.put("mustache1-04", "Images/facial/mustache/mustache1/mustache1-4.png");
		mustahceStyle1.put("mustache1-05", "Images/facial/mustache/mustache1/mustache1-5.png");
		mustahceStyle1.put("mustache1-06", "Images/facial/mustache/mustache1/mustache1-6.png");
		mustahceStyle1.put("mustache1-07", "Images/facial/mustache/mustache1/mustache1-7.png");
		mustahceStyle1.put("mustache1-08", "Images/facial/mustache/mustache1/mustache1-8.png");
		mustahceStyle1.put("mustache1-09", "Images/blank.png");
		
		mustacheHashMap.put("facialStyle1", mustahceStyle1);
		
	}
	
	/**
	 * holds the glasses filepath
	 */
	static HashMap<String, HashMap<String, String>> glassesHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		
		HashMap<String, String> glassesStyle1 = new HashMap<String, String>();
		glassesStyle1.put("glasses1-01", "Images/glasses/glasses1/glasses1-1.png");
		glassesStyle1.put("glasses1-02", "Images/glasses/glasses1/glasses1-2.png");
		glassesStyle1.put("glasses1-03", "Images/glasses/glasses1/glasses1-3.png");
		glassesStyle1.put("glasses1-04", "Images/glasses/glasses1/glasses1-4.png");
		glassesStyle1.put("glasses1-05", "Images/glasses/glasses1/glasses1-5.png");
		glassesStyle1.put("glasses1-06", "Images/glasses/glasses1/glasses1-6.png");
		glassesStyle1.put("glasses1-07", "Images/blank.png");
		
		
		glassesHashMap.put("glasssesStyle1", glassesStyle1);
		
	}
	
	/**
	 * holds the mole filepaths
	 */
	static HashMap<String, HashMap<String, String>> moleHashMap = new HashMap<String, HashMap<String, String>>();
	static{//https://www.baeldung.com/java-initialize-hashmap
		//options are mole or no mole
		HashMap<String, String> moleStyle1 = new HashMap<String, String>();
		moleStyle1.put("mole1-01", "Images/mole/mole1/mole1-1.png");
		moleStyle1.put("mole1-02", "Images/blank.png");
		
		moleHashMap.put("moleStyle1", moleStyle1);
		
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
		
		/* Mouth */
		//style 1
		colorHashMap.put("mouth1-01","#000000");
		colorHashMap.put("mouth2-01","#e57034");
		colorHashMap.put("mouth2-02","#e3392c");
		colorHashMap.put("mouth2-03","#E0382D");
		colorHashMap.put("mouth2-04","#d86a57");
		colorHashMap.put("mouth2-05","#aa7094");
		//style2
		colorHashMap.put("nose1-01", "#000000");
		colorHashMap.put("nose1-02", "#000000");
		colorHashMap.put("nose1-03", "#000000");
		colorHashMap.put("nose1-04", "#000000");
		colorHashMap.put("nose1-05", "#000000");
		colorHashMap.put("nose1-06", "#000000");
		
		/* Glasses */
		colorHashMap.put("glasses1-01", "#000000");
		colorHashMap.put("glasses1-02", "#222220");
		colorHashMap.put("glasses1-03", "#9b2c20");
		colorHashMap.put("glasses1-04", "#2f3a6d");
		colorHashMap.put("glasses1-05", "#a06c28");
		colorHashMap.put("glasses1-06", "#7f7872");
		colorHashMap.put("glasses1-07", "#ffffff");
		
		/* Goatee */
		colorHashMap.put("goatee1-01", "#c69247");
		colorHashMap.put("goatee1-02", "#674520");
		colorHashMap.put("goatee1-03", "#3b3013");
		colorHashMap.put("goatee1-04", "#5d5d63");
		colorHashMap.put("goatee1-05", "#562e16");
		colorHashMap.put("goatee1-06", "#3e160b");
		colorHashMap.put("goatee1-07", "#3b1510");
		colorHashMap.put("goatee1-08", "#141414");
		colorHashMap.put("goatee1-09", "#ffffff");
		
		/* Mustache */
		colorHashMap.put("mustache1-01", "#cca85c");
		colorHashMap.put("mustache1-02", "#885f28");
		colorHashMap.put("mustache1-03", "#50431a");
		colorHashMap.put("mustache1-04", "#7f7f86");
		colorHashMap.put("mustache1-05", "#7a4120");
		colorHashMap.put("mustache1-06", "#591f12");
		colorHashMap.put("mustache1-07", "#402415");
		colorHashMap.put("mustache1-08", "#1b1b1b");
		colorHashMap.put("mustache1-09", "#ffffff");
		
		/* mole */
		colorHashMap.put("mole1-01", "#000000");
		colorHashMap.put("mole1-02", "#ffffff");
	}
	
	
	//Getters for the filepath
	/**
	 * Takes the eye button name and returns the file path if its in the eye hashmap
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
	 * Takes the hair button name and returns the file path if found in the hair hashmap
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
			temp = hairHashMap.get(i);
			if(temp.get(key)!=null)
			{
				return temp.get(key);
			}
				
		}
		return "";
	}
	
	/**
	 * Takes the head button name and returns the file path if its in the head hashmap
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
	 * Takes the torso button name and returns the file path if it in the torso hashmap
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
	 * Takes the mouth button name and returns the file path if its in the mouth hashmap
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found in png hashmaps
	 */
	public static String mouthFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		for(String i : mouthHashMap.keySet())
		{
			temp = mouthHashMap.get(i);
			if(temp.get(key)!=null)
			{
				//System.out.println("File found: " + temp.get(key));
				return temp.get(key);
			}
				
		}
		return "";
	}
	
	/**
	 * Takes the nose button name and returns the file path if it is in the nose file path
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found in png hashmaps
	 */
	public static String noseFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		
		for(String i : noseHashMap.keySet())
		{
			temp = noseHashMap.get(i);
			if(temp.get(key)!=null)
			{
				return temp.get(key);
			}
				
		}
		return "";
	}
	
	/**
	 * Takes the glasses button name and returns the file path if it sin the glasses hashmap
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found in png hashmaps
	 */
	public static String glassesFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		
		for(String i : glassesHashMap.keySet())
		{
			temp = glassesHashMap.get(i);
			if(temp.get(key)!=null)
			{
				return temp.get(key);
			}
				
		}
		return "";
	}
	
	/**
	 * Takes the goatee button name and returns the file path if it is in the goatee hashmap
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found in png hashmaps
	 */
	public static String goateeFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		
		for(String i : goateeHashMap.keySet())
		{
			temp = goateeHashMap.get(i);
			if(temp.get(key)!=null)
			{
				return temp.get(key);
			}
				
		}
		return "";
	}
	/**
	 * Takes the mustache button name and returns the file path if it sin the mustache filepath
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found in png hashmaps
	 */
	public static String mustacheFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		
		for(String i : mustacheHashMap.keySet())
		{
			temp = mustacheHashMap.get(i);
			if(temp.get(key)!=null)
			{
				return temp.get(key);
			}
				
		}
		return "";
	}
	
	/**
	 * Takes the mole button name and returns the file path if it sin the mole filepath
	 * @param key - String: key associated with the filepath
	 * 		int the hashmap
	 * @return the file path
	 * @throws FileNotFoundException if file not found in png hashmaps
	 */
	public static String moleFindFile(String key) throws FileNotFoundException
	{
		HashMap<String, String> temp = new HashMap<String, String>();
		
		for(String i : moleHashMap.keySet())
		{
			temp = moleHashMap.get(i);
			if(temp.get(key)!=null)
			{
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
		else if(mouthFindFile(key)!= "")
			return mouthFindFile(key);
		else if(noseFindFile(key)!= "")
			return noseFindFile(key);
		else if(glassesFindFile(key)!= "")
			return glassesFindFile(key);
		else if(goateeFindFile(key)!= "")
			return goateeFindFile(key);
		else if(mustacheFindFile(key)!= "")
			return mustacheFindFile(key);
		else if(moleFindFile(key)!= "")
			return moleFindFile(key);
		else
			throw new FileNotFoundException("ERROR: FILE " + key + " NOT FOUND IN ANY HASHMAP");
			//if not hashmap has the file, return null
			
	}
}
