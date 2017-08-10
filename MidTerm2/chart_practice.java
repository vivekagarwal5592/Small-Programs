package MidTerm2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class chart_practice extends Application{


public void start(Stage stage){




NumberAxis x = new NumberAxis();
NumberAxis y = new NumberAxis();

LineChart<Number, Number> linechart  = new LineChart<Number, Number>(x,y);

XYChart.Series series = new XYChart.Series();

series.getData().add(new XYChart.Data<Integer,Integer>(1,13));
series.getData().add(new XYChart.Data<Integer,Integer>(2,33));
linechart.getData().add(series);
Scene scene = new Scene(linechart,800,600);
stage.setScene(scene);
stage.show();


}



public static void main(String[] args){

Application.launch(args);

}


}