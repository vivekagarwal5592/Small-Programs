package Quizx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class driver extends Application {
	int val;
	Label label[][];

	@Override
	public void start(Stage Stage) throws Exception {

		label = new Label[10][10];
		BorderPane bp = new BorderPane();
		Scene sc = new Scene(bp, 500, 500);
		HBox hbox = new HBox();
		GridPane gp = new GridPane();
		TextField textfield = new TextField();
		Button submit = new Button("Submit");

		for (int i = 0; i <= label.length - 1; i++) {
			for (int j = 0; j <= label[i].length - 1; j++) {
				label[i][j] = new Label();
				label[i][j].setId(String.valueOf(i * j));
				label[i][j].setText(" " +String.valueOf(i) + "*" +String.valueOf(j) +" ");
				label[i][j].setStyle("-fx-background-color: #ff0000;");
				gp.add(label[i][j], j, i);
				gp.setMargin(label[i][j], new Insets(0.5, 0.5, 0.5, 0.5));
				
				final int x = i;
				final int y = j;
				
				label[i][j].addEventHandler(MouseEvent.MOUSE_CLICKED,new EventHandler<Event>(){
					 
					@Override
					public void handle(Event arg0) {
					
						textfield.setText(String.valueOf(x*y));
						
					}
					
					
				});
				
			}
		}

		submit.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				val = Integer.parseInt(textfield.getText());

				for (int i = 0; i <= label.length - 1; i++) {
					for (int j = 0; j <= label[i].length - 1; j++) {

						if (val == Integer.valueOf(label[i][j].getId())) {
							label[i][j].setStyle("-fx-background-color: #ffffff;");
						}
						
						else{
							label[i][j].setStyle("-fx-background-color: #ff0000;");
						}

						System.out.print(String.valueOf(i)+String.valueOf(j) + " ");
					}
					System.out.println();
				}

			}

		});

		hbox.getChildren().add(submit);
		hbox.getChildren().add(textfield);
		bp.setTop(hbox);
		bp.setCenter(gp);
		Stage.setScene(sc);
		Stage.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Application.launch(args);
	}

}
