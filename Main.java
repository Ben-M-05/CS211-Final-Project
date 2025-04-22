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
import javafx.scene.layout.VBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 * @author Joy Janney except where otherwise marked
 * 
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			final int buttonSize = 60;
			/*
			 * The display will include three portions: top, left, and center
			 * Top - The body buttons that will take the user to the correct
			 * 			option pane.
			 * Left - The option pane for the selected body part
			 * 			These will be made of VBoxes that include images as buttons
			 * Center - The image of their avatr
			 */
			BorderPane root = new BorderPane();
			Person userPerson = new Person();
			
			//FIXME need to update when generate feature is working
			//Preparing the avatar image
			Image portrait = new Image(String.format("file:" + FileOrg.eyeFindFile("eye01")));
			ImageView portraitI = new ImageView(portrait);
			portraitI.setFitWidth(200);
			portraitI.setPreserveRatio(true);
			root.setCenter(portraitI);
			
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
				gpEye.getStyleClass().add("gpOpt");
				gpEye.setHgap(1);
				gpEye.setVgap(1);
			for(int i = 1; i < FileOrg.getEyeLength() && i < 10; i++)
			{
				Button eyeImageButton = new Button("", imageButton(String.format("eye0" + i), buttonSize));
					eyeImageButton.getStyleClass().add("bOpt");
				String t = String.format("eye0" + i);
				eyeImageButton.setOnAction(a -> {
					try {
						userPerson.getEyes().setFilePath(FileOrg.eyeFindFile(t));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpEye.add(eyeImageButton, (i-1)%3, ((i-1)/3));
			}
			
			
			for(int i = 10; i < FileOrg.getEyeLength(); i++)
			{
				String key = String.format("eye" + i);
				Button eyeImageButton = new Button("", imageButton(key, buttonSize));
				eyeImageButton.setOnAction(a -> {
					try {
						userPerson.getEyes().setFilePath(FileOrg.eyeFindFile(key));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpEye.add(eyeImageButton, (i-1)%3, ((i-1)/3));
			}
			
			
			//Creating the hair gridpane and adding the buttons to it
			GridPane gpHair = new GridPane();
				gpHair.getStyleClass().add("gpOpt");
				gpHair.setHgap(1);
				gpHair.setVgap(1);
			for(int i = 1; i < FileOrg.getHairLength() && i < 10; i++)
			{
				String key = String.format("Hair0" + i);
				Button hairImageButton = new Button("", imageButton(key, buttonSize));
					hairImageButton.getStyleClass().add("bOpt");
				hairImageButton.setOnAction(a -> {
					try {
						userPerson.getHair().setFilePath(FileOrg.hairFindFile(key));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpHair.add(hairImageButton, (i-1)%3, ((i-1)/3));
			}
			for(int i = 10; i < FileOrg.getHairLength() && i < FileOrg.getHairLength(); i++)
			{
				String key = String.format("Hair" + i);
				Button hairImageButton = new Button("", imageButton(key, buttonSize));
				hairImageButton.setOnAction(a -> {
					try {
						userPerson.getHair().setFilePath(FileOrg.hairFindFile(key));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpHair.add(hairImageButton, (i-1)%3, ((i-1)/3));
			}
			
			
			//Creating the torso gridpane and adding the buttons to it
			GridPane gpTorso = new GridPane();
				gpTorso.getStyleClass().add("gpOpt");
				gpTorso.setHgap(1);
				gpTorso.setVgap(1);
			for(int i = 1; i < 10 && i < FileOrg.getTorsoLength(); i++)
			{
				String key = String.format("torso0" + i);
				Button torsoImageButton = new Button("", imageButton(key, buttonSize));
					torsoImageButton.getStyleClass().add("bOpt");
				torsoImageButton.setOnAction(a -> {
					try {
						userPerson.getTorso().setFilePath(FileOrg.torsoFindFile(key));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpTorso.add(torsoImageButton, (i-1)%3, ((i-1)/3));
			}
			
			for(int i = 10; i < FileOrg.getTorsoLength(); i++)
			{
				String key = String.format("torso" + i);
				Button torsoImageButton = new Button("", imageButton(key, buttonSize));
				torsoImageButton.setOnAction(a -> {
					try {
						userPerson.getTorso().setFilePath(FileOrg.torsoFindFile(key));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpTorso.add(torsoImageButton, (i-1)%3, ((i-1)/3));
			}
			
			
			//Creating the head gridpane and adding the buttons to it
			GridPane gpHead = new GridPane();
				gpHead.getStyleClass().add("gpOpt");
				gpHead.setHgap(1);
				gpHead.setVgap(1);
			// Options - Sarah Parr
			for(int i = 1; i < FileOrg.getHeadLength()+1; i++)
			{
				Button headImageButton = new Button("", imageButton(String.format("head0" + i), buttonSize));
					headImageButton.getStyleClass().add("bOpt");
				String t = String.format("head0" + i);
				System.out.println(t);
				headImageButton.setOnAction(a -> {
					try {
						userPerson.getHead().setFilePath(FileOrg.headFindFile(t));
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				});
				gpHead.add(headImageButton, (i-1)%3, ((i-1)/3));
				
			}
			//Button nb = new Button("", imageButton("6", buttonSize));
			root.setRight(gpHead); //Presenting a GridPane to display to the user
			Button headButton = new Button("Head");
			headButton.setOnAction(a -> root.setRight(gpHead));
			headButton.getStyleClass().add("bMain");
			headButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			
		///
				
			//https://docs.oracle.com/javafx/2/ui_controls/button.html
			
			/*If they select a new button for the top, a new GridPane will be display
			 * The GridPane will only show the user the options related to the tab
			 * Basically, if they click eye, it will show them the eye options
			 */
			Button torsoButton = new Button("Torso");
			torsoButton.setOnAction(a -> root.setRight(gpTorso));
			torsoButton.getStyleClass().add("bMain");
			torsoButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			
			Button eyeButton = new Button("Eye");
			eyeButton.setOnAction(a -> root.setRight(gpEye));
			eyeButton.getStyleClass().add("bMain");
			eyeButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			
			Button hairButton = new Button("Hair");
			hairButton.setOnAction(a -> root.setRight(gpHair));
			hairButton.getStyleClass().add("bMain");
			hairButton.setFont(Font.font("Verdana", FontWeight.BOLD, 15));
			
			//Preparing the options in the top button in a HBOX
			HBox bodyParts = new HBox(headButton, torsoButton, eyeButton, hairButton);
			bodyParts.setSpacing(1);
			bodyParts.getStyleClass().add("hbMain");
			
			//Displaying the buttons and the avatar image
			root.setTop(bodyParts);

			//default code
			Scene scene = new Scene(root, 750, 500);
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
		Image image = new Image(String.format("file:" + FileOrg.findFile(filePath)));
		ImageView imageView = new ImageView(image);
		imageView.setFitWidth(size);
		imageView.setPreserveRatio(true);
		return imageView;
	}
}
