package GUI;

import javax.swing.*;

public class RunformBiodata  {
    public static void main(String[] args, Mahasiswa mhs) {
        JFrame jFram = new JFrame("formBiodata");

        jFram.setContentPane(new formBiodata().getRootPanel());
        jFram.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFram.setLocationRelativeTo(null);
        jFram.setSize(500,400);
        jFram.setVisible(true);



    }
}
