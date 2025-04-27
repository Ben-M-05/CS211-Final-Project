package application;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import javafx.application.Application;
import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * Main Class where the buttons will be created
 * and user input recorded
 */
public class Main extends Application {
	
	@Override
	/**
	 * The scene where everything will happen
	 * @author Joy Janney
	 */
	public void start(Stage primaryStage) {
		try {
			final int IMAGE_BUTTON_SIZE = 75;
			final double TEXT_BUTTON_HEIGHT = 35;
			final double TEXT_BUTTON_WIDTH = 60;

			
			/*
			 * The display will include three portions: top, left, and center
			 * Top - The body buttons that will take the user to the correct
			 * 			option pane.
			 * Left - The option pane for the selected body part
			 * 			These will be made of VBoxes that include images as buttons
			 * Center - The image of their avatar
			 */
			BorderPane root = new BorderPane();
			Person userPerson = new Person();
			StackPane pane = new StackPane();

			AvatarWindow window = new AvatarWindow();
			
			// Tracks the selected part to be modified by the sliders
			// https://stackoverflow.com/questions/30026824/modifying-local-variable-from-inside-lambda
			


			//preparing the left option pane
			VBox partsOption = new VBox();
			partsOption.setAlignment(Pos.TOP_RIGHT);
			root.setRight(partsOption);
			colorButtonGP(userPerson, IMAGE_BUTTON_SIZE, "head",
			FileOrg.headHashMap.get("headStyle1"), 1, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
			
			// Head Buttons	- OG Sarah Parr	New Joy Janney
			//https://www.w3schools.com/howto/howto_css_button_on_image.asp
			/*
			 * The names of the hashmaps follow a pattern, [bodypart]xx
			 * Accordingly, we will loop through all of the hasmaps to display the images
			 * The buttons will be created and added to a gridpane of their respective body part
			 */
			
			//Making the eye grid pane and adding the eye images as buttons
			GridPane gpEye = new GridPane();
			gpEye.getStyleClass().add("gpOpt");
			gpEye.setHgap(1);
			gpEye.setVgap(1);
			styleButtonCreate(userPerson, gpEye, IMAGE_BUTTON_SIZE, "eye",
					FileOrg.eyeHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
			
			//Creating the hair gridpane and adding the buttons to it
			GridPane gpHair = new GridPane();
			gpHair.getStyleClass().add("gpOpt");
			gpHair.setHgap(1);
			gpHair.setVgap(1);
			styleButtonCreate(userPerson, gpHair, IMAGE_BUTTON_SIZE, "Hair",
					FileOrg.hairHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
			
			//Creating the torso gridpane and adding the buttons to it
			GridPane gpTorso = new GridPane();
			gpTorso.getStyleClass().add("gpOpt");
			gpTorso.setHgap(1);
			gpTorso.setVgap(1);
			styleButtonCreate(userPerson, gpTorso, IMAGE_BUTTON_SIZE, "torso",
					FileOrg.torsoHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
						
			
			//Creating the head gridpane and adding the buttons to it
			GridPane gpHead = new GridPane();
			gpHead.getStyleClass().add("gpOpt");
			gpHead.setHgap(1);
			gpHead.setVgap(1);
			styleButtonCreate(userPerson, gpHead, IMAGE_BUTTON_SIZE, "head",
					FileOrg.headHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
			
			//Creating the mouth gridpane and adding the buttons to it
			GridPane gpMouth = new GridPane();
			gpMouth.getStyleClass().add("gpOpt");
			gpMouth.setHgap(1);
			gpMouth.setVgap(1);
			styleButtonCreate(userPerson, gpMouth, IMAGE_BUTTON_SIZE, "mouth",
					FileOrg.mouthHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
			
			//Creating the glasses gridpane and adding the buttons to it
			GridPane gpGlasses = new GridPane();
			gpGlasses.getStyleClass().add("gpOpt");
			gpGlasses.setHgap(1);
			gpGlasses.setVgap(1);
			styleButtonCreate(userPerson, gpGlasses, IMAGE_BUTTON_SIZE, "glasses",
					FileOrg.glassesHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
			
			//Creating the goatee gridpane and adding the buttons to it
			GridPane gpGoatee = new GridPane();
			gpGoatee.getStyleClass().add("gpOpt");
			gpGoatee.setHgap(1);
			gpGoatee.setVgap(1);
			styleButtonCreate(userPerson, gpGoatee, IMAGE_BUTTON_SIZE, "goatee",
					FileOrg.goateeHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
			
			//Creating the mustache gridpane and adding the buttons to it
			GridPane gpMustache = new GridPane();
			gpMustache.getStyleClass().add("gpOpt");
			gpMustache.setHgap(1);
			gpMustache.setVgap(1);
			styleButtonCreate(userPerson, gpMustache, IMAGE_BUTTON_SIZE, "mustache",
					FileOrg.mustacheHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
			
			//Creating the mole gridpane and adding the buttons to it
			GridPane gpMole = new GridPane();
			gpMole.getStyleClass().add("gpOpt");
			gpMole.setHgap(1);
			gpMole.setVgap(1);
			styleButtonCreate(userPerson, gpMole, IMAGE_BUTTON_SIZE, "mole",
					FileOrg.moleHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);
			
			//Creating the nose gridpane and adding the buttons to it
			/*GridPane gpNose = new GridPane();
			gpMole.getStyleClass().add("gpOpt");
			gpMole.setHgap(1);
			gpMole.setVgap(1);
			styleButtonCreate(userPerson, gpNose, IMAGE_BUTTON_SIZE, "nose",
					FileOrg.noseHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE, window);*/
			
			/*
			 * Creating a blank gridpane so that if no style is selected
			 * the buttons won't visibly shift
			 */
			GridPane blankGP = new GridPane();
			Button blankB1 = new Button();
			blankB1.setMinSize(IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE);
			blankB1.setStyle("-fx-background-color: transparent");
			Button blankB2 = new Button();
			blankB2.setMinSize(IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE);
			blankB2.setStyle("-fx-background-color: transparent");
			Button blankB3 = new Button();
			blankB3.setMinSize(IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE);
			blankB3.setStyle("-fx-background-color: transparent");
			
			blankGP.add(blankB1, 0, 0);
			blankGP.add(blankB2, 1, 0);
			blankGP.add(blankB3, 2, 0);

			root.setCenter(gpHead); //Presenting a GridPane to display to the user
			
				
			//https://docs.oracle.com/javafx/2/ui_controls/button.html
			/*If they select a new button for the top, a new GridPane will be display
			 * The GridPane will only show the user the options related to the tab
			 * Basically, if they click eye, it will show them the eye options
			 */
			
			/*
			 * Head button and associated style and presenting head styles
			 */
			Button headButton = new Button("Head");
			headButton.getStyleClass().add("bMain");
			headButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			headButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			headButton.setOnAction(a -> 
			{
				root.setCenter(gpHead);
				root.setRight(blankGP);
			});
			
			//creating the torso style gridpan
			Button torsoButton = new Button("Torso");
			torsoButton.getStyleClass().add("bMain");
			torsoButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			torsoButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			torsoButton.setOnAction(a -> 
			{
				root.setCenter(gpTorso);
				root.setRight(blankGP);
			});
			
			//creating the eye style gridpane
			Button eyeButton = new Button("Eye");
			eyeButton.getStyleClass().add("bMain");
			eyeButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			eyeButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			eyeButton.setOnAction(a -> 
			{
				root.setCenter(gpEye);
				root.setRight(blankGP);
			});
			
			//creating the hair style gridpane
			Button hairButton = new Button("Hair");
			hairButton.getStyleClass().add("bMain");
			hairButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			hairButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			hairButton.setOnAction(a -> 
			{
				root.setCenter(gpHair);
				root.setRight(blankGP);
			});
			
			
			//creating the mouth style gridpane
			Button mouthButton = new Button("Mouth");
			mouthButton.getStyleClass().add("bMain");
			mouthButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			mouthButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			mouthButton.setOnAction(a -> 
			{
				root.setCenter(gpMouth);
				root.setRight(blankGP);
			});
			
			//creating the glasses style gridpane
			Button glassesButton = new Button("Glasses");
			glassesButton.getStyleClass().add("bMain");
			glassesButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			glassesButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			glassesButton.setOnAction(a -> 
			{
				root.setCenter(gpGlasses);
				root.setRight(blankGP);
			});
			
			//creating the goatee style gridpane
			Button goateeButton = new Button("Goatee");
			goateeButton.getStyleClass().add("bMain");
			goateeButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			goateeButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			goateeButton.setOnAction(a -> 
			{
				root.setCenter(gpGoatee);
				root.setRight(blankGP);
			});
			
			//creating the mustache style gridpane
			Button mustacheButton = new Button("Mustache");
			mustacheButton.getStyleClass().add("bMain");
			mustacheButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			mustacheButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			mustacheButton.setOnAction(a -> 
			{
				root.setCenter(gpMustache);
				root.setRight(blankGP);
			});
			
			//creating the mole style gridpane
			Button moleButton = new Button("Mole");
			moleButton.getStyleClass().add("bMain");
			moleButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			moleButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			moleButton.setOnAction(a -> 
			{
				root.setCenter(gpMole);
				root.setRight(blankGP);
			});
			
			/*
			 * IMPORTANT CHANGE IN CODE!
			 * Nose only has one style and it must corrolate to the skin tone
			 * Accordingly the user is NOT allowed to change the color because
			 * 		the skin tone and color are already matched
			 * So, the style buttons are not used and instead just the sliders displayed
			 */
			//Nose GP
			GridPane gpNose = new GridPane();
			
			//Creating the sizeSlider ONLY to be used for the nose
			Slider sizeSlider = new Slider(.1, 5, 1);
			//Setting it to the saved size so that it corresponds to the current size
			sizeSlider.setValue(userPerson.getNose().getSize()/100);
			sizeSlider.setShowTickMarks(true);
			
			//changes image scale based off of slider input
			sizeSlider.valueProperty().addListener(new ChangeListener<Number>() {
					public void changed(ObservableValue<? extends Number> observerable,
							Number oldValue, Number newValue) {
						int newSize = (int) (100 * (double) newValue);//one tick is 100 pixels
						window.modifySize(pane, PARTS.NOSE, newSize);
						userPerson.getNose().setSize(newSize);
					}
				});
			
			//Creating the locationSlider ONLY to be used for the nose
			Slider locationSlider = new Slider(-1, 1, 0);
			locationSlider.setValue(userPerson.getNose().getYAxis()/100);
			locationSlider.setShowTickMarks(true);

			//changes asset Y axis based off of slider input
			locationSlider.valueProperty().addListener(new ChangeListener<Number>() {
				public void changed(ObservableValue<? extends Number> observerable, Number oldValue, Number newValue) {
					int newLocation = (int) (-100 * (double) newValue);//1 tick is 100 pixels
					window.modifyLocation(pane, PARTS.NOSE, newLocation);
					userPerson.getNose().setYAxis(newLocation);
				}
			});
			
			//Adding text so user knows what the sliders are for
			Text sizeText = new Text("Size");
			Text locationText = new Text("Location");
			//Adding sliders and text to the gridpane
			gpNose.add(blankGP, 0, 0);
			gpNose.add(sizeText, 0, 1);
			gpNose.add(sizeSlider, 0, 2);
			gpNose.add(locationText, 0, 3);
			gpNose.add(locationSlider, 0, 4);
			//displaying the gridpane
			
			//creating the mole style gridpane
			Button noseButton = new Button("Nose");
			noseButton.getStyleClass().add("bMain");
			noseButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			noseButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			noseButton.setOnAction(a -> 
			{
				root.setCenter(blankGP);//no nose styles
				root.setRight(gpNose);
			});
			
			
			//Preparing the options in the top button in a HBOX
			HBox bodyParts = new HBox(headButton, torsoButton, eyeButton, hairButton,
					mouthButton, glassesButton, goateeButton, mustacheButton, moleButton, noseButton);
			bodyParts.setAlignment(Pos.TOP_RIGHT);

			//displaying the default avatar
			window.displayInit(pane, userPerson);
			root.setLeft(new  HBox(pane));
			

			//Displaying the buttons and the avatar image
			root.setTop(bodyParts);


			//default code
			Scene scene = new Scene(root, 1000, 800);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		}
		//Catch any and all errors
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * does nothing except launch args
	 * @param args nothing needs to be in here
	 */
	public static void main(String[] args) {
		launch(args);
		
		
	}
	
	/**
	 * This will display the colors of the selected body parts style that are available
	 * @param p - Person: the avatar that is currently being modified
	 * @param size - int: the size of the button
	 * @param key - String: the name of the body part
	 * @param hm - HashMap: the hasmap associated with the body part
	 * @param styleNum - int: the number associated with that body part style
	 * @param height - int: the height of the button
	 * @param width - int: the width of the button
	 * @param r - BorderPane: the root node of the stage
	 * @throws FileNotFoundException - if file not found
	 */
	public void colorButtonGP(Person p, int size, String key,
			HashMap<String, String> hm, int styleNum,BorderPane r,
			int height, int width, AvatarWindow window) throws FileNotFoundException
	{
		AtomicReference<PARTS> selectedPart = new AtomicReference<>(PARTS.EYES);
		setBodyPart(selectedPart, key);
		//The avatar image
		StackPane pane = new StackPane();

		GridPane gpParent = new GridPane();

		//Where the button will be put
		GridPane gpColor = new GridPane();
		//The number of the option
		int n = 1;

		//Go through the hashmap creating each button and displaying its color
		for(String i: hm.keySet())
		{
			//creating a new blank button
			Button imageButton = new Button("");
			imageButton.setMinHeight(height);
			imageButton.setMinWidth(width);
			
			//Checking for if a color has been registered with that button
			if(FileOrg.colorHashMap.containsKey(i))
			{
				imageButton.getStyleClass().add("bOpt");
				//This will overwrite the current background color to the correct one
				imageButton.setStyle("-fx-background-color: " + FileOrg.colorHashMap.get(i));
			}
			
			imageButton.setOnAction(a ->{
				//Setting the file path to the correct location of the png
				//figuring out with body part file path needs to be updated
				if(key != "head")
				{
					BodyParts BP = getBodyPart(selectedPart.get(), p);
					BP.setFilePath(i);
				}
				else
				{
					p.getHead().setFilePath(i, p);
					try {
						window.update(p, PARTS.HEAD, pane);
						window.update(p, PARTS.NOSE, pane);
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				}
				// Sliders for size and location modification 
				
				
				//displaying the updated avatar
				try {
					window.update(p, selectedPart.get(), pane);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				r.setLeft(new  HBox(pane));
					
			});
			
			//adding the button to the gridpane
			gpColor.add(imageButton, (n-1)%3, ((n-1)/3));
			n++;
		}
		/*
		 * Some things (mole) only have 1 or two options
		 * So to stop the screen from jumping blank buttons are added
		 */
		while(n<=3)
		{
			Button blank = new Button("");
			blank.setMinHeight(height);
			blank.setMinWidth(width);
			blank.setStyle("-fx-background-color: transparent");
			gpColor.add(blank, (n-1)%3, ((n-1)/3));
			n++;
		}
		
		/*
		 * Slider for the scale of the image
		 */
		BodyParts BP = getBodyPart(selectedPart.get(), p);
		//@author Ben Maigur
		Slider sizeSlider = new Slider(.1, 5, 1);
		//Setting it to the saved size so that it corresponds to the current size
		sizeSlider.setValue(BP.getSize()/100);
		sizeSlider.setShowTickMarks(true);
		
		//changes image scale based off of slider input
		sizeSlider.valueProperty().addListener(new ChangeListener<Number>() {
				public void changed(ObservableValue<? extends Number> observerable,
						Number oldValue, Number newValue) {
					int newSize = (int) (100 * (double) newValue);//one tick is 100 pixels

					window.modifySize(pane, selectedPart.get(), newSize);
					BodyParts BP = getBodyPart(selectedPart.get(), p);
					BP.setSize(newSize);
				}
			});

		/*
		 * Slider controls the Y axis changes for the assets
		 * IMPORTANT:
		 * It cannot have a upper limit past 1 because then head button will not work!
		 */
		//@author Ben Magiur
		Slider locationSlider = new Slider(-1, 1, 0);
		locationSlider.setValue(BP.getYAxis()/100);
		locationSlider.setShowTickMarks(true);

		//changes asset Y axis based off of slider input
		locationSlider.valueProperty().addListener(new ChangeListener<Number>() {
			public void changed(ObservableValue<? extends Number> observerable, Number oldValue, Number newValue) {
				int newLocation = (int) (-100 * (double) newValue);//1 tick is 100 pixels
				window.modifyLocation(pane, selectedPart.get(), newLocation);
				BP.setYAxis(newLocation);
			}
		});
		
		//Adding text so user knows what the sliders are for
		Text sizeText = new Text("Size");
		Text locationText = new Text("Location");
		//Adding sliders and text to the gridpane
		gpParent.add(gpColor, 0, 0);
		gpParent.add(sizeText, 0, 1);
		gpParent.add(sizeSlider, 0, 2);
		gpParent.add(locationText, 0, 3);
		gpParent.add(locationSlider, 0, 4);
		//displaying the gridpane
		r.setRight(gpParent);
	}
	
	/**
	 * Creates the style buttons for the body parts
	 * @param p - Person: the avatar that is being updated
	 * @param gp - GridPane: the gridpane that should be updated
	 * @param size - the size of the button
	 * @param key - String: what body part style options need to be dislpayed
	 * @param hm - HashMap: the associated hashmap with the body part
	 * @param r - BorderPane: the root node that should be updated
	 * @param height - int: height of the button
	 * @param width - int: width of the button
	 * @throws FileNotFoundException - if file not found
	 */
	public void styleButtonCreate(Person p, GridPane gp, int size, String key,
			HashMap<String, HashMap<String, String>> hm, BorderPane r,
			int height, int width, AvatarWindow window) throws FileNotFoundException
	{
		//The buttons should be set to the right
		gp.setAlignment(Pos.TOP_RIGHT);
		int n = 0;
		for(String i: hm.keySet())
		{
			String completeKey;
			//Getting the info of the hashmap that includes the key
			String hash = hm.get(i).toString();
			//shortening the string to just the key
			int end = hash.indexOf("-");
			//adding 01 because that button will be used for the style button
			completeKey = hash.substring(1, end) + "-01";
			
			//Creating the style button
			Button imageButton = new Button("", ImageHandler.translateImage(completeKey, width, height));
			imageButton.setMaxHeight(height);
			imageButton.setMaxWidth(width);
			imageButton.setAlignment(Pos.TOP_RIGHT);

			int num = n;
			//If the button is selected, add the style color options
			imageButton.setOnAction(a -> {
				try {
					colorButtonGP(p, size, key, hm.get(i), num+1, r, height, width, window);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
			}
			);
			//adding image button to the gridpane
			gp.add(imageButton, (n)%3, ((n)/3));
			n++;
		}

	}
	
	/**
	 * Since polymorphism allows for BodyParts to be any child class
	 * 		this can return what every body needs to be acted one
	 * @param part what PARTS option is currently selected by the user
	 * @param p the avatar being adjusted
	 * @return the body part object currently selected by the user
	 */
	public static BodyParts getBodyPart(PARTS part, Person p)
	{
		 switch(part) {
	        case EYES:
	       	 	return p.getEyes();
	        case TORSO:
	        	return p.getTorso();
	        case HEAD:
	        	return p.getHead();
	        case MOUTH:
	        	return p.getMouth();
	        case HAIR:
	        	return p.getHair();
	        case NOSE:
	        	return p.getNose();
	        case GLASSES:
	        	return p.getGlasses();
	        case MOLE:
	        	return p.getMole();
	        case MOUSTACHE:
	        	return p.getMustache();
	        case GOATEE:
	        	return p.getGoatee();
	    }
		 return p.getHead();
	}
	
	/**
	 * This functions returns which of the PARTS was selected by the user
	 * @param selectedPart what options there are to pick from
	 * @param key the name of the body part
	 */
	public static void setBodyPart(AtomicReference<PARTS> selectedPart, String key)
	{
		switch(key)
		{
			case "Hair":
				selectedPart.set(PARTS.HAIR);
				break;
			case "eye":
				selectedPart.set(PARTS.EYES);
				break;
			case "torso":
				selectedPart.set(PARTS.TORSO);
				break;
			case "head":
				selectedPart.set(PARTS.HEAD);
				break;
			case "mouth":
				selectedPart.set(PARTS.MOUTH);
				break;
			case "glasses":
				selectedPart.set(PARTS.GLASSES);
				break;
			case "goatee":
				selectedPart.set(PARTS.GOATEE);
				break;
			case "mustache":	
				selectedPart.set(PARTS.MOUSTACHE);
				break;
			case "mole":	
				selectedPart.set(PARTS.MOLE);
				break;
		}

	}
}

