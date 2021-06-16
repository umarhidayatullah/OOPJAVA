package Binus;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.event.*;

public class Bina extends JFrame {
    Rumah rmh = new Rumah();
    private JTextPane label1, label2, label3, label4, label5, label7;
    private JTextArea label6;
    private JComboBox comboBox;
    private JTextField tvHargaDasar;
    private JCheckBox joggingTrackCheckBox;
    private JCheckBox swimmingPoolCheckBox;
    private JCheckBox gymnasiumCheckBox;
    private JRadioButton bca;
    private JRadioButton mandiri;
    private JTextField tvJog;
    private JTextField tvSwim;
    private JTextField tvGym;
    private JTextField tvMandiri;
    private JTextField tvBca;
    private JTextField tvTotal;
    private JButton KELUARButton;
    private JButton HITUNGButton;
    private JButton BERSIHButton;
    private JPanel panel;
    private ButtonGroup buttonGroup1;

    public Bina() {
        frameInit();
        this.setContentPane(panel);
        this.pack();
        this.setSize(500,500);
        this.setTitle("TAM For President 2024");
        comboBox.addItem("**SILAHKAN DIPILIH**");
        comboBox.addItem("KEBAYORAN");
        comboBox.addItem("KEMAYORAN");
        comboBox.addItem("KETAPANG");
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rmh.setLokasi(comboBox.getSelectedItem().toString());
                rmh.setSeleksiLok();
                tvHargaDasar.setText(Double.toString(rmh.getHrg()));
            }
        });
        BERSIHButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox.setSelectedItem("**SILAHKAN DIPILIH**");
                joggingTrackCheckBox.setSelected(false);
                swimmingPoolCheckBox.setSelected(false);
                gymnasiumCheckBox.setSelected(false);
                buttonGroup1.clearSelection();
                tvHargaDasar.setText("");
                tvJog.setText(" ");
                tvSwim.setText(" ");
                tvGym.setText(" ");
                tvBca.setText(" ");
                tvMandiri.setText(" ");
                tvTotal.setText(" ");
            }
        });
        joggingTrackCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(joggingTrackCheckBox.isSelected()){
                    rmh.setJog(joggingTrackCheckBox.getText());
                    tvJog.setText(Double.toString(rmh.getJog()));
                } else {
                    rmh.setJog("c");
                }
            }
        });
        swimmingPoolCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(swimmingPoolCheckBox.isSelected()) {
                    rmh.setSwim(swimmingPoolCheckBox.getText());
                    tvSwim.setText(Double.toString(rmh.getSwim()));
                } else {
                    rmh.setSwim("h");
                }

            }
        });
        gymnasiumCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(gymnasiumCheckBox.isSelected()) {
                    rmh.setGym(gymnasiumCheckBox.getText());
                    tvGym.setText(Double.toString(rmh.getGym()));
                } else {
                    rmh.setGym("i");
                }
            }
        });
        bca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(bca.isSelected()) {
                    rmh.setCara(bca.getText());
                    rmh.setSeleksiCara();
                    tvBca.setText(Double.toString(rmh.getbiaya()));
                }
            }
        });
        mandiri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(mandiri.isSelected()) {
                    rmh.setCara(mandiri.getText());
                    rmh.setSeleksiCara();
                    tvMandiri.setText(Double.toString(rmh.getbiaya()));
                }
            }
        });
    }
    public static void main (String[] args) {
        JFrame bina = new Bina();
        bina.setVisible(true);
    }
}
