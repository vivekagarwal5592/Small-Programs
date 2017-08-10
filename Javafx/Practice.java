package Javafx;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import javafx.scene.input.MouseEvent;


import Lecture_javafx.MyClickHandler;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Popup;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Practice extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		GridPane gp = new GridPane();
		Scene scene = new Scene(gp,500,600);

		Button b = new Button("Button");
		Text t = new Text("Button has not been clicked");

		
		EventHandler<Event> handler = new MyClickHandler<Event>();
		b.addEventHandler(MouseEvent.MOUSE_DRAGGED, handler);
		
//		b.addEventHandler(EventType<MouseEvent.BUTTON_LEFT>, EventHandler<MouseEvent>() {
//
////			@Override
////			public void handle(ActionEvent arg0) {
////				t.setText(String.valueOf(arg0.getEventType()));
////				
////				
////				
////				if(arg0.getEventType().equals(MouseEvent.CLICK)){
////					//t.setText("oashujf");
////				}
////				
////
////			}
//
//			@Override
//			public void handle(MouseEvent event) {
//				// TODO Auto-generated method stub
//				
//			}
//
//		});
		
		  b.addEventHandler(MouseEvent.MOUSE_DRAGGED,
	                new EventHandler<MouseEvent>() {
	            @Override public void handle(MouseEvent e) {
	             //   b.setEffect(shadow);
	            }
	        });
		  
		  b.addEventHandler(MouseEvent.MOUSE_EXITED,
	                new EventHandler<MouseEvent>() {
	            @Override public void handle(MouseEvent e) {
	                b.setEffect(null);
	            }
	        });
		  
		  b.addEventHandler(MouseEvent.MOUSE_ENTERED,
			        new EventHandler<MouseEvent>() {
			          @Override
			          public void handle(MouseEvent e) {
			          //  b.setEffect(shadow);
			          }
			        });
		
		
//		b.setOnMouseDragEntered(new EventHandler<MouseEvent>() {
//		    @Override
//		    public void handle(MouseEvent mouseEvent) {
//		        if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
//		            if(mouseEvent.getClickCount() == 2){
//		                System.out.println("Double clicked");
//		            }
//		        }
//		    }
//		});
		
		Menu File = new Menu("File");
		MenuBar menubar = new MenuBar();
		MenuItem New = new MenuItem("New");
		
		
		New.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				
			
				FileChooser filechooser = new FileChooser();
				File file = filechooser.showOpenDialog(stage);
				
				if(file != null){
					try {
						Scanner s = new Scanner(file);
						String data="";
						while(s.hasNext()){
							
						data +=	s.next();
						
						
							
						}
						t.setText(data);
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		});
		
		New.setAccelerator(new KeyCodeCombination(KeyCode.Q,KeyCombination.CONTROL_DOWN));
		
		menubar.getMenus().add(File);
		File.getItems().add(New);
		
		gp.add(menubar, 0, 0);
		gp.add(b, 0, 1);
		gp.add(t, 0, 2);

		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args) {

		Application.launch(args);

	}

}
