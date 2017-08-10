package Javafx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class smiley extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {

		StackPane pane = new StackPane();
		Scene scene = new Scene(pane, 500, 600);
		Circle face = new Circle(10, 200, 150);

		Ellipse left_eye = new Ellipse(-40, 120, 50, 25);
		Ellipse right_eye = new Ellipse(80, 120, 50, 25);
		Circle left_eye_ball = new Circle(-40, 120, 20);
		Circle right_eye_ball = new Circle(80, 120, 20);
		Polygon nose = new Polygon();
		nose.getPoints().addAll(new Double[] { 10.0, 150.0, -10.0, 250.0, 30.0, 250.0 });
		Arc smile = new Arc(10, 250, 50, 50, 220, 100);
		smile.setType(ArcType.OPEN);
		smile.setStroke(Color.BLACK);
		smile.setFill(null);
		smile.setStrokeWidth(3);

		face.setFill(Color.WHITE);
		face.setStroke(Color.BLACK);
		left_eye.setFill(Color.WHITE);
		left_eye.setStroke(Color.BLACK);
		right_eye.setFill(Color.WHITE);
		right_eye.setStroke(Color.BLACK);
		nose.setFill(Color.WHITE);
		nose.setStroke(Color.BLACK);

		Group gp = new Group();
		gp.getChildren().add(face);
		gp.getChildren().add(nose);
		gp.getChildren().add(left_eye);
		gp.getChildren().add(right_eye);
		gp.getChildren().add(left_eye_ball);
		gp.getChildren().add(right_eye_ball);
		gp.getChildren().add(smile);

		pane.getChildren().add(gp);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {

		Application.launch(args);

	}

}
