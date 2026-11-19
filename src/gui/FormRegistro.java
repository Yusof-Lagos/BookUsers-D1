package gui;

import ui.User;
import javax.swing.*;
import java.util.ArrayList;

public class FormRegistro {

    // ATRIBUTOS

     // FRAME

    private JFrame frameTwo;
    ArrayList<User> users;
    private JPanel panelTwo;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JPasswordField passwordField1;
    private JTextField textField6;
    private JTextField textField7;
    private JButton crearUsuarioButton;
    private JButton cargarFotoButton;

    // COMPONENTES



    // CONSTRUCTOR FRAME

    public FormRegistro (ArrayList<User> users) {

        this.users = users;
        frameTwo = new JFrame();

    }

    // METODOS

    public void setUpFrameTwo() {

        frameTwo.setSize(700,600);
        frameTwo.setTitle("FormRegistro");
        frameTwo.setContentPane(panelTwo);
        frameTwo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameTwo.setLocationRelativeTo(null);
        frameTwo.setVisible(true);

    }
}
