package gui;

import ui.User;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormRegistro {

    // ATRIBUTOS

     // FRAME

    private JFrame frameTwo;
    private FormMenu mV;
    ArrayList<User> users;

    // COMPONENTES

    private JPanel panelTwo;

    private JComboBox comboTi;

    private JTextField txtIde;
    private JTextField txtPn;
    private JTextField txtSn;
    private JTextField txtPa;
    private JTextField txtSa;
    private JPasswordField passwordC;
    private JTextField txtCorreo;
    private JTextField txtTelefono;

    private JButton crearUsuarioButton;
    private JButton cargarFotoButton;

    // CONSTRUCTOR FRAME

    public FormRegistro (ArrayList<User> users, FormMenu V) {

        this.users = users;
        frameTwo = new JFrame();
        mV = V;

        // ACTION LISTENERS

        crearUsuarioButton.addActionListener(new ActionListener() {

            String tIt = comboTi.getSelectedItem().toString();
            String nIt = txtIde.getText();
            String pNt = txtPn.getText();
            String sNt = txtSn.getText();
            String pAt = txtPa.getText();
            String sAt = txtSa.getText();
            String contraseña = new String(passwordC.getPassword());
            String ct = txtCorreo.getText();
            String tt = txtTelefono.getText();

            @Override
            public void actionPerformed(ActionEvent e) {

                User usuario = new User(mV.generateId(), txtPn);

                users.add(usuario);



            }
        });


        cargarFotoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
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
