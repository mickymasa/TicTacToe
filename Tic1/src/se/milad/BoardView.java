package se.milad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by MILAD - Kate on 2016-01-13.
 */
public class BoardView extends JFrame {
    JFrame jfMain;
    JPanel mainPanel, statusPanel, topPanel;
    JButton oneButton, twoButton, threeButton, fourButton, fiveButton, sixButton, sevenButton, eightButton, nineButton;

    public BoardView() {
        setUpView();
    }

    public void setUpView() {
        //--------------------------------------------JFrame
        jfMain = new JFrame("TicTacToe-Milad/Kate");
        jfMain.setVisible(true);
        jfMain.setLayout(null);
        jfMain.setSize(470, 600);
        jfMain.setLocationRelativeTo(null);
        jfMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //--------------------------------------------JPanel


        topPanel = new JPanel();
        topPanel.setVisible(true);
        topPanel.setBounds(0, 0, 500, 50);
        topPanel.setBackground(Color.magenta);

        statusPanel = new JPanel();
        statusPanel.setVisible(true);
        statusPanel.setBounds(0, 510, 500, 50);
        statusPanel.setBackground(Color.magenta);

        mainPanel = new JPanel();
        mainPanel.setBackground(Color.cyan);
        mainPanel.setVisible(true);
        mainPanel.setBounds(0, 50, 500, 460);
        mainPanel.setLayout(null);

        //--------------------------------------------JButton

        oneButton = new JButton("1");
        oneButton.setBounds(0, 0, 150, 150);
        twoButton = new JButton("2");
        twoButton.setBounds(150, 0, 150, 150);
        threeButton = new JButton("3");
        threeButton.setBounds(300, 0, 150, 150);
        fourButton = new JButton("4");
        fourButton.setBounds(0, 150, 150, 150);
        fiveButton = new JButton("5");
        fiveButton.setBounds(150, 150, 150, 150);
        sixButton = new JButton("6");
        sixButton.setBounds(300, 150, 150, 150);
        sevenButton = new JButton("7");
        sevenButton.setBounds(0, 300, 150, 150);
        eightButton = new JButton("8");
        eightButton.setBounds(150, 300, 150, 150);
        nineButton = new JButton("9");
        nineButton.setBounds(300, 300, 150, 150);



        //--------------------------------------------AddItems
        jfMain.add(topPanel);
        jfMain.add(statusPanel);
        jfMain.add(mainPanel);

        mainPanel.add(oneButton);
        mainPanel.add(twoButton);
        mainPanel.add(threeButton);
        mainPanel.add(fourButton);
        mainPanel.add(fiveButton);
        mainPanel.add(sixButton);
        mainPanel.add(sevenButton);
        mainPanel.add(eightButton);
        mainPanel.add(nineButton);

        pack();



    }



}
