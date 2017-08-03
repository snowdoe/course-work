package sample;

import javafx.application.Platform;
import javafx.fxml.FXML;


import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    @FXML
    private TextField xValue;
    @FXML
    private TextField yValue;
    @FXML
    private TextField outcome;
    @FXML
    public void onAddButton(){

        double x,y;
        try {
            x = Double.parseDouble(xValue.getText());
            y = Double.parseDouble(yValue.getText());

            outcome.setText(String.valueOf(x+y));
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "HEY DON\'T DO THAT!", JOptionPane.ERROR_MESSAGE);

        }

    }
    public void onSubstractButton(){

        double x,y;
        try {
            x = Double.parseDouble(xValue.getText());
            y = Double.parseDouble(yValue.getText());

            outcome.setText(String.valueOf(x-y));
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "HEY DON\'T DO THAT!", JOptionPane.ERROR_MESSAGE);

        }

    }
    @FXML
    public void onDivideButton(){

        double x,y;
        try {
            x = Double.parseDouble(xValue.getText());
            y = Double.parseDouble(yValue.getText());
            if (y==0){
                throw new Exception("Do not divide by zero!!!");
            }
            outcome.setText(String.valueOf(x/y));
            } catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "HEY DON\'T DO THAT!", JOptionPane.ERROR_MESSAGE);

        }

    }
    @FXML
    public void onMultiplyButton(){
        double x,y;
        try {
            x = Double.parseDouble(xValue.getText());
            y = Double.parseDouble(yValue.getText());
            outcome.setText(String.valueOf(x*y));

        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "HEY DON\'T DO THAT!", JOptionPane.ERROR_MESSAGE);
        }


    }

}
