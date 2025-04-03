package application;
import java.util.HashMap; // taken from https://www.w3schools.com/java/java_hashmap.asp

/**
 * @author Joy Janney
 */
public final class FileOrg
{
	//This will hold the file locations under their buttons names
	static HashMap<String, String> fileLocation = new HashMap<String, String>();
	static{//https://www.baeldung.com/java-initialize-hashmap

		//importing eyes with no lashes
		fileLocation.put("eye01", "src/Images/eyes/noLash/eyes1-1.png");
		fileLocation.put("eye02", "src/Images/eyes/noLash/eyes1-2.png");
		fileLocation.put("eye03", "src/Images/eyes/noLash/eyes1-3.png");
		fileLocation.put("eye04", "src/Images/eyes/noLash/eyes1-4.png");
		fileLocation.put("eye05", "src/Images/eyes/noLash/eyes1-5.png");
		fileLocation.put("eye06", "src/Images/eyes/noLash/eyse1-6.png");

		//importing eyes with lashes
		fileLocation.put("eye07", "src/Images/eyes/withLash/eyes2-1.png");
		fileLocation.put("eye08", "src/Images/eyes/withLash/eyes2-2.png");
		fileLocation.put("eye09", "src/Images/eyes/withLash/eyes2-3.png");
		fileLocation.put("eye10", "src/Images/eyes/withLash/eyes2-4.png");
		fileLocation.put("eye11", "src/Images/eyes/withLash/eyes2-5.png");
		fileLocation.put("eye12", "src/Images/eyes/withLash/eyes2-6.png");
		
		//importing front female hair
		fileLocation.put("fHair01", "src/Images/hair/hairFront/Female/hairFrontF1-1.png");
		fileLocation.put("fHair02", "src/Images/hair/hairFront/Female/hairFrontF1-2.png");
		fileLocation.put("fHair03", "src/Images/hair/hairFront/Female/hairFrontF1-3.png");
		fileLocation.put("fHair04", "src/Images/hair/hairFront/Female/hairFrontF1-4.png");
		fileLocation.put("fHair05", "src/Images/hair/hairFront/Female/hairFrontF1-5.png");
		fileLocation.put("fHair06", "src/Images/hair/hairFront/Female/hairFrontF1-6.png");
		fileLocation.put("fHair07", "src/Images/hair/hairFront/Female/hairFrontF1-7.png");
		fileLocation.put("fHair08", "src/Images/hair/hairFront/Female/hairFrontF1-8.png");
		
		//importing front male hair
		fileLocation.put("mHair01","src/Images/hair/hairFront/Male/hairFrontM1-1.png");
		fileLocation.put("mHair02","src/Images/hair/hairFront/Male/hairFrontM1-2.png");
		fileLocation.put("mHair03","src/Images/hair/hairFront/Male/hairFrontM1-3.png");
		fileLocation.put("mHair04","src/Images/hair/hairFront/Male/hairFrontM1-4.png");
		fileLocation.put("mHair05","src/Images/hair/hairFront/Male/hairFrontM1-5.png");
		fileLocation.put("mHair06","src/Images/hair/hairFront/Male/hairFrontM1-6.png");
		fileLocation.put("mHair07","src/Images/hair/hairFront/Male/hairFrontM1-7.png");
		fileLocation.put("mHair08","src/Images/hair/hairFront/Male/hairFrontM1-8.png");
		
		//importing back female hair
		/*fileLocation.put("","src/Images/hair/hairBack/Female/hairBackF1-1.png");
		fileLocation.put("","src/Images/hair/hairBack/Female/hairBackF1-2.png");
		fileLocation.put("","src/Images/hair/hairBack/Female/hairBackF1-3.png");
		fileLocation.put("","src/Images/hair/hairBack/Female/hairBackF1-4.png");
		fileLocation.put("","src/Images/hair/hairBack/Female/hairBackF1-5.png");
		fileLocation.put("","src/Images/hair/hairBack/Female/hairBackF1-6.png");
		fileLocation.put("","src/Images/hair/hairBack/Female/hairBackF1-7.png");
		fileLocation.put("","src/Images/hair/hairBack/Female/hairBackF1-8.png");*/
		
		//importing the heads
		fileLocation.put("head01","src/Images/head/head1-1.png");
		fileLocation.put("head02","src/Images/head/head1-2.png");
		fileLocation.put("head03","src/Images/head/head1-3.png");
		fileLocation.put("head04","src/Images/head/head1-4.png");
		fileLocation.put("head05","src/Images/head/head1-5.png");
		fileLocation.put("head06","src/Images/head/head1-6.png");
		
		//importing the torsos
		fileLocation.put("torso01","src/Images/torso/torso1-01.png");
		fileLocation.put("torso02","src/Images/torso/torso1-02.png");
		fileLocation.put("torso03","/src/Images/torso/torso1-03.png");
		fileLocation.put("torso04","src/Images/torso/torso1-04.png");
		fileLocation.put("torso05","src/Images/torso/torso1-05.png");
		fileLocation.put("torso06","src/Images/torso/torso1-06.png");
		fileLocation.put("torso07","src/Images/torso/torso1-07.png");
		fileLocation.put("torso08","src/Images/torso/torso1-08.png");
		fileLocation.put("torso09","src/Images/torso/torso1-09.png");
		fileLocation.put("torso10","src/ImagesL/torso/torso1-10.png");
		fileLocation.put("torso11","src/Images/torso/torso1-11.png");
		fileLocation.put("torso12","src/Images/torso/torso1-12.png");
		
		
	}
	
	/**
	 * Takes the button name and returns the file path
	 * @author Joy Janney
	 * @param t
	 * @return the file path
	 */
	public static String findFile(String t)
	{
		return fileLocation.get(t);
	}
}