package Lecture_javafx;

import java.time.LocalDateTime;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class demo_fx extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Application.launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		StackPane s = new StackPane();
		Scene sc = new Scene(s, 300, 300);
		sc.getStylesheets().add("Styles/style.css"); 
		
		Label l = new Label("Hello");
		
		boolean am = getAm();
							
		 l.getStyleClass().add("amstyle");
		 l.getStyleClass().add("pmstyle");		
		
		s.getChildren().add(l);
		primaryStage.setScene(sc);
		primaryStage.show();	
		
	}
	
	private boolean getAm(){
		LocalDateTime d = LocalDateTime.now();
		if(d.getHour() < 12) return true;
		else return false;		
	} 


}
