package oop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RuutjuureKalkulaator extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane juur = new BorderPane();
        TextField textField = new TextField("");


        juur.setTop(textField);

        BorderPane bp = new BorderPane();

        Button kustuta = new Button("Kustuta");
        bp.setLeft(kustuta);


        Button ruutjuur = new Button("Ruutjuur");
        bp.setRight(ruutjuur);

        juur.setCenter(bp);

        kustuta.setOnMouseClicked(me -> {

            textField.setText("");

        });

        ruutjuur.setOnMouseClicked(me -> {

            double arv = Double.parseDouble(textField.getText());
            double rj = Math.sqrt(arv);
            textField.setText(String.valueOf(rj));

        });

        FlowPane flowPane = new FlowPane();
        juur.setBottom(flowPane);

        Button button0 = new Button("0");
        button0.setPrefSize(80, 10);
        flowPane.getChildren().add(button0);
        button0.setOnMouseClicked(me ->{
            String s = textField.getText();
            textField.setText(s + "0");
        });

        Button button1 = new Button("1");
        button1.setPrefSize(80, 10);
        flowPane.getChildren().add(button1);
        button1.setOnMouseClicked(me ->{
            String s = textField.getText();
            textField.setText(s + "1");
        });

        Button button2 = new Button("2");
        button2.setPrefSize(80, 10);
        flowPane.getChildren().add(button2);
        button2.setOnMouseClicked(me ->{
            String s = textField.getText();
            textField.setText(s + "2");
        });



        Scene scene = new Scene(juur,260, 200, Color.SNOW);
        primaryStage.setTitle("Ruutjuure Kalkulaator");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
