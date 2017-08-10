package Hangman;

import java.util.Random;

import Javafx.AreaCircle.Calculation;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Driver extends Application {

	Integer wrong_answer_count;
	
	public Driver() {
		// gc = canvas.getGraphicsContext2D();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

	public String answer_word(String[] possible_answers) {
		Random r = new Random();
		int n = r.nextInt(possible_answers.length - 1);
		return possible_answers[n];
	}

	public String visible_answer(String answer) {
		String ans = "";
		for (int i = 0; i <= answer.length() - 1; i++) {
			ans += "*";
		}
		return ans;

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Driver obj = new Driver();
		wrong_answer_count = 0;
		String[] possible_answers = { "java", "programing" };
		String answer = obj.answer_word(possible_answers);
		Text visible_answer = new Text();
		Canvas canvas = new Canvas(1050, 550);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		// System.out.println("GC value" + gc);
		// System.out.println("I have set GC");
		Group g = new Group();
		g.getChildren().add(canvas);

		visible_answer.setText(obj.visible_answer(answer));

		TextField user_input = new TextField();
		Button calculate = new Button("Calculate");

		calculate.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				user_input.getText();
				String vis_ans = obj.check_user_input(user_input.getText(), answer, visible_answer.getText());
				System.out.println(vis_ans);
				System.out.println(visible_answer.getText());

				if (visible_answer.getText().equals(vis_ans)) {
					wrong_answer_count = increase_wrong_answer_counter(wrong_answer_count);
					draw_hangman(gc, wrong_answer_count);
					System.out.println(wrong_answer_count);
				} else {
					visible_answer.setText(vis_ans);
					
					if(vis_ans.equals(answer)){
						
						Alert alert = new Alert(AlertType.INFORMATION);
						alert.setTitle("Win");
					//	alert.setHeaderText("You Lose");
						alert.setContentText("You Win");

						alert.showAndWait();
						
					}
					
				}

			}
		});

		VBox vbox = new VBox();
		vbox.getChildren().add(user_input);
		vbox.getChildren().add(calculate);
		vbox.getChildren().add(visible_answer);
		BorderPane borderpane = new BorderPane();
		borderpane.setLeft(vbox);
		borderpane.setRight(g);
		Scene sc = new Scene(borderpane, 800, 500);
		primaryStage.setScene(sc);
		primaryStage.show();

	}

	public void draw_hangman(GraphicsContext gc, Integer wrong_ans_count) {

		int position_x=50;
		int position_y=50;
		
	
		if(wrong_ans_count ==1){
			System.out.println("I am here");
			gc.strokeLine(position_x, position_y, position_x+100, position_y);
		}
		if(wrong_ans_count ==2){
			gc.strokeLine(position_x+100,  position_y, position_x+100, position_y+50);
		}
		if(wrong_ans_count ==3){
			gc.strokeOval(position_x+75, position_y+50, 50, 50);
		}
		if(wrong_ans_count ==4){
			gc.strokeLine(position_x+100,  position_y+100, position_x+100,  position_y+200);
		}
		
		if(wrong_ans_count ==5){
			gc.strokeLine(position_x+100,  position_y+200, position_x+50,  position_y+220);
		}
		
		if(wrong_ans_count ==6){
			gc.strokeLine(position_x+100,  position_y+200, position_x+150,  position_y+220);
		}
		
		if(wrong_ans_count ==7){
			gc.strokeLine(position_x+100,  position_y+150, position_x+150,  position_y+170);
		}
		
		if(wrong_ans_count ==8){
			gc.strokeLine(position_x+100,  position_y+150, position_x+50,  position_y+170);
			
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Lose");
		//	alert.setHeaderText("You Lose");
			alert.setContentText("You Lose");

			alert.showAndWait();
			
		}
		
		
	}
	
	public int increase_wrong_answer_counter(Integer wrong_answer_count){
	wrong_answer_count +=1;
	System.out.println(wrong_answer_count);
	return wrong_answer_count;
	}

	public String check_user_input(String val, String answer, String ans) {

		// System.out.println("Val " + val);
		// System.out.println("Answer " + answer);
		// System.out.println("ans " + ans);
		for (int i = 0; i <= answer.length() - 1; i++) {

			// System.out.println("Answer " + answer.charAt(i));
			// System.out.println("Cal " + val.charAt(0));

			if (val.charAt(0) == answer.charAt(i)) {

				ans = ans.substring(0, i) + answer.charAt(i) + ans.substring(i + 1);
				// System.out.println(ans.replace(ans.charAt(i),
				// val.charAt(0)));

			} else {
				// System.out.println(gc);

			}
		}

		return ans;

	}

}
