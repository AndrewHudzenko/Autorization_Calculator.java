package com.MyCalculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutorizationEngine implements ActionListener {
    Autorization parent;

    String currentString = "";
    int currentPassword = 0;

    AutorizationEngine(Autorization parent) {
        this.parent = parent;
    }

    public void actionPerformed (ActionEvent e) {
        JButton clickButton = (JButton) e.getSource();
        String dispFieldText = parent.loginTextField.getText();
        char[] dispFieldPassword = parent.passwordPasswordField.getPassword();
        String charPasswors  = "";
        for (char value: dispFieldPassword) {
            charPasswors += value;
        }
        int passwordNum = Integer.parseInt(charPasswors);


        String  displayString = "";
        int displayInt = 0;

        if (!"".equals(dispFieldText) & !"".equals(dispFieldPassword)) {
            displayString = dispFieldText;
            displayInt = passwordNum;
        }

        Object src = e.getSource();

        if (src == parent.buttonLogin) {
            currentString = displayString;
            currentPassword = displayInt;
        }
        if (currentString.equals(parent.login) & currentPassword == parent.password) {
            Calculator calculatorProgram = new Calculator();
            System.out.println(passwordNum);
        }

    }
}
