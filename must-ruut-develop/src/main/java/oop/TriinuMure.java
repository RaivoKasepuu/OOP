package oop;

import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class TriinuMure {

    public void start(Stage peaLava) {
        BorderPane piir = new BorderPane();

        // tekstivälja loomine ja lisamine piiripaanile (üles)
        TextField tekst = new TextField();
        tekst.setText("mingi tekst");
        piir.setTop(tekst);

        // sündmuse lisamine tekstiväljale (klahvisündmus reageerib
        // ainult enter-i vajutamisele)
        tekst.setOnKeyPressed(new EventHandler<KeyEvent>() {
            public void handle(KeyEvent keyEvent) {
                if (keyEvent.getCode() == KeyCode.ENTER) {
                    tekst.setText("nüüd vajutasin ENTER");
                }
            }
        });

        piir.getChildren().add(tekst);
        peaLava.setTitle("Triinu mure");


        peaLava.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
