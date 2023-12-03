import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskOrgGUI extends Application {

    private final RotateArray rotateArray = new RotateArray();



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
    private TextArea mostTextArea;
    @FXML
    private TextArea middleTextArea;
    @FXML
    private TextArea leastTextArea;

    @FXML
    private Button organizeButton;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Kudonan.fxml"));
        loader.setController(this);
        Parent root = loader.load();

        primaryStage.setTitle("Task Organizer");

        primaryStage.setScene(new Scene(root, 600, 400));

        primaryStage.show();
    }

    @FXML
    private void organizeButton(ActionEvent event) {

        rotateArray.emptyArray("most");

        rotateArray.emptyArray("mid");

        rotateArray.emptyArray("least");

        collectAndAddTasks("most", item1from1, item2from1, item3from1);

        collectAndAddTasks("mid", item1from2, item2from2, item3from2);

        collectAndAddTasks("least", item1from3, item2from3, item3from3);
    }

    private void collectAndAddTasks(String category, TextField... textFields) {
        for (TextField textField : textFields) {
            rotateArray.addToArray(category, textField.getText());
        }
    }

    @FXML
    private void organizeTasks(){
        collectTasksFromTextFields();

        organizeAndDisplay("most", mostTextArea);
        organizeAndDisplay("mid", middleTextArea);
        organizeAndDisplay("least", leastTextArea);

    }

    private void collectTasksFromTextFields(){

        rotateArray.emptyArray("most");
        rotateArray.emptyArray("mid");
        rotateArray.emptyArray("least");

        for (int i = 1; i <= 3; i++) {

            rotateArray.addToArray("most", getTaskFromTextField("item" + i + "from1"));
            rotateArray.addToArray("mid", getTaskFromTextField("item" + i + "from2"));
            rotateArray.addToArray("least", getTaskFromTextField("item" + i + "from3"));
        }
        

    }

    private String getTaskFromTextField(String textFieldId) {

        TextField textField = (TextField) mostTextArea.getScene().lookup("#" + textFieldId);
        return textField.getText();
    }

    private void organizeAndDisplay (String arrayLevel, TextArea resultArea) {

        List<String> organizedTasks = rotateArray.shuffleArray(rotateArray.getList(arrayLevel.toLowerCase()), 3);
        resultArea.setText(String.join("\n", organizedTasks));

    }

        private static class RotateArray {

            private List<String> most = new ArrayList<>();
            private List<String> mid = new ArrayList<>();
            private List<String> least = new ArrayList<>();
    
            public List<String> getList(String arrayLevel) {
                switch (arrayLevel.toLowerCase()) {
                    case "most":
                        return most;
                    case "mid":
                        return mid;
                    case "least":
                        return least;
                    default:
                        System.out.println("Array category not valid: " + arrayLevel);
                        return new ArrayList<>();
                }
            }
    
            public void addToArray(String arrayLevel, String task) {
                List<String> array = getList(arrayLevel);
                if (array != null) {
                    array.add(task);
                } else {
                    System.out.println("Array category not valid: " + arrayLevel);
                }
            }
    
            public List<String> shuffleArray(List<String> inputList, int amountTask) {
                List<String> shuffledList = new ArrayList<>(inputList);
        Collections.shuffle(shuffledList);

        int endIndex = Math.min(amountTask, shuffledList.size());
        return shuffledList.subList(0, endIndex);
            }
    
            public void emptyArray(String arrayLevel) {
                List<String> toEmptyArray = getList(arrayLevel);
                if (toEmptyArray != null) {
                    toEmptyArray.clear();
                    System.out.println(arrayLevel + " list is now empty");
                } else {
                    System.out.println("Array category is invalid: " + arrayLevel);
                }
            }
        }

}