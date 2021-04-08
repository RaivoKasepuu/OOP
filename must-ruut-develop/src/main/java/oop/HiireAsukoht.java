package oop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;

public class HiireAsukoht extends Application {
    public void start(Stage peaLava) throws Exception {

        Group juur = new Group();
        Scene stseen = new Scene(juur, 555, 555, Color.rgb(0, 114, 206));
        List<Text> koordinaat = new ArrayList<>();
        stseen.setOnMouseClicked(me -> {
            int x = (int) me.getX();
            int y = (int) me.getY();
            Text koordinaadid = new Text(x, y, "(" + x + "," + y + ")");
            koordinaat.add(koordinaadid);
            juur.getChildren().removeAll(koordinaat);
            juur.getChildren().add(koordinaadid);
        });
        stseen.setOnMouseDragged(me -> {
            int x = (int) me.getX();
            int y = (int) me.getY();
            Text koordinaadid = new Text(x, y, "(" + x + "," + y + ")");
            koordinaat.add(koordinaadid);
            juur.getChildren().removeAll(koordinaat);
            juur.getChildren().add(koordinaadid);
        });

        peaLava.setScene(stseen);
        peaLava.setTitle("Hiire Asukoht");


        peaLava.show();


    }


}
