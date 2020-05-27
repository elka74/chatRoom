package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public Button btn;
    @FXML
    public TextField textField;
    @FXML
    public TextArea textArea;

    public void btnClick(ActionEvent actionEvent) {
        textArea.appendText(textField.getText());
        textField.setText("");
    }

    public void textEnter(ActionEvent actionEvent) {
        textArea.appendText(textField.getText());
        textField.setText("");
    }
}
