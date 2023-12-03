import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskOrgGUI extends Application {

    private final LinkedListAbstract linkedListAbstract = new LinkedListAbstract();



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
        System.out.println("Button pressed! Calling organizeTasks...");
        organizeTasks();
        System.out.println("organizeTasks called successfully!");

        linkedListAbstract.emptyArray("most");
        linkedListAbstract.emptyArray("mid");
        linkedListAbstract.emptyArray("least");

        collectAndAddTasks("most", item1from1, item2from1, item3from1);
        collectAndAddTasks("mid", item1from2, item2from2, item3from2);
        collectAndAddTasks("least", item1from3, item2from3, item3from3);
    }

    private void collectAndAddTasks(String category, TextField... textFields) {
        for (TextField textField : textFields) {
            linkedListAbstract.addToArray(category, textField.getText());
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

        linkedListAbstract.emptyArray("most");
        linkedListAbstract.emptyArray("mid");
        linkedListAbstract.emptyArray("least");

        for (int i = 1; i <= 3; i++) {

            linkedListAbstract.addToArray("most", getTaskFromTextField("item" + i + "from1"));
            linkedListAbstract.addToArray("mid", getTaskFromTextField("item" + i + "from2"));
            linkedListAbstract.addToArray("least", getTaskFromTextField("item" + i + "from3"));
        }
        

    }

    private String getTaskFromTextField(String textFieldId) {

        TextField textField = (TextField) mostTextArea.getScene().lookup("#" + textFieldId);
        return textField.getText();
    }

    private void organizeAndDisplay (String arrayLevel, TextArea resultArea) {

        List<String> organizedTasks = linkedListAbstract.shuffleArray(arrayLevel, 3);
        resultArea.setText(String.join("\n", organizedTasks));

    }

}