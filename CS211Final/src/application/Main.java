package application;
import java.io.File;
import java.util.ArrayList;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

/**
 * @author Joy Janney except where otherwise marked
 * 
 */
public class Main extends Application {
	@Override
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
			
			//FIXME need to update when generate feature is working
			//Preparing the avatar image
			ImageView portraitI = ImageHandler.translateImage("eye01");
			portraitI.setFitWidth(200);
			portraitI.setPreserveRatio(true);
			//root.setCenter(portraitI);
			
			//preparing the left option pane
			VBox partsOption = new VBox();
			root.setRight(partsOption);
			
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
			for(int i = 1; i < FileOrg.getEyeLength()+1; i++)
			{
				String key;
				if(i<10)
					key = String.format("eye0" + i);
				else
					key = String.format("eye" + i);
				Button eyeImageButton = new Button("", imageButton(key, IMAGE_BUTTON_SIZE));
				eyeImageButton.setOnAction(a -> {
					try {
						userPerson.getEyes().setFilePath(key);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpEye.add(eyeImageButton, (i-1)%3, ((i-1)/3));
			}
			
			
			
			//Creating the hair gridpane and adding the buttons to it
			GridPane gpHair = new GridPane();
			for(int i = 1; i < FileOrg.getHairLength()+1; i++)
			{
				String key;
				if(i<10)
					key = String.format("Hair0" + i);
				else
					key = String.format("Hair" + i);
				Button hairImageButton = new Button("", imageButton(key, IMAGE_BUTTON_SIZE));
				hairImageButton.setOnAction(a -> {
					try {
						userPerson.getHair().setFilePath(key);
						AvatarWindow.display(pane, userPerson);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpHair.add(hairImageButton, (i-1)%3, ((i-1)/3));
			}
			
			
			//Creating the torso gridpane and adding the buttons to it
			GridPane gpTorso = new GridPane();
			for(int i = 1;i < FileOrg.getTorsoLength()+1; i++)
			{
				String key;
				if(i<10)
					 key = String.format("torso0" + i);
				else
					key = String.format("torso" + i);
				Button torsoImageButton = new Button("", imageButton(key, IMAGE_BUTTON_SIZE));
				//The lambda function must be named because Sarah's version will not accept unnamed lambda functions
				torsoImageButton.setOnAction(a -> {
					try {
						userPerson.getTorso().setFilePath(key);
						AvatarWindow.display(pane, userPerson);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpTorso.add(torsoImageButton, (i-1)%3, ((i-1)/3));
			}			
			
			//Creating the head gridpane and adding the buttons to it
			GridPane gpHead = new GridPane();
			for(int i = 1; i < FileOrg.getHeadLength()+1; i++)
			{
				Button headImageButton = new Button("", imageButton(String.format("head0" + i), IMAGE_BUTTON_SIZE));
				String t = String.format("head0" + i);
				headImageButton.setOnAction(a -> {
					try {
						userPerson.getHead().setFilePath(t);
						AvatarWindow.display(pane, userPerson);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpHead.add(headImageButton, (i-1)%3, ((i-1)/3));
			}
			//Button nb = new Button("", imageButton("6", IMAGE_BUTTON_SIZE));
			root.setRight(gpHead); //Presenting a GridPane to display to the user
			Button headButton = new Button("Head");
			headButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			headButton.setOnAction(a -> root.setRight(gpHead));
				
			//https://docs.oracle.com/javafx/2/ui_controls/button.html
			/*If they select a new button for the top, a new GridPane will be display
			 * The GridPane will only show the user the options related to the tab
			 * Basically, if they click eye, it will show them the eye options
			 */
			Button torsoButton = new Button("Torso");
			torsoButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			torsoButton.setOnAction(a -> root.setRight(gpTorso));
			
			Button eyeButton = new Button("Eye");
			eyeButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			eyeButton.setOnAction(a -> root.setRight(gpEye));
			
			Button hairButton = new Button("Hair");
			hairButton.setMinSize(TEXT_BUTTON_WIDTH, TEXT_BUTTON_HEIGHT);
			hairButton.setOnAction(a -> root.setRight(gpHair));
			
			//Preparing the options in the top button in a HBOX
			HBox bodyParts = new HBox(headButton, torsoButton, eyeButton, hairButton);
			bodyParts.setAlignment(Pos.TOP_RIGHT);

			Button displayButton = new Button("Display!");
			displayButton.setOnAction(e ->  {
				AvatarWindow.display(pane, userPerson);
			});

			HBox avatarBox = new HBox(pane, displayButton);

			//Displaying the buttons and the avatar image
			root.setTop(bodyParts);
			root.setCenter(avatarBox);

			//default code
			Scene scene = new Scene(root, 750, 600);
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
	
	public static void main(String[] args) {
		launch(args);
		
		
	}
	
	public ImageView imageButton(String filePath, int size) throws FileNotFoundException
	{
		ImageView imageView = ImageHandler.translateImage(filePath);
		imageView.setFitWidth(size);
		imageView.setPreserveRatio(true);
		return imageView;
	}
}

