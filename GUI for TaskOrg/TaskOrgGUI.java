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

    // Here is the instance of RotateArray from Noah for managing task lists
    private final Connection connection = new RotateArrayAdapter(new RotateArray());



    // Here you can find the components for JavaFX UI 
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

    // You can launch the method over here as well 
    public static void main(String[] args) {
        launch(args);
    }

    // Override start method to initialize the JavaFX stage 

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Kudonan.fxml"));
        loader.setController(this);
        Parent root = loader.load();

        primaryStage.setTitle("Task Organizer");

        primaryStage.setScene(new Scene(root, 600, 400));

        primaryStage.show();
    }

    // Below you will find the button that makes the magic
    // when is pressed 
    @FXML
    private void organizeButton(ActionEvent event) {

        connection.emptyArray("most");

        connection.emptyArray("mid");

        connection.emptyArray("least");

        
        // The following collects the data and adds it to the text fields
        collectAndAddTasks("most", item1from1, item2from1, item3from1);

        collectAndAddTasks("mid", item1from2, item2from2, item3from2);

        collectAndAddTasks("least", item1from3, item2from3, item3from3);
    }

    // We can create a helper method to collect and add the data to RotateArray 
    private void collectAndAddTasks(String category, TextField... textFields) {
        for (TextField textField : textFields) {
            connection.addToArray(category, textField.getText());
        }
    }

    // Another magical data collector for the RotateArray
    @FXML
    private void organizeTasks(){
        collectTasksFromTextFields();

        organizeAndDisplay("most", mostTextArea);
        organizeAndDisplay("mid", middleTextArea);
        organizeAndDisplay("least", leastTextArea);

    }

    //Need of another data collector helper therefore this one is created 
    private void collectTasksFromTextFields(){

        connection.emptyArray("most");
        connection.emptyArray("mid");
        connection.emptyArray("least");

        for (int i = 1; i <= 3; i++) {

            connection.addToArray("most", getTaskFromTextField("item" + i + "from1"));
            connection.addToArray("mid", getTaskFromTextField("item" + i + "from2"));
            connection.addToArray("least", getTaskFromTextField("item" + i + "from3"));
        }
        

    }

    // Creation of a getter from the "most" field

    private String getTaskFromTextField(String textFieldId) {

        TextField textField = (TextField) mostTextArea.getScene().lookup("#" + textFieldId);
        return textField.getText();
    }

    // This one will help us display our content
    private void organizeAndDisplay (String arrayLevel, TextArea resultArea) {
        System.out.println("Organized Tasks for " + arrayLevel);
        List<String> organizedTasks = connection.shuffleArray((arrayLevel.toLowerCase()), 3);
        resultArea.clear();
        resultArea.setText(String.join("\n", organizedTasks));

    }

}