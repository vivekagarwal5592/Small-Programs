package Javafx;



import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.Scanner;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Popup;
import javafx.stage.Stage;

public class menubarpractice extends Application {

	

	@Override
	public void start(Stage arg0) throws Exception {
	
		GridPane sp = new GridPane();
		Scene sc = new Scene(sp,500,500);
		
		Button b = new Button();
		b.resize(100, 50);
		b.setText("Button");
		
		
		
		MenuBar mb = new MenuBar();
		Menu file = new Menu("File");
		Menu help = new Menu("Help");
		MenuItem quit = new MenuItem("Quit");
		MenuItem open = new MenuItem("Open");
		MenuItem about = new MenuItem("About");
		TextArea tv = new TextArea();
		
		
		quit.setOnAction(new EventHandler<ActionEvent>(){
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});
		
		open.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				FileChooser fileChooser = new FileChooser();
				File file = fileChooser.showOpenDialog(arg0);
				
				
				if(file !=null){
				//	tv.setText("File has been selected");
					String fileName = file.getName();          
					String fileExtension = fileName.substring(fileName.indexOf(".") + 1, file.getName().length());
					System.out.println(">> fileExtension" + fileExtension);
					Scanner scanner;
					
					try {
						
					
						
						
						String imageFileURI;
						try {
							imageFileURI = file.toURI().toURL()
									.toExternalForm();
							Image i = new Image(imageFileURI);
							 ImageView iv = new ImageView(i);
							 sp.getChildren().clear();
							 sp.add(iv, 4, 4);
						} catch (MalformedURLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						scanner = new Scanner(file);
					//	while(scanner.hasNext()){
						//String a = 	scanner.next();
			//				tv.appendText(a);
				//		}
						
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}	
				}
				
			}
			
			
		});
		
		quit.setAccelerator(new KeyCodeCombination(KeyCode.Q,KeyCombination.CONTROL_DOWN));
		sp.add(mb,0,0);
		sp.add(tv, 0, 1);
		sp.add(b,0,2);
		
		file.getItems().add(quit);
		file.getItems().add(open);
		mb.getMenus().add(file);
		
		arg0.setScene(sc);
		arg0.show();
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Application.launch(args);
		
	}

}
