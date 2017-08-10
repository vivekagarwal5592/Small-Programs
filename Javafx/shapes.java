package Javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;

public class shapes extends Application {

	
	@Override
	public void start(Stage primaryStage)  {
		Group g = new Group();
	
		Rectangle r = new Rectangle();
		r.setWidth(200);
		r.setHeight(100);
		r.setFill(Color.RED);
		r.setX(50);
		r.setY(50);
		
		Circle c = new Circle();
		c.setRadius(100);
		c.setFill(Color.GREEN);
		c.setCenterX(300);
		c.setCenterY(300);
		
		g.getChildren().add(r);
		g.getChildren().add(c);
		Scene sc = new Scene(g, 750, 750);
		primaryStage.setScene(sc);
		primaryStage.show();
	}

	
	public static void main(String[] args){
		
		
		Application.launch(args);
	}
	
	
}
