package gui;

import javax.swing.*;

public class FrameApp {

    // ATRIBUTOS

     // FRAME

    private final JFrame frame;
    private final int width;
    private final int height;

     // BOTONES

    private final JButton rUsers;
    private final JButton lUsers;
    private final JButton credits;

    // CONSTRUCTOR FRAME

    public FrameApp(int w, int h) {

        frame = new JFrame();
        rUsers = new JButton();
        lUsers = new JButton();
        credits = new JButton();
        width = w;
        height = h;

    }

    // METODOS

    public void setUpFrame() {

        frame.setSize(width, height);
        frame.setTitle("YUSOF APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.add(rUsers);
        frame.add(lUsers);
        frame.add(credits);

    }

    // EVENTOS



}
