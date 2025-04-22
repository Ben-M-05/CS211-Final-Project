package application;

import java.io.FileNotFoundException;

//package com.javamaker.Api;

import java.util.regex.Pattern;

//import com.javamaker.Modules.FileOrg;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * 
 * The ImageHandler class will handle processing the images to display on the frontend.
 * 
 * @author Ben Maigur
 * @version 1.0.1
 */
public class ImageHandler {
    
    /**
     * <h4> Translates the image fileName to a JavaFX image object </h4>
     * 
     * Width and height by default are 500px
     * 
     * @param fileName The Image fileName 
     * @return An JavaFX Image object from the fileName
     * @throws FileNotFoundException 
     */
    public static ImageView translateImage(String fileName) throws FileNotFoundException {
        
        // Ensure that the fileName is not empty
        if(fileName.equals("") || fileName.equals(null)) {
            throw new NullPointerException("translateImage: File name is empty");
        }

        //TODO: Check with the others about what type of fileName we are using, and where the 
        //      files will be located

        // if(!(Pattern.matches("*.png", fileName))) { // Regex match to ensure valid fileName
        //     throw new IllegalArgumentException(); 
        // }

        
        String file = FileOrg.findFile(fileName);

        Image image = new Image(String.format("file:" + file), 500, 500, true, false);
        return new ImageView(image);
    }

    /**
     * <h4> Translates the image fileName to a JavafX image object </h4>
     * 
     * This overload also includes parameters for width and height of the image
     * 
     * @param fileName The image file name
     * @param w The width of the image
     * @param h The height of the image 
     * @return A JavaFX Image object from the fileName
     * @throws FileNotFoundException 
     */
    public static Image translateImage(String fileName, int w, int h) throws FileNotFoundException {
        
        // Ensure that the fileName is not empty
        if(fileName.equals("") || fileName.equals(null)) {
            throw new NullPointerException();
        }

        //TODO: Check with the others about what type of fileName we are using, and where the 
        //      files will be located

        if(!(Pattern.matches("*.png", fileName))) { // Regex match to ensure valid fileName
            throw new IllegalArgumentException(); 
        }


        String file = FileOrg.findFile(fileName);


        return new Image(file, w, h, true, false);
    }

    /**
     * Modifies the size of the component
     * 
     * @param image Image being modified 
     * @param width New width of the image
     * @param height New height of the image
     */
    public static void modifySize(ImageView image, int width, int height) {
        image.setFitHeight(height);
        image.setFitWidth(width);
    }   
 
}