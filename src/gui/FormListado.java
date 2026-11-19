package gui;

import ui.User;

import javax.swing.*;
import java.util.ArrayList;

public class FormListado {

    // ATRIBUTOS

    // FRAME

    private JFrame frameThree;
    ArrayList<User> users;
    private JButton button1;
    private JPanel panelThree;

    // CONSTRUCTOR FRAME

    public FormListado (ArrayList<User> users) {

        this.users = users;
        frameThree = new JFrame();

    }

    // METODOS

    public void setUpFrameThree() {

        frameThree.setSize(700,500);
        frameThree.setTitle("FormListado");
        frameThree.setContentPane(panelThree);
        frameThree.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameThree.setLocationRelativeTo(null);
        frameThree.setVisible(true);

    }
}
