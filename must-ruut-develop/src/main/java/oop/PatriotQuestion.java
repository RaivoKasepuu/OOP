package oop;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PatriotQuestion extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();
        borderPane.setBackground((new Background(new BackgroundFill(Color.rgb(0,114,206), CornerRadii.EMPTY, Insets.EMPTY))));
        Label question = new Label("Eestlase test. Mille süütad Jõuluõhtul?");
        question.setFont(new Font(15));
        CheckBox option1 = new CheckBox("Küünla");
        CheckBox option2 = new CheckBox("Oleviste kiriku");
        CheckBox option3 = new CheckBox("Naabri sauna");
        VBox vbox = new VBox(8, question, option1, option2, option3);
        Button answerButton = new Button("Vasta!");

        answerButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
            public void handle(MouseEvent event) {
                if (!option1.isSelected() && option2.isSelected() || option3.isSelected()) {
                    FlowPane pane = new FlowPane(15, 15);
                    pane.setBackground(new Background(new BackgroundFill(Color.rgb(255,0,255), CornerRadii.EMPTY, Insets.EMPTY)));
                    Stage response = new Stage();
                    Label label = new Label("Vale vastus!");
                    Button okButton = new Button("Olen loll...");
                    okButton.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent event) {
                            response.hide();
                        }
                    });
                    pane.getChildren().addAll(label, okButton);
                    pane.setAlignment(Pos.CENTER);
                    Scene stseen = new Scene(pane, 250, 150);
                    response.setScene(stseen);
                    response.show();
                }
                else if (option1.isSelected() && option2.isSelected() || option3.isSelected()) {
                    FlowPane pane = new FlowPane(15, 15);
                    pane.setBackground(new Background(new BackgroundFill(Color.rgb(255,255,255), CornerRadii.EMPTY, Insets.EMPTY)));
                    Stage response = new Stage();
                    Label label = new Label("Oled segaduses?");
                    Button okButton = new Button("Jah, arenen veel!");
                    okButton.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent event) {
                            response.hide();
                        }
                    });
                    pane.getChildren().addAll(label, okButton);
                    pane.setAlignment(Pos.CENTER);
                    Scene stseen = new Scene(pane, 200, 100);
                    response.setScene(stseen);
                    response.show();
                }
                else if (!option1.isSelected() && !option2.isSelected() && !option3.isSelected()) {
                    FlowPane pane = new FlowPane(15, 15);
                    pane.setBackground(new Background(new BackgroundFill(Color.rgb(255,0,0), CornerRadii.EMPTY, Insets.EMPTY)));
                    Stage response = new Stage();
                    Label label = new Label("Täida test, tõbras!");
                    Button okButton = new Button("Kohe..");
                    okButton.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent event) {
                            response.hide();
                        }
                    });
                    pane.getChildren().addAll(label, okButton);
                    pane.setAlignment(Pos.CENTER);
                    Scene stseen = new Scene(pane, 200, 100);
                    response.setScene(stseen);
                    response.show();
                }
                else {
                    FlowPane pane = new FlowPane(15, 15);
                    pane.setBackground(new Background(new BackgroundFill(Color.rgb(0,114,206), CornerRadii.EMPTY, Insets.EMPTY)));
                    Stage response = new Stage();
                    Label label = new Label("Õige vastus!");
                    Button okButton = new Button("Olen Eestlane!");
                    okButton.setOnAction(new EventHandler<ActionEvent>() {
                        public void handle(ActionEvent event) {
                            response.hide();
                        }
                    });
                    pane.getChildren().addAll(label, okButton);
                    pane.setAlignment(Pos.CENTER);
                    Scene stseen = new Scene(pane, 200, 100);
                    response.setScene(stseen);
                    response.show();
                }
            }
        });
        borderPane.setBottom(answerButton);
        BorderPane.setAlignment(answerButton, Pos.CENTER);
        BorderPane.setMargin(answerButton, new Insets(15,12,12,12));
        borderPane.setCenter(vbox);
        vbox.setAlignment(Pos.CENTER);
        Scene stseen = new Scene(borderPane, 300, 150, Color.SNOW);
        primaryStage.setTitle("PatriotQuestion");
        primaryStage.setScene(stseen);
        primaryStage.show();
    }
}
