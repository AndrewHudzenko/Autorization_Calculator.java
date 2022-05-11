























package com.MyCalculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {
    JFrame frame = new JFrame("Calculator");
    JPanel windowContent = new JPanel();
    JPanel upperPanel = new JPanel();
    JPanel firstPanel = new JPanel();
    JPanel secondPanel = new JPanel();

    //Buttons and textField for firstPanel
    JTextField inputText = new JTextField(20);
    JButton buttonClear = new JButton("Clear");
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");

    //Buttons for secondPanel
    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMultiply = new JButton("*");
    JButton buttonDivide = new JButton("/");
    JButton buttonSin = new JButton("sin");
    JButton buttonCos = new JButton("cos");
    JButton buttonTg = new JButton("tg");
    JButton buttonCtg = new JButton("ctg");


    Calculator () {
        inputText.setHorizontalAlignment(SwingConstants.RIGHT);
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);



        GridBagLayout gblUp = new GridBagLayout();
        upperPanel.setLayout(gblUp);

        upperPanel.add(inputText , new GridBagConstraints(0, 0, 1, 1, 2, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 0 ), 0 ,0));

        upperPanel.add(buttonClear , new GridBagConstraints(1, 0, 1, 1, 1, 1,
                GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
                new Insets(0, 0, 10, 0 ), 0 ,0));

        windowContent.add("North" , upperPanel);

        GridLayout gl1 = new GridLayout(4 , 3);
        firstPanel.setLayout(gl1);
        firstPanel.add(button1);
        firstPanel.add(button2);
        firstPanel.add(button3);
        firstPanel.add(button4);
        firstPanel.add(button5);
        firstPanel.add(button6);
        firstPanel.add(button7);
        firstPanel.add(button8);
        firstPanel.add(button9);
        firstPanel.add(button0);
        firstPanel.add(buttonPoint);
        firstPanel.add(buttonEqual);
        windowContent.add("Center" , firstPanel);

        GridLayout gl2 = new GridLayout(4 , 2);
        secondPanel.setLayout(gl2);
        secondPanel.add(buttonPlus);
        secondPanel.add(buttonSin);
        secondPanel.add(buttonMinus);
        secondPanel.add(buttonCos);
        secondPanel.add(buttonMultiply);
        secondPanel.add(buttonTg);
        secondPanel.add(buttonDivide);
        secondPanel.add(buttonCtg);


        windowContent.add("East" , secondPanel);

        frame.setContentPane(windowContent);
        frame.pack();
        frame.setVisible(true);

        CalculatorEngine calcEng = new CalculatorEngine(this);

        button0.addActionListener(calcEng);
        button1.addActionListener(calcEng);
        button2.addActionListener(calcEng);
        button3.addActionListener(calcEng);
        button4.addActionListener(calcEng);
        button5.addActionListener(calcEng);
        button6.addActionListener(calcEng);
        button7.addActionListener(calcEng);
        button8.addActionListener(calcEng);
        button9.addActionListener(calcEng);

        buttonPoint.addActionListener(calcEng);
        buttonEqual.addActionListener(calcEng);
        buttonPlus.addActionListener(calcEng);
        buttonMinus.addActionListener(calcEng);
        buttonDivide.addActionListener(calcEng);
        buttonMultiply.addActionListener(calcEng);
        buttonSin.addActionListener(calcEng);
        buttonCos.addActionListener(calcEng);
        buttonTg.addActionListener(calcEng);
        buttonCtg.addActionListener(calcEng);
        buttonClear.addActionListener(calcEng);

    }
}