package gui;

import javax.swing.*;

public class FrameApp {

    // ATRIBUTOS

     // FRAME

    private final JFrame frame;
    private final int width;
    private final int height;

    // CONSTRUCTOR FRAME

    public FrameApp(int w, int h) {

        frame = new JFrame();
      //
        //
        //
        width = w;
        height = h;

    }

    // METODOS

    public void setUpFrame() {

        frame.setSize(width, height);
        frame.setTitle("YUSOF APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    // ID

    private int IDC = 1;

    public int generateId (){
        return IDC++;
    }

    // EVENTOS

}





