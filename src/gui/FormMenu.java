package gui;

import ui.User;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FormMenu {

    // ATRIBUTOS

     // FRAME

    private final JFrame frameOne;

     // BOTONES

    private JButton buttonR;
    private JButton buttonL;
    private JButton buttonC;

     // PANEL

    private JPanel panelOne;

    // CONSTRUCTOR FRAME

    public FormMenu() {

        frameOne = new JFrame();

        buttonR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FormRegistro oneV  = new FormRegistro(Users);

                oneV.setUpFrameTwo();
            }
        });
    }

    // METODOS

    public void setUpFrameOne() {

        frameOne.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frameOne.setTitle("BookUsers");
        frameOne.setContentPane(panelOne);
        frameOne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameOne.setLocationRelativeTo(null);
        frameOne.setVisible(true);

    }

    // ID

    private int IDC = 1;

    public int generateId (){

        return IDC++;

    }

    // ARRAYLIST

    ArrayList<User> Users = new ArrayList<>();

    // EVENTOS

    public static void main(String[] args) {

        FormMenu V = new FormMenu();
        V.setUpFrameOne();
    }

}





