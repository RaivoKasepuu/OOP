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
    public void start(Stage primaryStage) {

        StackPane kalamBuur = new StackPane();
        kalamBuur.setBackground(new Background(new BackgroundFill(Color.rgb(0, 114, 206), CornerRadii.EMPTY, Insets.EMPTY)));

        primaryStage.setHeight(500.0);
        primaryStage.setMinHeight(100.0);
        primaryStage.setWidth(500.0);
        primaryStage.setMinWidth(200.0);

        Scene scene = new Scene(kalamBuur, primaryStage.getWidth(), primaryStage.getHeight(), Color.rgb(0, 114, 206));
        Button patriotButton = new Button("PatriotButton");
        patriotButton.setTextFill(Color.rgb(0, 114, 206));

/*
        scene.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                patriotButton.setLayoutX(((double) newValue));
            }
        });
        scene.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                patriotButton.setLayoutY(((double) newValue));
            }
        });

  */
        kalamBuur.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                //patriotButton.setLayoutX(((double) newValue));
                patriotButton.setTranslateX(100);
           }
        });

        kalamBuur.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                //patriotButton.setLayoutY(((double) newValue));
                patriotButton.setTranslateY(100);
            }
        });


        patriotButton.addEventHandler(MouseEvent.MOUSE_ENTERED, event -> {

            patriotButton.setTranslateX(Math.random() * (kalamBuur.boundsInParentProperty().get().getMaxX() - patriotButton.boundsInParentProperty().get().getMaxX()));
            patriotButton.setTranslateY(Math.random() * (kalamBuur.boundsInParentProperty().get().getMaxY() - patriotButton.boundsInParentProperty().get().getMaxY()));

        });

        kalamBuur.getChildren().add(patriotButton);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PatriotButtonEscape");
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}



