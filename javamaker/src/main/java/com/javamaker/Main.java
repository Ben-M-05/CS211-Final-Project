package com.javamaker;
import java.io.File;
import java.util.Scanner;

import com.javamaker.Modules.FileOrg;
import com.javamaker.Modules.Head;

import java.io.FileNotFoundException;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
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
			Image portrait = new Image(String.format("file:" + FileOrg.findFile("eye01")));
			ImageView portraitI = new ImageView(portrait);
			portraitI.setFitWidth(200);
			portraitI.setPreserveRatio(true);
			root.setCenter(portraitI);
			
			//preparing the left option pane
			VBox partsOption = new VBox();
			root.setRight(partsOption);
			
			// Head Buttons	- Sarah Parr		
			Image head01 = new Image(String.format("file:" + FileOrg.findFile("head01")));
			ImageView iHead01 = new ImageView(head01);
			iHead01.setFitWidth(50);
			iHead01.setPreserveRatio(true);
			
			Image head02 = new Image(String.format("file:" + FileOrg.findFile("head02")));
			ImageView iHead02 = new ImageView(head02);
			iHead02.setFitWidth(50);
			iHead02.setPreserveRatio(true);
			
			Image head03 = new Image(String.format("file:" + FileOrg.findFile("head03")));
			ImageView iHead03 = new ImageView(head03);
			iHead03.setFitWidth(50);
			iHead03.setPreserveRatio(true);
			
			Image head04 = new Image(String.format("file:" + FileOrg.findFile("head04")));
			ImageView iHead04 = new ImageView(head04);
			iHead04.setFitWidth(50);
			iHead04.setPreserveRatio(true);
			
			Image head05 = new Image(String.format("file:" + FileOrg.findFile("head05")));
			ImageView iHead05 = new ImageView(head05);
			iHead05.setFitWidth(50);
			iHead05.setPreserveRatio(true);
			
			Image head06 = new Image(String.format("file:" + FileOrg.findFile("head06")));
			ImageView iHead06 = new ImageView(head06);
			iHead06.setFitWidth(50);
			iHead06.setPreserveRatio(true);
			
			// Options - Sarah Parr
			Button bHead1 = new Button("", iHead01);
			Button bHead2 = new Button("", iHead02);
			Button bHead3 = new Button("", iHead03);
			Button bHead4 = new Button("", iHead04);
			Button bHead5 = new Button("", iHead05);
			Button bHead6 = new Button("", iHead06);
			
			//updating the FilePath if the user selects a new head - Joy Janney
			bHead1.setOnAction(a -> userPerson.setHead(FileOrg.findFile("head01")));
			bHead2.setOnAction(a -> userPerson.setHead(FileOrg.findFile("head02")));
			bHead3.setOnAction(a -> userPerson.setHead(FileOrg.findFile("head03")));
			bHead4.setOnAction(a -> userPerson.setHead(FileOrg.findFile("head04")));
			bHead5.setOnAction(a -> userPerson.setHead(FileOrg.findFile("head05")));
			bHead6.setOnAction(a -> userPerson.setHead(FileOrg.findFile("head06")));
			
			// Head tab - Sarah Parr
			GridPane gpHead = new GridPane();
			gpHead.add(bHead1, 0, 0);
			gpHead.add(bHead2, 1, 0);
			gpHead.add(bHead3, 2, 0);
			gpHead.add(bHead4, 0, 1);
			gpHead.add(bHead5, 1, 1);
			gpHead.add(bHead6, 2, 1);
			
			Button headButton = new Button("Head");
			headButton.setOnAction(a -> root.setRight(gpHead));
			
		///
				
			//https://docs.oracle.com/javafx/2/ui_controls/button.html
			portraitI.setFitWidth(50);
			Button eye = new Button("", portraitI);
			
			Button torso = new Button("Torso");
			Button hair = new Button("Hair");
			
			//Preparing the VBox for the user to select their avator
			
			VBox torsoVBox = new VBox(torso);
			VBox eyeVBox = new VBox(eye);
			VBox hairVBox = new VBox(hair);
			
			/*If they select a new button for the top, a new VBox will be display
			 * The VBoxes will only show the user the options related to the tab
			 * Basically, if they click eye, it will show them the eye options
			 */
			
			
			Button torsoButton = new Button("Torso");
			torsoButton.setOnAction(a -> root.setRight(torsoVBox));
			
			Button eyeButton = new Button("Eye");
			eyeButton.setOnAction(a -> root.setRight(eyeVBox));
			
			Button hairButton = new Button("Hair");
			hairButton.setOnAction(a -> root.setRight(hairVBox));
			
			//Preparing the options in the top button in a HBOX
			HBox bodyParts = new HBox(headButton, torsoButton, eyeButton, hairButton);
			
			//Displaying the buttons and the avator image
			root.setTop(bodyParts);

			//default code
			Scene scene = new Scene(root, 750, 500);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
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
	
}

