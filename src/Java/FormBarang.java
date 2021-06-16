package Java;

import javax.swing.*;
import javax.swing.event.PopupMenuListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FormBarang extends JFrame {
    Barang brng = new Barang();
    private JTextField tnama;
    private JComboBox comboBox1;
    private JTextField tharga;
    private JTextField tjml;
    private JButton BERSIHButton;
    private JButton KELUARButton;
    private JTextField tttl;
    private JTextField tuByr;
    private JTextField tuKmbl;
    private JPanel tPanel;

    public FormBarang() {
        this.setContentPane(tPanel);
        this.pack();
        comboBox1.addItem("PILIH");
        comboBox1.addItem("B001");
        comboBox1.addItem("B002");
        comboBox1.addItem("B003");
        comboBox1.addItem("B004");
        tnama.setEnabled(false);
        tharga.setEnabled(false);
        tttl.setEnabled(false);
        tuKmbl.setEnabled(false);
        bersih();

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                brng.setKd(comboBox1.getSelectedItem().toString());
                brng.setSeleksiKd();
                tnama.setText(brng.getNm());
                tharga.setText(Double.toString(brng.getHrg()));
                tjml.requestFocus();
            }
        });

        tjml.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    brng.setJml(Integer.parseInt(tjml.getText()));
                    tttl.setText(Double.toString(brng.getTtl()));
                    tuByr.grabFocus();
                }
            }
        });


        tuByr.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    brng.setUb(Double.parseDouble(tuByr.getText()));
                    if (brng.getUb() < brng.getTtl()) {
                        JOptionPane.showMessageDialog(null, "Uang anda kurang!", "Warning!!", JOptionPane.OK_OPTION);
                        tuByr.setText("");
                    }
                    tuKmbl.setText(Double.toString(brng.getUk()));
                } else {
                    return;
                }
            }
        });
        BERSIHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aktif();
                bersih();
            }
        });
        KELUARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = JOptionPane.showConfirmDialog(null, "Yakin mau pulang?", "Keluar", JOptionPane.YES_NO_OPTION);
                if(x == JOptionPane.YES_NO_OPTION) {
                    dispose();
                }else {
                    return;
                }
            }
        });
    }

    void aktif() {
        comboBox1.setEnabled(true);
        tjml.setEnabled(true);
        tuByr.setEnabled(true);
    }
    void bersih() {
        comboBox1.setSelectedItem("PILIH");
        tnama.setText("");
        tharga.setText("");
        tuByr.setText("");
        tttl.setText("");
        tuKmbl.setText("");
        tjml.setText("");
    }
    public static void main(String[] args) {
        JFrame frame = new FormBarang();
        frame.setVisible(true);
        frame.setSize(800, 500);
        frame.setTitle("TOSERBA JAVA");
    }
}
