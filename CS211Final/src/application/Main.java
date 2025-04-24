package application;
import java.awt.Color;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import java.io.FileNotFoundException;
import java.lang.reflect.Array;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
			
			//preparing the left option pane
			VBox partsOption = new VBox();
			partsOption.setAlignment(Pos.TOP_RIGHT);
			root.setRight(partsOption);
			colorButtonGP(userPerson, IMAGE_BUTTON_SIZE, "head",
			FileOrg.headHashMap.get("headStyle1"), 1, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE);
			
			// Head Buttons	- OG Sarah Parr	New Joy Janney
			//https://www.w3schools.com/howto/howto_css_button_on_image.asp
			/*
			 * The names of the hashmaps follow a pattern, [bodypart]xx
			 * Accordingly, we will loop through all of the hasmaps to display the images
			 * The buttons will be created and added to a gridpane of their respective body part
			 * #FIXME make it all one loop. right now i'm having issues with 01 and 10 being
			 * 		in the same loop
			 */
			
			//Making the eye grid pane and adding the eye images as buttons
			GridPane gpEye = new GridPane();
			gpEye.getStyleClass().add("gpOpt");
			gpEye.setHgap(1);
			gpEye.setVgap(1);
			styleButtonCreate(userPerson, gpEye, IMAGE_BUTTON_SIZE, "eye",
					FileOrg.eyeHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE);
			
			//Creating the hair gridpane and adding the buttons to it
			GridPane gpHair = new GridPane();
			gpHair.getStyleClass().add("gpOpt");
			gpHair.setHgap(1);
			gpHair.setVgap(1);
			styleButtonCreate(userPerson, gpHair, IMAGE_BUTTON_SIZE, "Hair",
					FileOrg.hairHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE);
			
			//Creating the torso gridpane and adding the buttons to it
			GridPane gpTorso = new GridPane();
			gpTorso.getStyleClass().add("gpOpt");
			gpTorso.setHgap(1);
			gpTorso.setVgap(1);
			styleButtonCreate(userPerson, gpTorso, IMAGE_BUTTON_SIZE, "torso",
					FileOrg.torsoHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE);
						
			
			//Creating the head gridpane and adding the buttons to it
			GridPane gpHead = new GridPane();
			gpHead.getStyleClass().add("gpOpt");
			gpHead.setHgap(1);
			gpHead.setVgap(1);
			styleButtonCreate(userPerson, gpHead, IMAGE_BUTTON_SIZE, "head",
					FileOrg.headHashMap, root, IMAGE_BUTTON_SIZE, IMAGE_BUTTON_SIZE);
			
			//Creating a blank gridpane so that if no style is selected
					//the buttons won't visibly shift
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
			//Button nb = new Button("", imageButton("6", IMAGE_BUTTON_SIZE));
			root.setCenter(gpHead); //Presenting a GridPane to display to the user
			Button headButton = new Button("Head");
			headButton.getStyleClass().add("bMain");
			headButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			headButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			headButton.setOnAction(a -> 
			{
				root.setCenter(gpHead);
				root.setRight(blankGP);
			});
				
			//https://docs.oracle.com/javafx/2/ui_controls/button.html
			/*If they select a new button for the top, a new GridPane will be display
			 * The GridPane will only show the user the options related to the tab
			 * Basically, if they click eye, it will show them the eye options
			 */
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
			
			//Preparing the options in the top button in a HBOX
			HBox bodyParts = new HBox(headButton, torsoButton, eyeButton, hairButton);
			bodyParts.setAlignment(Pos.TOP_RIGHT);

			//displaying the default avatar
			AvatarWindow.display(pane, userPerson);
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
		//FIXME this should be updated to have more specific errors
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
	 * DELETE - SHOULD NOT USE
	 * @param filePath DELETE
	 * @param size DELETE
	 * @return DELETE
	 * @throws FileNotFoundException DELETE
	 */
	public ImageView imageButton(String filePath, int size) throws FileNotFoundException
	{
		ImageView imageView = ImageHandler.translateImage(filePath);
		imageView.setFitWidth(size);
		imageView.setPreserveRatio(true);
		return imageView;
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
			int height, int width) throws FileNotFoundException
	{
		//The avatar image
		StackPane pane = new StackPane();
		//Where the button will be put
		GridPane gp = new GridPane();
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
				imageButton.getStyleClass().add("bOpt");
				//This will overwrite the current background color to the correct one
				imageButton.setStyle("-fx-background-color: " + FileOrg.colorHashMap.get(i));
			
			imageButton.setOnAction(a ->{
				//Setting the file path to the correct location of the png
				//figuring out with body part file path needs to be updated
				if(key == "Hair")
				{
					p.getHair().setFilePath(i);
					System.out.println("HAIR FILE PATH:" + p.getHair().getFilePath());
				}
				else if(key == "eye")
				{
					p.getEyes().setFilePath(i);
					System.out.println("NEW: " + p.getEyes().getFilePath());
				}
				else if(key == "torso")
				{
					p.getTorso().setFilePath(i);
				}
				else if(key == "head")
				{
					p.getHead().setFilePath(i);
				}
				
				//displaying the updated avatar
				AvatarWindow.display(pane, p);
				r.setLeft(new  HBox(pane));
					
			});
			
			//adding the button to the gridpane
			gp.add(imageButton, (n-1)%3, ((n-1)/3));
			n++;
		}
		//displaying the gridpane
		r.setRight(gp);
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
			int height, int width) throws FileNotFoundException
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
			Button imageButton = new Button("", imageButton(completeKey, size));
			imageButton.setAlignment(Pos.TOP_RIGHT);

			int num = n;
			//If the button is selected, add the style color options
			imageButton.setOnAction(a -> {
				try {
					colorButtonGP(p, size, key, hm.get(i), num+1, r, height, width);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			);
			//adding image button to the gridpane
			gp.add(imageButton, (n)%3, ((n)/3));
			n++;
		}
	}
}

