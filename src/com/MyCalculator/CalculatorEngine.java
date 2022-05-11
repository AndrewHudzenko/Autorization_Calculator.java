package com.MyCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorEngine implements ActionListener {
    Calculator parent;
    char selectedAction = ' ';
    String selectedActionSCTCT = " ";

    double currentResult = 0.0;

    CalculatorEngine(Calculator parent) {
        this.parent = parent;
    }

    public void actionPerformed (ActionEvent event) {
        JButton clickButton = (JButton) event.getSource();
        String dispFieldText = parent.inputText.getText();

        double displayValue = 0.0;

        if (!"".equals(dispFieldText)) {
            displayValue = Double.parseDouble(dispFieldText);
        }

        Object src = event.getSource();

        if (src == parent.buttonPlus) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.inputText.setText("");
        } else if (src == parent.buttonMinus) {
            selectedAction = '-';
            currentResult = displayValue;
            parent.inputText.setText("");
        } else if (src == parent.buttonDivide) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.inputText.setText("");
        } else if (src == parent.buttonMultiply) {
            selectedAction = '*';
            currentResult = displayValue;
            parent.inputText.setText("");
        } else if (src == parent.buttonSin) {
            selectedActionSCTCT = "sin";
            currentResult = Math.sin(displayValue);
            parent.inputText.setText("" + currentResult);
        } else if (src == parent.buttonCos) {
            selectedActionSCTCT = "cos";
            currentResult = Math.cos(displayValue);
            parent.inputText.setText("" + currentResult);
        } else if (src == parent.buttonTg) {
            selectedActionSCTCT = "tg";
            currentResult = Math.tan(displayValue);
            parent.inputText.setText("" + currentResult);
        } else if (src == parent.buttonCtg) {
            selectedActionSCTCT = "ctg";
            currentResult = (Math.cos(displayValue)) / Math.sin(displayValue);
            parent.inputText.setText("" + currentResult);
        } else if (src == parent.buttonClear) {
            selectedActionSCTCT = "clear";
            currentResult = 0.0;
            parent.inputText.setText("");
        }
        else if (src == parent.buttonEqual) {

            if (selectedAction == '+') {
                currentResult += displayValue;
                parent.inputText.setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                parent.inputText.setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                parent.inputText.setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                parent.inputText.setText("" + currentResult);
            }
        }
        else {
          String clickedButtonLabel = clickButton.getText();
          parent.inputText.setText(dispFieldText + clickedButtonLabel);
        }

    }

}