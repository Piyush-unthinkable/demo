package com.example.demo;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.sql.Array;
import java.util.ArrayList;

public class OrderBlock {

    private JPanel jPanel, jPanel2, jPanel3;
    private JFrame jFrame;
    private JLabel jLabel, jLabel2, jLabel3, jLabel4, jlabel5;

    private JScrollPane jScrollPane;
    OrderBlock() {
        jFrame = new JFrame();
        jPanel = new JPanel();
        jLabel = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jPanel2 = new JPanel();
        jScrollPane = new JScrollPane();


        jLabel.setText("#342");
        jLabel.setForeground(Color.WHITE);
        jLabel.setBounds(32, 5, 60, 50);

        jLabel2.setText("0/2");
        jLabel2.setForeground(Color.WHITE);
        jLabel2.setBounds(112, 5, 60, 50);

        jLabel3.setText("02:30:02 PM");
        jLabel3.setForeground(Color.WHITE);
        jLabel3.setBounds(200, 10, 100, 20);

        jLabel4.setText("Sam Thopes");
        jLabel4.setForeground(Color.WHITE);
        jLabel4.setBounds(200, 30, 100, 20);


        jPanel.setPreferredSize(new Dimension(300, 100));
        jPanel.setBounds(10, 15, 300, 70);
        jPanel.setLayout(null);
        jPanel.setBackground(Color.BLACK);
        jPanel.add(jLabel);
        jPanel.add(jLabel2);
        jPanel.add(jLabel3);
        jPanel.add(jLabel4);


        jPanel2.setPreferredSize(new Dimension(300, 200));
        jPanel2.setBounds(10, 85, 300, 200);
        jPanel2.setLayout(new FlowLayout());
        jPanel2.setVisible(true);
        jPanel2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jPanel2.add(jScrollPane);

        String objects[] = {"Burger", "FrenchFries", "Patties","Crispy Potato"};

        for (String obj : objects) {
            JPanel panel = new JPanel(new FlowLayout());
            JLabel jLabel1 = new JLabel(obj);
            jLabel1.setPreferredSize(new Dimension(145,20));
            panel.add(jLabel1);
            JButton jButton = new JButton("Done");
            panel.add(jButton);
            jPanel2.add(panel);
        }



        jFrame.setSize(new Dimension(500, 950));
        jFrame.setLayout(null);
        jFrame.setBackground(Color.BLUE);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.add(jPanel);
        jFrame.add(jPanel2);
        jPanel3 = new JPanel();
        jPanel3.setSize(40,25);
        jPanel3.setBounds(10,285,300,30);
        JButton jButton = new JButton("Done");
        jPanel3.add(jButton);
        jPanel2.add(jPanel3);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        new OrderBlock();
    }
}