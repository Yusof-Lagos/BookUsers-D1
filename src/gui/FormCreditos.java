package gui;

import ui.User;

import javax.swing.*;
import java.util.ArrayList;

public class FormCreditos {

    // ATRIBUTOS

    // FRAME

    private JFrame frameFour;
    private JButton button1;
    private JPanel panelFour;

    // CONSTRUCTOR FRAME

    public FormCreditos () {

        frameFour = new JFrame();

    }

    // METODOS

    public void setUpFrameFour() {

        frameFour.setSize(700,500);
        frameFour.setTitle("CREDITOS");
        frameFour.setContentPane(panelFour);
        frameFour.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameFour.setLocationRelativeTo(null);
        frameFour.setVisible(true);

    }
}
