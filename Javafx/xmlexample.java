package Javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class xmlexample extends Application{

	 @Override
	    public void start(Stage stage) throws Exception {
	       Parent root = FXMLLoader.load(getClass().getResource("/layout.fxml"));
	    
	        Scene scene = new Scene(root, 300, 275);
	    
	        stage.setTitle("FXML Welcome");
	        stage.setScene(scene);
	        stage.show();
	    }
	 
	 public static void main(String[] args){
		 
		 Application.launch(args);
	 }
	
}
