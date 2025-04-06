package application;
import java.io.File;
import java.util.Scanner;

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
			 * Center - The image of their avator
			 */
			BorderPane root = new BorderPane();
			
			//FIXME need to update when generate feature is working
			//Preparing the avator image
			Image portrait = new Image(String.format("file:" + FileOrg.findFile("eye01")));
			ImageView portraitI = new ImageView(portrait);
			portraitI.setFitWidth(100);
			portraitI.setPreserveRatio(true);
			
			//preparing the left option pane
			VBox partsOption = new VBox();
			root.setLeft(partsOption);
			
			//FIXME should be taken out when VBoxes are working
			//		THIS IS ONLY TEMP CODE!!!!!
			Button head = new Button("Head");
			Button torso = new Button("Torso");
			portraitI.setFitWidth(50);
			//https://docs.oracle.com/javafx/2/ui_controls/button.htm
			Button eye = new Button("", portraitI);
			Button hair = new Button("Hair");
			
			//Preparing the VBox for the user to select their avator
			VBox headVBox = new VBox(head);
			VBox torsoVBox = new VBox(torso);
			VBox eyeVBox = new VBox(eye);
			VBox hairVBox = new VBox(hair);
			
			/*If they select a new button for the top, a new VBox will be display
			 * The VBoxes will only show the user the options related to the tab
			 * Basically, if they click eye, it will show them the eye options
			 */
			Button headButton = new Button("Head");
			headButton.setOnAction(_ -> root.setLeft(headVBox));
			
			Button torsoButton = new Button("Torso");
			torsoButton.setOnAction(_ -> root.setLeft(torsoVBox));
			
			Button eyeButton = new Button("Eye");
			eyeButton.setOnAction(_ -> root.setLeft(eyeVBox));
			
			Button hairButton = new Button("Hair");
			hairButton.setOnAction(_ -> root.setLeft(hairVBox));
			
			//Preparing the options in the top button in a HBOX
			HBox bodyParts = new HBox(headButton, torsoButton, eyeButton, hairButton);
			
			//Displaying the buttons and the avator image
			root.setTop(bodyParts);
			root.setCenter(portraitI);

			//default code
			Scene scene = new Scene(root, 500, 500);
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
	
}
