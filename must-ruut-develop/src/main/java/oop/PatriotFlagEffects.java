package oop;

import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PatriotFlagEffects extends Application {

    @Override
    public void start(Stage peaLava) throws Exception {


        Group juur = new Group();
        Canvas lõuend = new Canvas(265, 265);

        DropShadow vari = new DropShadow(20, Color.GREY);
        vari.setOffsetX(5);
        vari.setOffsetY(5);


        Rectangle sinine = new Rectangle(50,50,165,35);
        Rectangle must = new Rectangle(50,85,165,35);
        Rectangle valge = new Rectangle(50,120,165,35);
        sinine.setFill(Color.rgb(0,114,206));
        sinine.setEffect(vari);
        must.setFill(Color.BLACK);
        must.setEffect(vari);
        valge.setFill(Color.WHITE);
        valge.setEffect(vari);



        Button nupp1 = new Button("The Nupp"); // luuakse nupp
        nupp1.setLayoutX(100); // nupu paigutamine x-koordinaadi mõttes
        nupp1.setLayoutY(200); // nupu paigutamine y-koordinaadi mõttes
        juur.getChildren().add(nupp1); // nupp lisatakse juure alluvaks
        nupp1.setEffect(vari);


        Scene stseen1 = new Scene(juur, 265, 265, Color.LIGHTGREY);
        peaLava.setScene(stseen1);
        peaLava.setTitle("Eesti lipp varju ja nupuga");



        FadeTransition ft = new FadeTransition(Duration.millis(3000), nupp1);  // luuakse uus haihtumine
        ft.setFromValue(1.0);  // määratakse algväärtus (1.0 - täiesti selge)
        ft.setToValue(0.0); // määratakse lõppväärtus (0 - täiesti haihtunud)
        ft.setCycleCount(Timeline.INDEFINITE); // lõpmatu tsüklite arv
        ft.setAutoReverse(true); // lõppu jõudes tagasi, algusest jälle edasi
        ft.play(); // animatsioon mängima

        juur.getChildren().add(sinine);
        juur.getChildren().add(must);
        juur.getChildren().add(valge);
        juur.getChildren().add(lõuend);
        peaLava.show();




    }

}
