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
	 * the image view for the eye
	 */
    ImageView eyeView;
	/**
	 * the image view for the head
	 */
    ImageView headView;
	/**
	 * the image view for the torso
	 */
    ImageView torsoView;
	/**
	 * the image view for the hair
	 */
    ImageView hairView;
	/**
	 * the image view for the mouth
	 */
    ImageView mouthView;
	/**
	 * the image view for the nose
	 */
    ImageView noseView;
	/**
	 * the image view for the glasses
	 */
    ImageView glassesView;
	/**
	 * the image view for the goatee
	 */
    ImageView goateeView;
	/**
	 * the image view for the mustache
	 */
    ImageView mustacheView;
	/**
	 * the image view for the mole
	 */
    ImageView moleView;
	/**
	 * the image view for blank background
	 */
    ImageView blankView;
    
    /**
     * Constructor
     * @param pane The StackPane that displays all of the assets
     * @param person Pointer to the Person object tracking all assets
     */

    public void displayInit(StackPane pane, Person person) {

        //TODO: Theres definitely a much better solution, but this is just for testing

        try {
        	//background so that we can expand the other images without things shifting
        	Image blankImage = new Image(
        			String.format("file:/CS211-Final-Project/CS211Final/src/Images/blank.png"),
        			1000, 1000, true, false );

        	this.blankView = new ImageView(blankImage);
        	
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
     * @param pane the stackpane being displayed to the user
     * @throws FileNotFoundException if image file not found
     */
    public void update(Person person, PARTS part, StackPane pane) throws FileNotFoundException {
        switch(part) {
            case EYES:
                this.eyeView = ImageHandler.translateImage(person.getEyes().getFilePath());
                modifySize(pane, PARTS.EYES, person.getEyes().getSize());
                modifyLocation(pane, PARTS.EYES, person.getEyes().getYAxis());
                break;
            case TORSO:
                this.torsoView = ImageHandler.translateImage(person.getTorso().getFilePath());
                modifySize(pane, PARTS.TORSO, person.getTorso().getSize());
                modifyLocation(pane, PARTS.TORSO, person.getTorso().getYAxis());
                break;
            case HEAD:
                this.headView = ImageHandler.translateImage(person.getHead().getFilePath());
                modifySize(pane, PARTS.HEAD, person.getHead().getSize());
                modifyLocation(pane, PARTS.HEAD, person.getHead().getYAxis());
                break;
            case MOUTH:
                this.mouthView = ImageHandler.translateImage(person.getMouth().getFilePath()); 
                modifySize(pane, PARTS.MOUTH, person.getMouth().getSize());
                modifyLocation(pane, PARTS.MOUTH, person.getMouth().getYAxis());
                break;
            case HAIR:
                this.hairView = ImageHandler.translateImage(person.getHair().getFilePath());
                modifySize(pane, PARTS.HAIR, person.getHair().getSize());
                modifyLocation(pane, PARTS.HAIR, person.getHair().getYAxis());
                break;
            case NOSE:
                this.noseView = ImageHandler.translateImage(person.getNose().getFilePath());
                modifySize(pane, PARTS.NOSE, person.getNose().getSize());
                modifyLocation(pane, PARTS.NOSE, person.getNose().getYAxis());
                break;
            case GLASSES:
                this.glassesView = ImageHandler.translateImage(person.getGlasses().getFilePath());
                modifySize(pane, PARTS.GLASSES, person.getGlasses().getSize());
                modifyLocation(pane, PARTS.GLASSES, person.getGlasses().getYAxis());
                break;
            case MOLE:
                this.moleView = ImageHandler.translateImage(person.getMole().getFilePath());
                modifySize(pane, PARTS.MOLE, person.getMole().getSize());
                modifyLocation(pane, PARTS.MOLE, person.getMole().getYAxis());
                break;
            case MOUSTACHE:
                this.mustacheView = ImageHandler.translateImage(person.getMustache().getFilePath());
                modifySize(pane, PARTS.MOUSTACHE, person.getMustache().getSize());
                modifyLocation(pane, PARTS.MOUSTACHE, person.getMustache().getYAxis());
                break;
            case GOATEE:
                this.goateeView = ImageHandler.translateImage(person.getGoatee().getFilePath());
                modifySize(pane, PARTS.GOATEE, person.getGoatee().getSize());
                modifyLocation(pane, PARTS.GOATEE, person.getGoatee().getYAxis());
                break;
        }

        addToPane(pane);
    }

    /**
     * Makes the images larger or smaller depending on the size
     * @param pane the stackpane where all the images are stored
     * @param part the PART that is selected
     * @param size length in pixels of one side of the square
     */
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

    /**
     * Moves images up and down on the Y axis
     * @param pane the stackpane where the images are located
     * @param part the PART that is selected
     * @param location where on the Y axis an image should be placed
     */
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
                hairView.setTranslateY(location);
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

    /**
     * Takes all the images and compiles them into a stack pane
     * @param pane the stackpane with all the body parts layed on taop of each other
     */
    public void addToPane(StackPane pane) {
        if(pane.getChildren().size() == 0) {
            pane.getChildren().addAll(torsoView, headView, eyeView, hairView, mouthView, noseView,
                    glassesView, goateeView, mustacheView, moleView, blankView);
        } else {
            pane.getChildren().clear();
            pane.getChildren().addAll(torsoView, headView, eyeView, hairView, mouthView, noseView,
                    glassesView, goateeView, mustacheView, moleView, blankView);
        }
    }
}
