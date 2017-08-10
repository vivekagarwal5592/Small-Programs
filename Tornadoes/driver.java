package Tornadoes;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class driver extends Application {
	ArrayList<Tornado> tornado;
	@Override
	public void start(Stage stage) throws Exception {
		
		BorderPane bp = new BorderPane();
		Scene scene = new Scene(bp,500,600);
		tornado = new ArrayList<Tornado>();
		VBox a = new VBox();
		TextField date = new TextField();
		TextField severity = new TextField();
		TextField location = new TextField();
		Label date_label = new Label("Date");
		Label severity_label = new Label("Severity");
		Label location_label = new Label("Location");
		Text output = new Text();
		Button submit = new Button("Submit");
		
		submit.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>(){
			
			@Override
			public void handle(Event e){
				String s ="";
				tornado.add(new Tornado(date.getText(),severity.getText(),location.getText()));
				for(int i=0;i<=tornado.size()-1;i++){
					s += tornado.get(i);
				}
				
				output.setText(s);
				date.clear();
				severity.clear();
				location.clear();
			}
			
			
		});
		
		a.getChildren().add(date_label);
		a.getChildren().add(date);
		a.getChildren().add(severity_label);
		a.getChildren().add(severity);
		a.getChildren().add(location_label);
		a.getChildren().add(location);
		a.getChildren().add(submit);
		bp.setLeft(a);
		bp.setRight(output);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public static void main(String[] args) {
		
		Application.launch(args);

	}

	

}
