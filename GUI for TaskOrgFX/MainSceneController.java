import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputControl;

public class MainSceneController {

    @FXML
    private TextField text1;

    @FXML
    private TextField text2;

    @FXML
    private TextField text3;

    private TextInputControl label;

    @FXML
    void submitButton(ActionEvent event) {

        String input1 = text1.getText();
        String input2 = text2.getText();
        String input3 = text3.getText();
        label.setText("User input: " + input1 + ", " + input2 + ", " + input3);

    }

}
