package Javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Htree extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		double centerx = 500;
		double centery = 300;
		
		double length = 100;
		BorderPane borderpane = new BorderPane();
		Label label = new Label("Order");
		TextField textField = new TextField();
		Button submit = new Button("Submit");
		HBox hbox = new HBox();
		hbox.getChildren().add(label);
		hbox.getChildren().add(textField);
		hbox.getChildren().add(submit);
		Canvas canvas = new Canvas(1050, 550);

		GraphicsContext gc = canvas.getGraphicsContext2D();
		canvas.setStyle("-fx-background-color: red");
		Group g = new Group();
		g.getChildren().add(canvas);
		borderpane.setTop(g);
		borderpane.setBottom(hbox);
		//drawh(centerx, centery, order, gc, length);
		Scene sc = new Scene(borderpane, 1050, 650);
		primaryStage.setScene(sc);
		primaryStage.show();
		
		submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				
				double order 	=Double.parseDouble(textField.getText());
				gc.clearRect(0, 0, 1050, 550);
				drawh(centerx, centery, order, gc,(order+1)*20);
				
			}

		});

	}

	public void drawh(double centerx, double centery, double order, GraphicsContext gc, double length) {

		if (order >= 0) {

			gc.strokeLine(centerx, centery, centerx + length, centery);
			gc.strokeLine(centerx, centery, centerx - length, centery);

			gc.strokeLine(centerx + length, centery, centerx + length, centery + length);
			gc.strokeLine(centerx + length, centery, centerx + length, centery - length);

			gc.strokeLine(centerx - length, centery, centerx - length, centery + length);
			gc.strokeLine(centerx - length, centery, centerx - length, centery - length);

			drawh(centerx + length, centery + length, order - 1, gc, length / 2);
			drawh(centerx + length, centery - length, order - 1, gc, length / 2);
			drawh(centerx - length, centery + length, order - 1, gc, length / 2);
			drawh(centerx - length, centery - length, order - 1, gc, length / 2);

		}

	}

	public static void main(String[] args) {

		Application.launch(args);

	}

}
