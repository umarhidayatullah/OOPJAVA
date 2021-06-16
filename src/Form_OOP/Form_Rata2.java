package Form_OOP;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Rata2 extends JFrame {
    private JPanel panel1;
    private JTextField tNilai1;
    private JTextField tNilai2;
    private JTextField tRata;
    private JButton bTutup;
    private JButton bBersih;
    private JButton bHitung;
    Ratarata rata = new Ratarata();

    public Form_Rata2() {
        nonAktif();
        this.setContentPane(panel1);
        this.pack();
        bHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rata.setNilai1(Double.parseDouble(tNilai1.getText()));
                rata.setNilai2(Double.parseDouble(tNilai2.getText()));
                tRata.setText(Double.toString(rata.getNilaiRata()));
            }
        });
        bBersih.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Bersih();
                Aktif();
                tNilai1.requestFocus();
            }
        });
        bTutup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int tutup;
                tutup = JOptionPane.showConfirmDialog(null, "Yakin tutup program?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (tutup == JOptionPane.YES_OPTION) {
                    dispose();
                } else {
                    return;
                }
            }
        });
    }

    void Bersih() {
        tNilai1.setText("");
        tNilai2.setText("");
        tRata.setText("");
    }

    void Aktif() {
        tNilai1.setEnabled(true);
        tNilai2.setEnabled(true);
        tRata.setEnabled(true);
    }

    void nonAktif() {
        tNilai1.setEnabled(false);
        tNilai2.setEnabled(false);
        tRata.setEnabled(false);
    }

    public static void main(String[] args) {
        JFrame frame = new Form_Rata2();
        frame.setVisible(true);
        frame.setTitle("Menghitung Hari");
        frame.setSize(560, 470);
    }
}
