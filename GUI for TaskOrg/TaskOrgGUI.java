import java.io.IOException;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TaskOrgGUI extends Application {

    private Label label;
    private TextField text1, text2, text3;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Parent root; 
        root = FMXLLoader.load(getClass().getResource("MainScene.fxml"));
            Scene scene = new Scene(root);

            primaryStage.setTitle("Task Organizer");
            primaryStage.setScene(scene);
            primaryStage.show();
        }


    }

