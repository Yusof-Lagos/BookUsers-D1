package gui;

import ui.User;
import javax.swing.*;
import java.util.ArrayList;

public class FormRegistro {

    // ATRIBUTOS

     // FRAME

    private JFrame frameTwo;
    ArrayList<User> users;
    private JButton button1;
    private JPanel panelTwo;

    // CONSTRUCTOR FRAME

    public FormRegistro (ArrayList<User> users) {

        this.users = users;
        frameTwo = new JFrame();

    }

    // METODOS

    public void setUpFrameTwo() {

        frameTwo.setSize(700,500);
        frameTwo.setTitle("FormRegistro");
        frameTwo.setContentPane(panelTwo);
        frameTwo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameTwo.setLocationRelativeTo(null);
        frameTwo.setVisible(true);

    }
}
