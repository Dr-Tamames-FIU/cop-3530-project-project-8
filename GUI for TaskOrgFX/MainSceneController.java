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
    private TextField text3; 

    @FXML
    private TextInputControl label;

    @FXML
    void submitButton(ActionEvent event) {

        label.setText("User input: " + text1 + ", " + text2 + ", " + text3);

    }

}
