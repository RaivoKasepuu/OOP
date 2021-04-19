package oop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PatriotTriin extends Application {

    @Override
    public void start(Stage peaLava)   {

        BorderPane uiguurikasMasuurikas = new BorderPane();

        Circle ring1 = new Circle(150, 150, 150, Color.RED);
        TextField tekst = new TextField();
        tekst.setText("mingi tekst");
        uiguurikasMasuurikas.setTop(tekst);

        Scene stseen = new Scene(uiguurikasMasuurikas, 300, 300, Color.rgb(0,114,206));
        peaLava.setScene(stseen);
        peaLava.setTitle("PatriotTriin");
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}