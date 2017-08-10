package Lab12;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DriverRecursion extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		RecursiveProbs recursion = new RecursiveProbs();
		Label label1 = new Label("String");
		Label label2 = new Label("Chacter");
		TextField input = new TextField();
		TextField character = new TextField();
		VBox container = new VBox();
		BorderPane bp = new BorderPane();
		Button get_result = new Button("Get Result");
		Text result = new Text();
		Scene scene = new Scene(bp,450,200);

		get_result.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				String val = "";
				try{
				
				char a = String.valueOf((character.getText())).charAt(0);
				if (recursion.recursiveAllCharactersSame(input.getText())) {
					val += "\nrecursiveAllCharactersSame\nThe characters in the String " + input.getText()
							+ " are same\n";
				} else {
					val += "\nrecursiveAllCharactersSame\n the characters in the String " + input.getText()
							+ " are not same\n";
				}

				val += "\nrecursiveCount\nThe reversal of the String " + input.getText() + " is "
						+ recursion.recursiveReverse( input.getText()) + "\n";

				val += "\nrecursiveReverse\n The character '" + character.getText() + "' occurs "
						+ recursion.recursiveCount( a, input.getText()) + " time(s) in the String '" + input.getText()+"'";

				
				}catch(Exception e){
					val = "Please enter correct values in the box";
					e.printStackTrace();
					
				}
				finally{
					
					result.setText(val);
				}
			}

		});
		// Recursion recursion = new Recursion();

		// System.out.println(recursion.recursiveAllCharactersSame("sdss"));
		// System.out.println(recursion.recursiveCount('b', "aaa"));
		// System.out.println(recursion.recursiveReverse("abcd"));

		container.getChildren().add(label1);
		container.getChildren().add(input);
		container.getChildren().add(label2);
		container.getChildren().add(character);
		container.getChildren().add(get_result);
		bp.setLeft(container);
		bp.setRight(result);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {

		Application.launch(args);
	}

}
