package Lab9;


import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class driver_bullrun extends Application {

	int i = 0;
	int j = 0;

	@Override
	public void start(Stage stage) throws Exception {

		MazeGUIPane mazeguipane = new MazeGUIPane();
		Scene scene = new Scene(mazeguipane);

		

		
		stage.setScene(scene);
		stage.show();


		scene.setOnKeyPressed(new EventHandler<KeyEvent>() {

			public void handle(KeyEvent event) {
				switch (event.getCode()) {
				case UP:
					mazeguipane.move_man_y(-1);	
					break;
				case RIGHT:
					mazeguipane.move_man_x(1);
					break;
				case DOWN:
					mazeguipane.move_man_y(1);	
					break;
				case LEFT:
					mazeguipane.move_man_x(-1);
					break;
				}
			}
		});

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
