package com.company;

//This is to see if I can really make something work on my owen with no help.

import javax.swing.*;
import java.awt.*;


class InnerButton {

    JFrame frame;
    JButton b;

    //All this is from Exercise p. 395 from book!!
    public static void main(String[] args) {
        InnerButton gui = new innerButton();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("A");
        b.addActionListener();

        frame.getContentPane().add(BorderLayout.SOUTH, B);
        frame.setSize(200, 100);
        frame.setVisible(true);
    }

    class BListener extends ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (b.getText() .equals("A")) {
                b.setText("B");
            } else {
                b.setText("A");

            }
        }

    }
}