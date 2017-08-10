package MidTerm2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class menubar_practice extends Application {

	public void start(Stage stage) {

		GridPane gp = new GridPane();
		Scene scene = new Scene(gp, 300, 400);

		MenuBar menubar = new MenuBar();
		Menu file = new Menu("File");
		MenuItem open = new MenuItem("Open");
		Text t = new Text();

		open.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {

				FileChooser fs = new FileChooser();
				File file = fs.showOpenDialog(stage);

				if (file != null) {
					Scanner scanner;
					try {
						scanner = new Scanner(file);

						String data = "";

						while (scanner.hasNextLine()) {

							data += scanner.nextLine();

						}

						t.setText(data);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}

		});

		open.setAccelerator(new KeyCodeCombination(KeyCode.Q, KeyCombination.CONTROL_DOWN));

		menubar.getMenus().add(file);
		file.getItems().add(open);
		gp.add(menubar, 0, 0);
		gp.add(t, 0, 1);

		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {

		Application.launch(args);
	}

}