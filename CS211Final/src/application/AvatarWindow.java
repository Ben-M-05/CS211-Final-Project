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

    ImageView eyeView;
    ImageView headView;
    ImageView torsoView;
    ImageView hairView;
    ImageView mouthView;
    ImageView noseView;
    ImageView glassesView;
    ImageView goateeView;
    ImageView mustacheView;
    ImageView moleView;
    
    /**
     * Constructor
     * @param pane The StackPane that displays all of the assets
     * @param person Pointer to the Person object tracking all assets
     */

    public void displayInit(StackPane pane, Person person) {

        //TODO: Theres definitely a much better solution, but this is just for testing

        try {

            this.eyeView = ImageHandler.translateImage(person.getEyes().getFilePath());
            this.headView = ImageHandler.translateImage(person.getHead().getFilePath());
            this.torsoView = ImageHandler.translateImage(person.getTorso().getFilePath());
            this.hairView = ImageHandler.translateImage(person.getHair().getFilePath());
            this.mouthView = ImageHandler.translateImage(person.getMouth().getFilePath());
            this.noseView = ImageHandler.translateImage(person.getNose().getFilePath());
            this.glassesView = ImageHandler.translateImage(person.getGlasses().getFilePath());
            this.goateeView = ImageHandler.translateImage(person.getGoatee().getFilePath());
            this.mustacheView = ImageHandler.translateImage(person.getMustache().getFilePath());
            this.moleView = ImageHandler.translateImage(person.getMole().getFilePath());
            
            addToPane(pane);
            
            //github.com/Ben-M-05/CS211-Final-Project.git
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }

    /**
     * Updates an individual component
     *<p> 
     *This is to make sure all of the components are not refreshed when a new one is selected
     * @param part Part type
     * @param person The Person object holding all of the assets
     * @throws FileNotFoundException 
     */
    public void update(Person person, PARTS part, StackPane pane) throws FileNotFoundException {
        switch(part) {
            case EYES:
                this.eyeView = ImageHandler.translateImage(person.getEyes().getFilePath());
                break;
            case TORSO:
                this.torsoView = ImageHandler.translateImage(person.getTorso().getFilePath());
                break;
            case HEAD:
                this.headView = ImageHandler.translateImage(person.getHead().getFilePath());
                break;
            case MOUTH:
                this.mouthView = ImageHandler.translateImage(person.getMouth().getFilePath()); 
                break;
            case HAIR:
                this.hairView = ImageHandler.translateImage(person.getHair().getFilePath());
                break;
            case NOSE:
                this.noseView = ImageHandler.translateImage(person.getNose().getFilePath());
                break;
            case GLASSES:
                this.glassesView = ImageHandler.translateImage(person.getGlasses().getFilePath());
                break;
            case MOLE:
                this.moleView = ImageHandler.translateImage(person.getMole().getFilePath());
                break;
            case MOUSTACHE:
                this.mustacheView = ImageHandler.translateImage(person.getMustache().getFilePath());
                break;
            case GOATEE:
                this.goateeView = ImageHandler.translateImage(person.getGoatee().getFilePath());
                break;
        }

        addToPane(pane);
    }

    public  void modifySize(StackPane pane, PARTS part, int size) {
        switch(part) {
            case EYES:
                this.eyeView.setFitHeight(size);
                this.eyeView.setFitWidth(size);
                break;
            case TORSO:

                this.torsoView.setFitHeight(size);
                this.torsoView.setFitWidth(size);
                break;
            case HEAD:
                this.headView.setFitHeight(size);
                this.headView.setFitWidth(size);
                break;
            case MOUTH:

                this.mouthView.setFitHeight(size);
                this.mouthView.setFitWidth(size);
                break;
            case HAIR:
                this.hairView.setFitHeight(size);
                this.hairView.setFitWidth(size);
                break;
            case NOSE:
                this.noseView.setFitHeight(size);
               this. noseView.setFitWidth(size);
                break;
            case GLASSES:
        
                this.glassesView.setFitHeight(size);
                this.glassesView.setFitWidth(size);
                break;
            case MOLE:
                this.moleView.setFitHeight(size);
                this.moleView.setFitWidth(size);
                break;
            case MOUSTACHE:
                
                this.mustacheView.setFitHeight(size);
                this.mustacheView.setFitWidth(size);
                break;
            case GOATEE:
    
                this.goateeView.setFitHeight(size);
                this.goateeView.setFitWidth(size);
                break;
        }
            
    }

    public  void modifyLocation(StackPane pane, PARTS part, int location) {
        switch(part) {
            case EYES:
                eyeView.setTranslateY(location);
                break;
            case TORSO:

                torsoView.setTranslateY(location);
                break;
            case HEAD:
                headView.setTranslateY(location);
                break;
            case MOUTH:

                mouthView.setTranslateY(location);
                break;
            case HAIR:
                break;
            case NOSE:
                noseView.setTranslateY(location);
                break;
            case GLASSES:
        
                glassesView.setTranslateY(location);
                break;
            case MOLE:
                moleView.setTranslateY(location);
                break;
            case MOUSTACHE:
                
                mustacheView.setTranslateY(location);
                break;
            case GOATEE:
    
                goateeView.setTranslateY(location);
                break;
        }
            
    }


    public void addToPane(StackPane pane) {
        if(pane.getChildren().size() == 0) {
            pane.getChildren().addAll(torsoView, headView, eyeView, hairView, mouthView, noseView,
                    glassesView, goateeView, mustacheView, moleView);
        } else {
            pane.getChildren().clear();
            pane.getChildren().addAll(torsoView, headView, eyeView, hairView, mouthView, noseView,
                    glassesView, goateeView, mustacheView, moleView);
        }
    }
}
