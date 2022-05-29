package cat.institutmvm.maths.ui;

import cat.institutmvm.application.utils.MyPanel;

import javax.swing.*;


public class Application {
    public static void main (String[] args) {
        JFrame frame = new JFrame ("PROSHARSKS Inc.");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new MyPanel());
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
