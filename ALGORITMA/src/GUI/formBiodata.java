package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class formBiodata {
    private JTextField textnama;
    private JTextField textnim;
    private JButton periksabutton;
    private JButton keluarbutton;
    private JPanel RootPanel;
    private JLabel Hasil;
    private JLabel Hasil2;
    private JLabel Hasil3;
    private JLabel Hasil4;
    private JLabel Hasil5;
    private JLabel Hasil6;
    private JLabel Hasil7;
    private JLabel Hasil8;
    private JLabel labelHasil;

    public formBiodata(Mahasiswa mhs) {
        periksabutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Nama = textnama.getText();
                String NIM = textnim.getText();

                Mahasiswa mhs = new Mahasiswa();

                mhs.setnama(Nama);
                mhs.setnim(NIM);

                Hasil.setText("Nama :" + mhs.getnama());
                Hasil2.setText("NIM :" + mhs.getnim());
                Hasil3.setText("Jenjang Pendidikan :" + mhs.getJenjangPendidikan());
                Hasil4.setText("Tahun Masuk : " + mhs.getTahunMasuk());
                Hasil5.setText("Fakultas : " + mhs.getFakultas());
                Hasil6.setText("Jurusan : " + mhs.getJurusan());
                Hasil7.setText("Jenis Kelamin : " + mhs.getJenisKelamin());
                Hasil8.setText("Nomor Urut Mahasiswa : " + mhs.getNomorUrutMHS());

                labelHasil.setText(mhs.toString());

            }
        });
        keluarbutton.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        periksabutton.addActionListener( new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        } );
    }

    public formBiodata() {

        periksabutton.addActionListener( new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        } );
    }

    public JPanel getRootPanel() {
        return RootPanel;
    }
}