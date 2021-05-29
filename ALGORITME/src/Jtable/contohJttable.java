package Jtable;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class contohJtable {
    private JTextField textangka;
    private JButton buttonsort;
    private JTable tablehasil;
    private JPanel Jttable;
    private JTextField textangka2;
    private JLabel masukkanAngkaLabel;
    private DefaultTableModel tableModel;
    private boolean added = false;

    public JPanel getPanel1() {
        return Jttable;
    }

    public contohJtable() {
        this.initComponents();
        buttonsort.addActionListener( new ActionListener() {
            private Component rootPanel;

            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultTableModel model = (DefaultTableModel) tablehasil.getModel();

                int jumlah = Integer.parseInt( textangka.getText() );
                String angka = textangka2.getText();
                String[] pnj = angka.split( "," );

                if (textangka.getText().length() > 3) {
                    JOptionPane.showMessageDialog( rootPanel,
                            "Data yang diinput berlebih",
                            "Warning!!!",
                            JOptionPane.WARNING_MESSAGE );

                    return;
                }
                if (!added) {
                    for (int i = 0; i < jumlah; i++) {
                        model.addRow( new Object[]{} );
                    }
                    added = true;
                }
                int a = 0;
                for (int i : sorting.getascen( angka, jumlah )) {
                    model.setValueAt( i, a, 0 );
                    a++;
                }
                int b = 0;
                for (int i : sorting.getdescen( angka, jumlah )) {
                    model.setValueAt( i, b, 1 );
                    b++;
                }
            }
        } );
        buttonsort.addActionListener( new ActionListener() {
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



    private void contohJtabletable() {
    }

    private void initComponents() {
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}