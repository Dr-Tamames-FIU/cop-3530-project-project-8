import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;


import java.net.URL;
import java.util.ResourceBundle;

public class MainSceneController {

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
<<<<<<< HEAD
    private TextField text3; 
=======
    private Button organizeButton;

    // angelica RotateArray instance
    private final Connection connection = new RotateArray();

    private final MostGroup mostGroup = new MostGroup();
    private final MiddleGroup middleGroup = new MiddleGroup();
    private final LeastGroup leastGroup = new LeastGroup();

    private Stage stage;
>>>>>>> f0595ae2ac1ea9e404da297224ff052913d575ff

    @FXML
    private TextInputControl label;

    @FXML
    void submitButton(ActionEvent event) {

        label.setText("User input: " + text1 + ", " + text2 + ", " + text3);

    }

<<<<<<< HEAD
=======
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    private void organizeTasks() {
        organizeGroup(mostGroup, mostTask1, mostTask2, mostTask3, mostTextArea);
        organizeGroup(middleGroup, middleTask1, middleTask2, middleTask3, middleTextArea);
        organizeGroup(leastGroup, leastTask1, leastTask2, leastTask3, leastTextArea);
    }

    private void organizeGroup(Connection group, TextField task1, TextField task2, TextField task3,
            TextArea resultArea) {
        List<String> tasks = Arrays.asList(task1.getText(), task2.getText(), task3.getText());
        group.sendArrayData(tasks);

        resultArea.setText(group.getArrayData() + ": " + group.getArrayData());
    }
>>>>>>> f0595ae2ac1ea9e404da297224ff052913d575ff
}
