import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskOrgGUI extends Application {
    private final Connection connection = new RotateArray();

    @FXML
    private TextField item1from1;
    @FXML
    private TextField item2from1;
    @FXML
    private TextField item3from1;
    @FXML
    private TextField item1from2;
    @FXML
    private TextField item2from2;
    @FXML
    private TextField item3from2;
    @FXML
    private TextField item1from3;
    @FXML
    private TextField item2from3;
    @FXML
    private TextField item3from3;

    @FXML
    private TextArea result1;
    @FXML
    private TextArea result2;
    @FXML
    private TextArea result3;

    @FXML
    private Button organizeButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Kudonan.fxml"));
        loader.setController(this);
        AnchorPane root = loader.load();

        primaryStage.setTitle("Task Organizer");

        primaryStage.setScene(new Scene(root, 600, 400));

        primaryStage.show();
    }
}
