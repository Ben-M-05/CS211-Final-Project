package com.javamaker.Api;

import java.util.regex.Pattern;
import javafx.scene.image.Image;

/**
 * 
 * The ImageHandler class will handle processing the images to display on the frontend.
 * 
 * @author Ben Maigur
 * @version 0.0.1
 */
public class ImageHandler {
    
    /**
     * <h4> Translates the image url to a JavaFX image object </h4>
     * 
     * Width and height by default are 500px
     * 
     * @param URL The Image URL 
     * @return An JavaFX Image object from the URL
     */
    public static Image translateImage(String URL) {
        
        // Ensure that the URL is not empty
        if(URL.equals("") || URL.equals(null)) {
            throw new NullPointerException();
        }

        //TODO: Check with the others about what type of URL we are using, and where the 
        //      files will be located

        if(!(Pattern.matches("*.png", URL))) { // Regex match to ensure valid URL
            throw new IllegalArgumentException(); 
        }



        return new Image(URL, 500, 500, false, false);
    }

    /**
     * <h4> Translates the image url to a JavafX image object </h4>
     * 
     * This overload also includes parameters for width and height of the image
     * 
     * @param URL The Image URL
     * @param w The width of the image
     * @param h The height of the image 
     * @return A JavaFX Image object from the URL
     */
    public static Image translateImage(String URL, int w, int h) {
        
        // Ensure that the URL is not empty
        if(URL.equals("") || URL.equals(null)) {
            throw new NullPointerException();
        }

        //TODO: Check with the others about what type of URL we are using, and where the 
        //      files will be located

        if(!(Pattern.matches("*.png", URL))) { // Regex match to ensure valid URL
            throw new IllegalArgumentException(); 
        }



        return new Image(URL, w, h, false, false);
    }

}
