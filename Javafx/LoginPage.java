package Javafx;

import java.io.IOException;

import courses.FacultyMember;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginPage extends Application {

	public static void main(String[] args) {

		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub

		GridPane pane = new GridPane();
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/layout.fxml"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(10);
		pane.setVgap(10);
		pane.setPadding(new Insets(25, 25, 25, 25));
		Stage stage = new Stage();
		Scene scene = new Scene(pane,500,300);
		
		scene.getStylesheets().add
		 (LoginPage.class.getResource("/style.css").toExternalForm());

		Text welcome_message = new Text();
		Label label = new Label();
		Button button = new Button();
		TextField username = new TextField();
		PasswordField pw = new PasswordField();
		Label pw_label = new Label("Password");

		welcome_message.setText("Welcome to JavaFX");
		button.setText("Click here");
		label.setText("Username:");
		final Text actiontarget = new Text();
        
		pane.add(welcome_message,0,0);
		pane.add(label,0,2);
		pane.add(username,1,2);
		pane.add(pw_label,0,3);
		pane.add(pw,1,3);
		pane.add(button,0,4);
		pane.add(actiontarget, 0, 6);
		

		button.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				
				
//				actiontarget.setFill(Color.FIREBRICK);
		        actiontarget.setText("Sign in button pressed");
				
			}

		});

		
		  primaryStage.setScene(scene);
	        primaryStage.show();
	}

}
