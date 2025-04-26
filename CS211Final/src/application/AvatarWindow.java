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
            ImageView eyeView = ImageHandler.translateImage(person.getEyes().getFilePath());
            
            ImageView headView = ImageHandler.translateImage(person.getHead().getFilePath());
            
            ImageView torsoView = ImageHandler.translateImage(person.getTorso().getFilePath());
            
            ImageView hairView = ImageHandler.translateImage(person.getHair().getFilePath());
            ImageView mouthView = ImageHandler.translateImage(person.getMouth().getFilePath());
            ImageView noseView = ImageHandler.translateImage(person.getNose().getFilePath());
            ImageView glassesView = ImageHandler.translateImage(person.getGlasses().getFilePath());
            ImageView goateeView = ImageHandler.translateImage(person.getGoatee().getFilePath());
            ImageView mustacheView = ImageHandler.translateImage(person.getMustache().getFilePath());
            ImageView moleView = ImageHandler.translateImage(person.getMole().getFilePath());
           

            if(!(pane.getChildren().isEmpty())) {
                pane.getChildren().removeAll();
            } 
            pane.getChildren().addAll(torsoView, headView, eyeView, hairView, mouthView, noseView,
            		glassesView, goateeView, mustacheView, moleView);
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
}
