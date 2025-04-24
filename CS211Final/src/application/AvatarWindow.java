package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;

import java.io.FileNotFoundException;

import application.Person;

/**
 * Represents the avatar view in the frontend
 * 
 * @author Ben Maigur
 * @version 1.0.0
 */
public class AvatarWindow {
    /**
     * Constructor
     * @param pane The StackPane that displays all of the assets
     * @param person Pointer to the Person object tracking all assets
     */
    public static void display(StackPane pane, Person person) {

        //TODO: Theres definitely a much better solution, but this is just for testing

        try {
            System.out.println("Hair: " + person.getHair().getFilePath());
            System.out.println("Head: " + person.getHead().getFilePath());
            System.out.println("Torso: " + person.getTorso().getFilePath());
            System.out.println("Eyes: " + person.getEyes().getFilePath());
            
            System.out.println(person.getEyes().getFilePath());
            ImageView eyeView = ImageHandler.translateImage(person.getEyes().getFilePath());
            
            ImageView headView = ImageHandler.translateImage(person.getHead().getFilePath());
            
            ImageView torsoView = ImageHandler.translateImage(person.getTorso().getFilePath());
            
            ImageView hairView = ImageHandler.translateImage(person.getHair().getFilePath());
            

            if(pane.getChildren().size() == 0) {
                pane.getChildren().addAll(torsoView, headView, eyeView, hairView);
            } else {
                pane.getChildren().clear();
                pane.getChildren().addAll(torsoView, headView, eyeView, hairView);
            }
            
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
}
