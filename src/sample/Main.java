package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {
    private Label mylabel;
    private Label mylabel2;


    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Hello JavaFX");
        Button button = new Button();
        button.setText("Click Me!");

        mylabel = new Label();
        mylabel2 = new Label();


        mylabel.setText("This is my label");
        mylabel2.setText("Label 2");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Hello JavaFX");
            }
        });

        FlowPane flowPaneRoot = new FlowPane(10, 10);
        flowPaneRoot.setAlignment(Pos.CENTER);


        //StackPane root = new StackPane();
        flowPaneRoot.getChildren().add(button);
        flowPaneRoot.getChildren().add(mylabel);
        flowPaneRoot.getChildren().add(mylabel2);
        Scene scene = new Scene(flowPaneRoot, 350, 200);
        primaryStage.setScene(scene);
        primaryStage.show();





    }


    public static void main(String[] args) {
        launch(args);
    }
}
