package oop;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Newton extends Application {

  @Override
  public void start(Stage peaLava) throws Exception {


    Group juur = new Group();
    Canvas lõuend = new Canvas(535.5, 535.5);
    GraphicsContext gc = lõuend.getGraphicsContext2D();
    Rectangle rectangle = new Rectangle(50, 50, 300, 200);
    gc.fillRect(50,50,435,435);
    juur.getChildren().add(rectangle);
    Scene stseen1 = new Scene(juur, 530, 530, Color.SEASHELL);
    peaLava.setScene(stseen1);
    peaLava.setTitle("Must Ruut");
    peaLava.show();


    juur.getChildren().add(lõuend);


    peaLava.show();
     
/*

    Group juur = new Group();
    Rectangle rectangle = new Rectangle(50,50, 300,200);
    juur.getChildren().add(rectangle);
    Scene stseen = new Scene(juur, 530, 530, Color.SEASHELL);
    peaLava.setScene(stseen);
    peaLava.setTitle("Must Ruut");



    peaLava.show();
  }
*/

  }

}
