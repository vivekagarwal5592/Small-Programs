package MidTerm2;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class practice_javafx extends Application {

	public void start(Stage stage) throws Exception {

		GridPane gp = new GridPane();
		Scene scene = new Scene(gp, 300, 400);

		Button b1 = new Button("Set text");
		Button b2 = new Button("Open text File");
		Button b3 = new Button("Open image file");
		Text t = new Text();

		b1.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {

				t.setText("Button has been clicked");

			}
		});

		b2.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {

				FileChooser fc = new FileChooser();
				File file = fc.showOpenDialog(stage);

				if (file != null) {
					Scanner scanner;
					try {
						scanner = new Scanner(file);
						String file_data = "";
						while (scanner.hasNextLine()) {

							file_data += scanner.nextLine();
						}

						scanner.close();
						t.setText(file_data);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}
		});

		b3.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent e) {
				FileChooser fs = new FileChooser();
				File f = fs.showOpenDialog(stage);

				if (f != null) {
					String file_name;
					try {
						file_name = f.toURI().toURL().toExternalForm();
						Image i = new Image(file_name);
						ImageView iv = new ImageView(i);
						gp.add(iv, 0, 0);
					} catch (MalformedURLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});

		gp.add(b1, 0, 0);
		gp.add(b2, 1, 0);
		gp.add(b3, 2, 0);
		gp.add(t, 0, 1);

		stage.setScene(scene);
		stage.show();

	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}