package geekbrains.homework4.chat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    public TextArea mainTexArea;
    @FXML
    public TextField mainTextField;

    public void sendMessage(ActionEvent actionEvent) {
        if (!mainTextField.getText().equals("")) {
            mainTexArea.appendText(mainTextField.getText() + "\n");
            mainTextField.clear();
        } else {
            System.out.println("Пустая строка!");
        }
    }

}
