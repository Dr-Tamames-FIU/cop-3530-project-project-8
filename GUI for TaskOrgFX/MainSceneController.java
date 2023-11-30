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

        label.setText("User input: " + text1 + ", " + text2 + ", " + text3);

    }

}
