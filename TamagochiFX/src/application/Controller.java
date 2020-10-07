package application;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {

    @FXML
    private Label label;
    @FXML
    private Label mainlabel;
    
    public void initialize() {
    	mainlabel.setText("\n  ·**·.¸(¯`·.¸*. WELCOME .*¸.·´¯)¸.·**·.   \n");
    }   

    @FXML
    private void handleButtonAction(ActionEvent event) {
        label.setText("Hello World!");
    }
}
