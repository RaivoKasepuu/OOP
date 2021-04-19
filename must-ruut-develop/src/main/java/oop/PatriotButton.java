package oop;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class PatriotButton extends Application {

    private Pane kalamBuur = new Pane();
    private Button patriotButton = new Button("Patriot\nButton ");

    @Override
    public void start(Stage primaryStage) {

        kalamBuur.setBackground(new Background(new BackgroundFill(Color.rgb(0, 114, 206), CornerRadii.EMPTY, Insets.EMPTY)));
        primaryStage.setHeight(500.0);
        primaryStage.setMinHeight(200.0);
        primaryStage.setWidth(500.0);
        primaryStage.setMinWidth(250.0);

        Scene scene = new Scene(kalamBuur, primaryStage.getWidth(), primaryStage.getHeight(), Color.rgb(0, 114, 206));
        patriotButton.setPrefSize(55, 55);
        patriotButton.setTextFill(Color.rgb(0, 114, 206));
        patriotButton.setLayoutX(ButtonX());
        patriotButton.setLayoutY(ButtonY());

        primaryStage.addEventHandler(MouseEvent.ANY, action -> {
            patriotButton.setVisible(true);
        });

        patriotButton.addEventHandler(MouseEvent.ANY, event -> {
            patriotButton.setLayoutX(ButtonX());
            patriotButton.setLayoutY(ButtonY());
        });

        ChangeListener<Number> stageSizeListener = (observable, oldValue, newValue) -> {
            patriotButton.setLayoutX(ButtonX());
            patriotButton.setLayoutY(ButtonY());
        };

        primaryStage.widthProperty().addListener(stageSizeListener);
        primaryStage.heightProperty().addListener(stageSizeListener);
        kalamBuur.getChildren().add(patriotButton);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Patriot Button Escape");
        primaryStage.show();
    }

    public double ButtonX() {
        return Math.random() * (kalamBuur.boundsInParentProperty().get().getMaxX() * 0.65);
    }

    public double ButtonY() {
        return Math.random() * (kalamBuur.boundsInParentProperty().get().getMaxY() * 0.65);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
