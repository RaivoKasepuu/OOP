package oop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class PatriotFlag extends Application {

  @Override
  public void start(Stage peaLava) throws Exception {


    Group juur = new Group();
    Canvas lõuend = new Canvas(265, 205);
    GraphicsContext gc = lõuend.getGraphicsContext2D();
    gc.setFill(Color.rgb(0,114,206));
    gc.fillRect(50,50,165,35);
    gc.setFill(Color.BLACK);
    gc.fillRect(50,85,165,35);
    gc.setFill(Color.WHITE);
    gc.fillRect(50,120,165,35);
    Scene stseen1 = new Scene(juur, 265, 205, Color.LIGHTGREY);
    peaLava.setScene(stseen1);
    peaLava.setTitle("Eesti lipp");
    peaLava.show();
    juur.getChildren().add(lõuend);
    peaLava.show();


  }

}
