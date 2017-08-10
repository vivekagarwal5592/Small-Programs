package Javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Hello extends Application{
        
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Text txt = new Text("Hello, World!");
        StackPane root = new StackPane();
        root.getChildren().add(txt);
        Scene sc = new Scene(root, 300, 250);
        primaryStage.setScene(sc);
        primaryStage.show();
      
        
    }
    
    
    public static void main(String[] args){
		Application.launch(args);
	}

}
