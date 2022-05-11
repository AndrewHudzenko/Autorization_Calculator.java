package com.MyCalculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Autorization {

    JFrame frame = new JFrame("Autorizatoin in system");
    JLabel loginLabel = new JLabel("Login: ");
    JLabel passwordLabel = new JLabel("Password: ");
    JTextField loginTextField = new JTextField(15);
    JPasswordField passwordPasswordField = new JPasswordField(15);
    JButton buttonLogin = new JButton("Login in");

    String login = "Buuufy";
    int password = 12345678;


    Autorization() {
        frame.setLayout(new GridBagLayout());
        frame.setSize(400 , 300);


        frame.add(loginLabel , new GridBagConstraints(0, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2 ), 0 ,0));
        frame.add(loginTextField , new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2 ), 0 ,0));
        frame.add(passwordLabel , new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2 ), 0 ,0));
        frame.add(passwordPasswordField , new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2 ), 0 ,0));
        frame.add(buttonLogin , new GridBagConstraints(0, 3, 2, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(2, 2, 2, 2 ), 0 ,0));

        frame.setVisible(true);
        frame.pack();

        AutorizationEngine autoEng = new AutorizationEngine(this);

        buttonLogin.addActionListener(autoEng);
    }



}
