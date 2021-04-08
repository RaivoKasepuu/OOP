package oop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class PatriotMouseRing extends Application {

    @Override
    public void start(Stage peaLava)   {

        BorderPane uiguurikasMasuurikas = new BorderPane();

        Circle ring1 = new Circle(150, 150, 150, Color.RED);

        ring1.setOnMouseMoved(event -> ring1.setFill(Color.BLACK));
        ring1.setOnMousePressed(event -> ring1.setFill(Color.WHITE));
        ring1.setOnMouseReleased(event -> ring1.setFill(Color.RED));

        uiguurikasMasuurikas.setTop(ring1);
        Scene stseen = new Scene(uiguurikasMasuurikas, 300, 300, Color.rgb(0,114,206));
        // peaLava.getIcons().add(new Image("D://_Tartu/icon.png"));
        peaLava.setScene(stseen);
        peaLava.setTitle("PatriotMouse");
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}