package gui;

import ui.User;

import javax.swing.*;
import java.util.ArrayList;

public class FormListado {

    // ATRIBUTOS

    private ArrayList<User> users;
    private DefaultListModel<User> modelo;

    // FRAME

    private JFrame frameThree;
    private JPanel panelThree;
    private JList usuarioL;

    private JButton detallesButton;
    private JButton editarButton;
    private JButton eliminarButton;

    // CONSTRUCTOR FRAME

    public FormListado (ArrayList<User> users) {

        this.users = users;
        frameThree = new JFrame();

        modelo = new DefaultListModel<>();
        usuarioL.setModel(modelo);

    }

    // METODOS

    public void setUpFrameThree() {

        frameThree.setSize(500,600);
        frameThree.setTitle("FormListado");
        frameThree.setContentPane(panelThree);
        frameThree.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameThree.setLocationRelativeTo(null);
        frameThree.setVisible(true);

    }

    public void usuarioNuevo (){

        modelo.clear();

        for (User u : users) {

            modelo.addElement(u);

        }

    }

}
