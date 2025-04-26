package application;

import java.io.FileNotFoundException;

/**
 * Head class
 * @author Joy Janney
 */
class Head extends BodyParts
{
	
	/**
	 * Default constructor that sets the head to head01 option
	 */
	Head(){
		super.setFilePath("head1-01");
	}
	//@Override
	/**
	 * Sets the eye to the image file provided
	 * Since the nose has a skin tone, the nose must be updated
	 * 		to match the skin tone
	 * @param fp - the filepath of the image to set the eye to
	 */
	public void setFilePath(String fp, Person p)
	{
		filePath = fp;
		int start = fp.indexOf("-")-1;
		String key = fp.substring(start, fp.length());
		p.getNose().setFilePath("nose" + key);
	}
}