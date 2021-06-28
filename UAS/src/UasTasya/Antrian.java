package UasTasya;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;


public class Antrian {
    private JPanel rootPanel;
    private JTextArea textAntrian;
    private JTextField BanyakAntrian;
    private JTextField TotalAntrian;
    private JTextField PglAntrian;
    private JButton prosesAntrianButton;
    private JButton ambilNomorAntrianButton;
    private JLabel nomor1;
    private JLabel nomor2;
    private JLabel nomor3;
    private JLabel nomor4;
    private JButton keluarButton;


    Queue<Object> antrian = new LinkedList<>();
    int nomor = 0;

    public Antrian() {
        prosesAntrianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prosesAntrian();
            }
        });
        ambilNomorAntrianButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahAntrian();
            }
        });
        keluarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public void queue() {

        inisialisasi();
    }

    private void inisialisasi(){
        BanyakAntrian.setText("0");
        TotalAntrian.setText("0");
        PglAntrian.setText("-----");


        nomor1.setText("Nomor Antrian");
        nomor2.setText("--------");
        nomor3.setText("Silahkan menunggu");
        nomor4.setText("--------");
    }
    private void tambahAntrian(){
        nomor++;
        String antr = "Antrian "+nomor;
        antrian.add(antr);
        String cvt = String.valueOf(antrian.size());
        BanyakAntrian.setText(cvt);
        PglAntrian.setText(""+antrian.peek());
        TotalAntrian.setText(""+nomor);
        textAntrian.append(antr + "\n");


        nomor1.setText("Nomor Antrian");
        nomor2.setText("  " + nomor);
        nomor3.setText("Silahkan menunggu " + cvt + " Antrian Lagi ");
        nomor4.setText("Mohon untuk bersabar");
    }
    private void prosesAntrian(){
        if(antrian.isEmpty()){
            JOptionPane.showMessageDialog(null, "Ambil Nomor antrian terlebih dahulu !");
        }
        textAntrian.setText("");
        antrian.poll();
        antrian.forEach((Object element) -> {
            textAntrian.append("" + element + "\n");
        });
        if(antrian.isEmpty()){
            PglAntrian.setText("-----");
        }else{
            PglAntrian.setText(""+antrian.peek());
        }
    }

    public JPanel getRootPanel () {
        return rootPanel;
    }

}

