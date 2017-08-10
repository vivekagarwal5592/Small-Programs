package Javafx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class CelsiusConverter extends Application{
	
	
	@Override
	public void start(Stage primaryStage) {
		GridPane gp = new GridPane();		
		Scene sc = new Scene(gp);
		sc.getStylesheets().add("styles/style.css"); 
		sc.getStylesheets().add("Styles/style.css"); 
//		sc.getStylesheets().add
//		 (LoginPage.class.getResource("/style.css").toExternalForm());
		
		Label lblFahr = new Label("Fahrenheit Value: ");
		TextField tfFahr = new TextField();		
		Label lblCels = new Label("Celsius Value:");
		Label lblCelsAns = new Label();
		Button btnCalc = new Button("Convert");	
		btnCalc.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<Event>(){
			@Override
			public void handle(Event event) {
				double cels = (Double.parseDouble(tfFahr.getText())-32)*5/9;
				lblCelsAns.setText(String.valueOf(cels));
			}			
		});	
		
		gp.getStyleClass().add("pane");
		gp.add(lblFahr, 0, 0);
		gp.add(tfFahr, 2, 0);
		gp.add(lblCels, 0, 1);
		gp.add(lblCelsAns, 2, 1);
		gp.add(btnCalc, 1, 2);
		
		
		primaryStage.setScene(sc);
		primaryStage.show();
	} 	
	
	
	public static void main(String[] args){
		
		Application.launch(args);
		
	}
}
