package Javafx;



import java.io.File;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class JavaFXImageDemo extends Application {

	VBox vb;
	ScrollPane scrollPane;
	StackPane stackPane;
	
	@Override
	public void start(Stage stage) {
		vb = new VBox();
		scrollPane = new ScrollPane();
		stackPane = new StackPane();	
		scrollPane.setPrefHeight(1500);
		scrollPane.setContent(stackPane);
		StackPane.setAlignment(scrollPane, Pos.BASELINE_CENTER);
			
		//scrollPane.setFitToHeight(true);
		//scrollPane.setFitToWidth(true);
		Scene scene = new Scene(vb, 500,500);
//		scene.getStylesheets().add(
//				getClass().getResource("application.css").toExternalForm());
		
		scene.getStylesheets().add("Styles/application.css"); 
		stage.setTitle("FX Image Demo");
		
		
		MenuBar menuBar = setUpMenuBar(stage);
		vb.getChildren().add(menuBar);
		vb.getChildren().add(scrollPane);

		
		stage.setScene(scene);
		stage.show();
	}

	private MenuBar setUpMenuBar(Stage stage) {
		MenuBar menuBar = new MenuBar();
		Menu fileMenu = setUpFileMenu(stage);
		Menu helpMenu = setUpHelpMenu(stage);
		menuBar.getMenus().add(fileMenu);
		menuBar.getMenus().add(helpMenu);
		return menuBar;
	}

	private Menu setUpFileMenu(Stage stage) {
		Menu fileMenu = new Menu("File");
		MenuItem openItem = new MenuItem("Open");
		openItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				FileChooser fileChooser = new FileChooser();

				File file = fileChooser.showOpenDialog(stage);
				if (file != null) {
					Image i;
					try {
						String imageFileURI = file.toURI().toURL()
								.toExternalForm();
						i = new Image(imageFileURI);
						ImageView iv = new ImageView(i);
						
						
						stackPane.getChildren().clear();
						stackPane.getChildren().add(iv);
						stackPane.autosize();

					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});

		openItem.setAccelerator(new KeyCodeCombination(KeyCode.O,
				KeyCombination.CONTROL_DOWN));

		
		fileMenu.getItems().add(openItem);

		MenuItem quitItem = new MenuItem("Quit");
		quitItem.setOnAction(e -> {
			System.exit(0);
		});
		
		quitItem.setAccelerator(new KeyCodeCombination(KeyCode.Q,
				KeyCombination.CONTROL_DOWN));

		fileMenu.getItems().add(quitItem);
		return fileMenu;
	}

	private Menu setUpHelpMenu(Stage stage) {
		Menu helpMenu = new Menu("Help");
		MenuItem aboutItem = new MenuItem("About");
		aboutItem.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				Popup popup = new Popup();
				// popup.setX(100);
				VBox v = new VBox();
				v.getStyleClass().add("about");
				Text t = new Text("Copyright 2014 by John Hurley");
				t.getStyleClass().add("text");
				Button okButton = new Button("OK");
				v.getChildren().addAll(t, okButton);
				okButton.setOnAction(e -> {
					popup.hide();
				});

				popup.getContent().addAll(v);
				popup.show(stage);
			}

		});

		aboutItem.setAccelerator(new KeyCodeCombination(KeyCode.A,
				KeyCombination.CONTROL_DOWN));
		helpMenu.getItems().add(aboutItem);
		return helpMenu;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}
}

