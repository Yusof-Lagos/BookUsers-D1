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

            @Override
            public void actionPerformed(ActionEvent e) {

                // VARIABLES PARA RECIBIR

                String tIt = comboTi.getSelectedItem().toString();
                String nIt = txtIde.getText();
                String pNt = txtPn.getText().trim();
                String sNt = txtSn.getText().trim();
                String pAt = txtPa.getText().trim();
                String sAt = txtSa.getText().trim();
                String contraseña = new String(passwordC.getPassword());
                String ct = txtCorreo.getText();
                String tt = txtTelefono.getText();

                // REVISA NOMBRE Y APELLIDO

                if (pAt.matches("\\d+") || pNt.matches("\\d+") || sNt.matches("\\d+") || sAt.matches("\\d+")) {

                    JOptionPane.showMessageDialog( null, "Invalido numeros en nombres");

                } else if (pAt.isEmpty() && pNt.isEmpty()) {

                    JOptionPane.showMessageDialog( null, "Primer apellido y nombre son obligatorios");

                } else if (pAt.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "El primer apellido es obligatorio");

                } else if (pNt.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "El primer nombre es obligatorio");

                }

                // REVISA CORREO

                if (ct.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "El Correo es obligatorio");

                } else if (!ct.contains("@")) {

                    JOptionPane.showMessageDialog(null, "Correo sin arroba invalido");

                }

                // REVISA TELEFONO

                if (!tt.isEmpty() && !tt.matches("\\d+")) {

                    JOptionPane.showMessageDialog(null, "Telefono solo puede contener numeros");

                } else if (tt.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "El telefono es obligatorio");

                }

                // REVISA CONTRASEÑA

                if (contraseña.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "La contraseña es obligatoria");

                }

                // REVISA NUMERO DOCUMENTO

                if (tIt.contains("41 - Pasaporte") || (tIt.contains("42 - Documento de Identificacion Extranjero"))) {

                    if (nIt.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "Identificacion es obligatorio");

                    }

                } else if (!nIt.isEmpty() && !nIt.matches("\\d+")) {

                    JOptionPane.showMessageDialog(null, "Identificacion solo puede contener numeros");

                } else if (nIt.isEmpty()) {

                    JOptionPane.showMessageDialog(null, "Identificacion es obligatorio");

                }



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
