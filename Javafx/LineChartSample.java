package Javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineChartSample extends Application {
 
    @Override public void start(Stage stage) {
        stage.setTitle("Line Chart Sample");
        //defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Number of Month");
        //creating the chart
        final LineChart<Number,Number> lineChart = 
                new LineChart<Number,Number>(xAxis,yAxis);
                
        lineChart.setTitle("Stock Monitoring, 2010");
        //defining a series
        XYChart.Series series = new XYChart.Series();
        series.setName("My portfolio");
        //populating the series with data
        series.getData().add(new XYChart.Data<Integer,Integer>(1,23));
        series.getData().add(new XYChart.Data<Integer, Integer>(1, 23));
        series.getData().add(new XYChart.Data<Integer, Integer>(2, 14));
        series.getData().add(new XYChart.Data<Integer, Integer>(3, 15));
        series.getData().add(new XYChart.Data<Integer, Integer>(4, 24));
        series.getData().add(new XYChart.Data<Integer, Integer>(5, 34));
        series.getData().add(new XYChart.Data<Integer, Integer>(6, 36));
        series.getData().add(new XYChart.Data<Integer, Integer>(7, 22));
        series.getData().add(new XYChart.Data<Integer, Integer>(8, 45));
        series.getData().add(new XYChart.Data<Integer, Integer>(9, 43));
        series.getData().add(new XYChart.Data<Integer, Integer>(10, 17));
        series.getData().add(new XYChart.Data<Integer, Integer>(11, 29));
        series.getData().add(new XYChart.Data<Integer, Integer>(12, 25));
        
        Scene scene  = new Scene(lineChart,800,600);
        lineChart.getData().add(series);
       
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}

