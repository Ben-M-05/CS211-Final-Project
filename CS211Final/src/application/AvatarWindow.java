package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import application.PARTS;

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
            

            if(pane.getChildren().size() == 0) {
            	pane.getChildren().addAll(torsoView, headView, eyeView, hairView, mouthView, noseView,
                		glassesView, goateeView, mustacheView, moleView);
            } else {
                pane.getChildren().clear();
                pane.getChildren().addAll(torsoView, headView, eyeView, hairView, mouthView, noseView,
                		glassesView, goateeView, mustacheView, moleView);
            }
            //github.com/Ben-M-05/CS211-Final-Project.git
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }

    public static void modifySize(StackPane pane, PARTS part, int size) {
        switch(part) {
            case EYES:
                ImageView eyeView = (ImageView) pane.getChildren().get(2);
                eyeView.setFitHeight(size);
                eyeView.setFitWidth(size);
                break;
            case TORSO:
                ImageView torsoView = (ImageView) pane.getChildren().get(0);
                torsoView.setFitHeight(size);
                torsoView.setFitWidth(size);
                break;
            case HEAD:
                ImageView headView = (ImageView) pane.getChildren().get(1);
                headView.setFitHeight(size);
                headView.setFitWidth(size);
                break;
            case MOUTH:
                ImageView mouthView = (ImageView) pane.getChildren().get(4);
                mouthView.setFitHeight(size);
                mouthView.setFitWidth(size);
                break;
            case HAIR:
                ImageView hairView = (ImageView) pane.getChildren().get(3);
                hairView.setFitHeight(size);
                hairView.setFitWidth(size);
                break;
            case NOSE:
                ImageView noseView = (ImageView) pane.getChildren().get(5);
                noseView.setFitHeight(size);
                noseView.setFitWidth(size);
                break;
            case GLASSES:
                ImageView glassesView = (ImageView) pane.getChildren().get(6);
                glassesView.setFitHeight(size);
                glassesView.setFitWidth(size);
                break;
            case MOLE:
                ImageView moleView = (ImageView) pane.getChildren().get(9);
                moleView.setFitHeight(size);
                moleView.setFitWidth(size);
                break;
            case MOUSTACHE:
                ImageView moustacheView = (ImageView) pane.getChildren().get(8);
                moustacheView.setFitHeight(size);
                moustacheView.setFitWidth(size);
                break;
            case GOATEE:
                ImageView goateeView = (ImageView) pane.getChildren().get(7);
                goateeView.setFitHeight(size);
                goateeView.setFitWidth(size);
                break;
        }
            
    }

    public static void modifyLocation(StackPane pane, PARTS part, int location) {
        switch(part) {
            case EYES:
                ImageView eyeView = (ImageView) pane.getChildren().get(2);
                eyeView.setTranslateY(location);
                break;
            case TORSO:
                ImageView torsoView = (ImageView) pane.getChildren().get(0);
                torsoView.setTranslateY(location);
                break;
            case HEAD:
                ImageView headView = (ImageView) pane.getChildren().get(1);
                headView.setTranslateY(location);
                break;
            case MOUTH:
                ImageView mouthView = (ImageView) pane.getChildren().get(4);
                mouthView.setTranslateY(location);
                break;
            case HAIR:
                ImageView hairView = (ImageView) pane.getChildren().get(3);
                hairView.setTranslateY(location);
                break;
            case NOSE:
                ImageView noseView = (ImageView) pane.getChildren().get(5);
                noseView.setTranslateY(location);
                break;
            case GLASSES:
                ImageView glassesView = (ImageView) pane.getChildren().get(6);
                glassesView.setTranslateY(location);
                break;
            case MOLE:
                ImageView moleView = (ImageView) pane.getChildren().get(9);
                moleView.setTranslateY(location);
                break;
            case MOUSTACHE:
                ImageView moustacheView = (ImageView) pane.getChildren().get(8);
                moustacheView.setTranslateY(location);
                break;
            case GOATEE:
                ImageView goateeView = (ImageView) pane.getChildren().get(7);
                goateeView.setTranslateY(location);
                break;
        }
            
    }

}
