import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Arrays;
import java.util.List;

import Integration.Connection;

public class MainSceneController {

    @FXML
    private TextField mostTask1;
    @FXML
    private TextField mostTask2;
    @FXML
    private TextField mostTask3;
    @FXML
    private TextField middleTask1;
    @FXML
    private TextField middleTask2;
    @FXML
    private TextField middleTask3;
    @FXML
    private TextField leastTask1;
    @FXML
    private TextField leastTask2;
    @FXML
    private TextField leastTask3;

    @FXML
    private TextArea mostTextArea;
    @FXML
    private TextArea middleTextArea;
    @FXML
    private TextArea leastTextArea;

    @FXML
    private Button organizeButton;

    private final MostGroup mostGroup = new MostGroup();
    private final MiddleGroup middleGroup = new MiddleGroup();
    private final LeastGroup leastGroup = new LeastGroup();

    private Stage stage;

    @FXML
    private void initialize() {
        organizeButton.setOnAction(event -> organizeTasks());
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    private void organizeTasks() {
        organizeGroup(mostGroup, mostTask1, mostTask2, mostTask3, mostTextArea);
        organizeGroup(middleGroup, middleTask1, middleTask2, middleTask3, middleTextArea);
        organizeGroup(leastGroup, leastTask1, leastTask2, leastTask3, leastTextArea);
    }

    private void organizeGroup(Connection group, TextField task1, TextField task2, TextField task3, TextArea resultArea) {
        List<String> tasks = Arrays.asList(task1.getText(), task2.getText(), task3.getText());
        group.sendArrayData(tasks);

        resultArea.setText(group.getArrayData() + ": " + group.getArrayData());
    }
}
