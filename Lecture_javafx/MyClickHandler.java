package Lecture_javafx;

import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyClickHandler<ActionEvent> extends Application
 implements EventHandler<Event>{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Application.launch(args);
	}
	
	



	@Override
	public void start(Stage primaryStage) throws Exception {
		StackPane s = new StackPane();
		Scene sc = new Scene(s, 300, 300);

		Button b = new Button();
		b.setText("Click Me!");
		EventHandler<Event> handler = new MyClickHandler<Event>();
		b.addEventHandler(MouseEvent.MOUSE_DRAGGED, handler);
		
		s.getChildren().add(b);
		primaryStage.setScene(sc);
		primaryStage.show();

		
	}





	@Override
	public void handle(Event event) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,  "Thanks!");
	}}
