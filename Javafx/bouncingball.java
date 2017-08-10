package Javafx;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Popup;
import javafx.stage.Stage;;

public class bouncingball extends Application {

	Circle ball;
	int speed = 1;
	double v = 0;
	double u = 1;
	double a = 0.01;
	double time = 0;
	boolean flag = true;
	double x = .1;
	Circle big_ball;
	Text t;
	Rectangle obstacle;
	@Override
	public void start(Stage primaryStage) throws Exception {
		Group g = new Group();

		AnimationTimer timer = new AnimationTimer() {

			@Override
			public void handle(long arg0) {

				

				if (ball.getCenterY() >= 500) {
					a *= -1;
					u = v;

					flag = false;
				}

				if (v <= 0) {
					// x += .1;
					u = 1;
					a = 0.01;
					time = 0;
					flag = true;
				}

				if (flag == true) {
					ball.setCenterY(ball.getCenterY() + v);

				}

				if (flag == false) {
					ball.setCenterY(ball.getCenterY() - v);

				}

				v = u + a * time;
				time += 1;

				// for(double t=0;t<=100;t++){
				// v = Math.sqrt(Math.pow(u, 2) + 2*a*distance);

				// u += 0.0001;
				// }

			}

		};
		
		timer.start();

		

		

		t = new Text();
		big_ball = new Circle();

		big_ball.setFill(Color.RED);
		big_ball.setRadius(10);
		big_ball.setCenterX(400);
		big_ball.setCenterY(600);

		obstacle = new Rectangle();
		obstacle.setWidth(100);
		obstacle.setHeight(300);
		obstacle.setFill(Color.RED);
		obstacle.setX(500);
		obstacle.setY(500);
		
		ball = new Circle();
		ball.setRadius(10);
		ball.setFill(Color.GREEN);
		ball.setCenterX(300);
		ball.setCenterY(300);

		g.getChildren().add(big_ball);
		g.getChildren().add(obstacle);
		g.getChildren().add(t);
		Scene sc = new Scene(g, 750, 750);
		primaryStage.setScene(sc);
		primaryStage.show();

		sc.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case UP:

					timer2.start();

					// big_ball.setCenterY(big_ball.getCenterY() + 1);
					break;
				case RIGHT:
					big_ball.setCenterX(big_ball.getCenterX() + 5);
				//	ball.setCenterX(ball.getCenterX() + 1);
					break;
				case DOWN:
//					big_ball.setCenterX(big_ball.getCenterX() + 1);
//					break;
				case LEFT:
					big_ball.setCenterX(big_ball.getCenterX() - 5);
					break;
				}
			}
		});
		
		timer3.start();

	}
	
	AnimationTimer timer2 = new AnimationTimer() {

			double u = 4;
			double a = -0.04;
			double time = 0;
			double v = 1;
		
		@Override
		public void handle(long now) {

			
			// v = u+a *time;
			
		
			v = u + (a * time);
			time += 1;
			big_ball.setCenterY(big_ball.getCenterY() - v);	
			
			if(big_ball.getCenterY() >=600){
				u=4;
				a=-0.04;
				time =0;
				v=1;
				timer2.stop();
			}
			
			
		}

		
	};
	
	AnimationTimer timer3 = new AnimationTimer(){

		@Override
		public void handle(long arg0) {
			
			obstacle.setX(obstacle.getX() -3);
			
			if(obstacle.getX() <= 0){
				obstacle.setX(700);
			}
			
		}
		
	};
	
	

	private void moveCircleOnKeyPress(Scene scene, final Circle circle) {
		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case UP:

					break;
				case RIGHT:
					circle.setCenterX(circle.getCenterX() + 1);
					break;
				case DOWN:
					circle.setCenterY(circle.getCenterY() + 1);
					break;
				case LEFT:
					circle.setCenterX(circle.getCenterX() - 1);
					break;
				}
			}
		});
	}

	public static void main(String[] args) {

		Application.launch(args);

	}

}
