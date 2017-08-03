package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;



public class Controller {

    @FXML
    void okPressed(ActionEvent event){

        //definiujemy jak ma byc zbudowane okno dialogowe

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("HAluuuuu");
        alert.setHeaderText("JUPEEE HEADER");
        alert.setContentText("SUPPER CONTENT ttttteeekst");

        alert.showAndWait();

    }
}
