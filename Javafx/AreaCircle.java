package Javafx;

import java.io.File;

import java.io.IOException;

import java.util.Scanner;

import javafx.application.Application;

import javafx.event.ActionEvent;

import javafx.event.Event;

import javafx.event.EventHandler;

import javafx.scene.Scene;

import javafx.scene.control.Button;

import javafx.scene.control.Label;

import javafx.scene.control.Menu;

import javafx.scene.control.MenuBar;

import javafx.scene.control.MenuItem;

import javafx.scene.control.TextField;

import javafx.scene.input.KeyCode;

import javafx.scene.input.KeyCodeCombination;

import javafx.scene.input.KeyCombination;

import javafx.scene.input.MouseEvent;

import javafx.scene.layout.GridPane;

import javafx.scene.layout.HBox;

import javafx.scene.layout.VBox;

import javafx.scene.text.Text;

import javafx.stage.FileChooser;

import javafx.stage.Popup;

import javafx.stage.Stage;

public class AreaCircle extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		GridPane gp = new GridPane();
		Scene sc = new Scene(gp);
		sc.getStylesheets().add("styles/style.css"); 
		gp.getStyleClass().add("pane");
		Label enter_side = new Label("Enter the side of the square:");
		Label perimeter_of_sqaure = new Label("Perimeter of the squre is:");
		TextField text = new TextField();
		
		Text answer = new Text();
		Button calculate = new Button("Calculate");

		gp.add(enter_side, 0, 0);
		gp.add(perimeter_of_sqaure, 0, 1);
		gp.add(text, 1, 0);
		gp.add(answer, 1, 1);
		gp.add(calculate, 1, 2);
		enter_side.getStyleClass().add("textfieldpadding");
		perimeter_of_sqaure.getStyleClass().add("textfieldpadding");
		calculate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {

				Calculation calculation = new Calculation();
				
				double ans = calculation.area_of_circle( Double.parseDouble(text.getText()));
				answer.setText(String.valueOf(ans));
			}

		});

		primaryStage.setScene(sc);
		primaryStage.show();
	}

	public static void main(String[] args) {

		Application.launch(args);

	}

	
	public class Calculation{
		
		public double area_of_circle(double side){
			
			double ans =  side *4;
			
			return ans;
			
			
		}
	}
	
}



