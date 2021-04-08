package oop;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class PatriotButton extends Application {

    @Override
    public void start(Stage peaLava) {

        StackPane kalamBuur = new StackPane();
        kalamBuur.setBackground(new Background(new BackgroundFill(Color.rgb(0,114,206), CornerRadii.EMPTY, Insets.EMPTY)));

        peaLava.setHeight(500.0);
        peaLava.setMinHeight(100.0);
        peaLava.setWidth(500.0);
        peaLava.setMinWidth(200.0);

        Scene stseen = new Scene(kalamBuur, peaLava.getWidth(), peaLava.getHeight(), Color.RED);
        Button patriotButton = new Button("PatriotButton");
        stseen.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                patriotButton.setLayoutX(((double) newValue));
            }
        });
        stseen.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                patriotButton.setLayoutY(((double) newValue));
            }
        });
        patriotButton.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> {
            patriotButton.setTranslateX(patriotButton.getLayoutY() - Math.random() * peaLava.getWidth() * 0.5);
            patriotButton.setTranslateY(patriotButton.getLayoutY() - Math.random() * peaLava.getHeight() * 0.5);
        });

        kalamBuur.getChildren().add(patriotButton);
        peaLava.setScene(stseen);
        peaLava.setTitle("PatriotButtonEscape");
        peaLava.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



