package YouTube;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.BoxView;
import javax.swing.text.LayoutQueue;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class YouTube extends JFrame {
    Perpustakaan perpus = new Perpustakaan();
    public YouTube(String s) {

        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 400, 500);
        panel1.setLayout(new CardLayout());
        //======================= PANEL 1 ===============================
        ImageIcon img = new ImageIcon("F:\\IdeaProjects\\kehidupanAfterKematian\\src\\YouTube\\mosque.png");
        JLabel labelgmbr = new JLabel(img, JLabel.CENTER);
        labelgmbr.setSize(350, 450);
        panel1.add(labelgmbr);
        //======================= PANEL 1 =====================================================

        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 0, 400, 550);
        panel2.setLayout(new BorderLayout());


        // ******************* PANEL 2 ***************************************************8
        //1.Judul
        JLabel lbl = new JLabel("Library App");
        lbl.setBounds(125,30,150, 25);
        lbl.setFont(new Font("Comic Sans MS", Font.BOLD, 24));
        panel2.add(lbl);
        //2.Kode
        JLabel code = new JLabel("Code");
        code.setBounds(20,80,150,25);
        panel2.add(code);

        JTextField txtCode = new JTextField();
        txtCode.setBounds(150, 80, 150, 25);
        panel2.add(txtCode);
        //3.Nama
        JLabel lblNama = new JLabel("Book Name");
        lblNama.setBounds(20, 110, 150,25);
        panel2.add(lblNama);

        JTextField txtNama = new JTextField();
        txtNama.setEditable(false);
        txtNama.setBounds(150, 110, 150, 25);
        panel2.add(txtNama);
        //4.Member
        JLabel lblMember = new JLabel("Membership");
        lblMember.setBounds(20, 140, 150, 25);
        panel2.add(lblMember);

        JRadioButton x = new JRadioButton("Personal");
        x.setBounds(150, 140, 70, 25);
        panel2.add(x);

        JRadioButton y = new JRadioButton("School");
        y.setBounds(225, 140, 75, 25);
        panel2.add(y);

        ButtonGroup group = new ButtonGroup();
        group.add(x);
        group.add(y);
        //5.Biaya
        JLabel biaya = new JLabel("Biaya Per Hari");
        biaya.setBounds(20, 170, 150, 25);
        panel2.add(biaya);

        JTextField textBiaya = new JTextField();
        textBiaya.setBounds(150, 170, 150, 25);
        textBiaya.setEditable(false);
        panel2.add(textBiaya);
        //6.Tgl Pinjam
        JLabel lblPinjam = new JLabel("Tanggal Pinjam");
        lblPinjam.setBounds(20, 200, 150, 25);
        panel2.add(lblPinjam);

        String hari[] = new String[31];
        for(int i = 0; i < hari.length; i++) {
            hari[i] = Integer.toString(i+1);
        }
        JComboBox cbHari = new JComboBox(hari);
        cbHari.setBounds(150, 200,40,25);
        panel2.add(cbHari);

        String bulan[] = {"Jan", "Feb", "Mar", "Apr", "Mei", "Jun", "Jul", "August", "Sep", "Oct", "Nov", "Des"};
        JComboBox cbBulan = new JComboBox(bulan);
        cbBulan.setBounds(200, 200, 55, 25);
        panel2.add(cbBulan);

        JTextField cbThn = new JTextField();
        cbThn.setBounds(265, 200, 35, 25);
        panel2.add(cbThn);
        //7.Lama Pinjam
        JLabel lblLama = new JLabel("Lama Pinjam");
        lblLama.setBounds(20, 230, 150, 25);
        panel2.add(lblLama);

        String[] lamaPinjam = {"1", "2", "3", "4", "5", "6", "7"};
        JComboBox cbLama = new JComboBox(lamaPinjam);
        cbLama.setBounds(150,230, 70, 25);
        panel2.add(cbLama);
        //8.Total
        JLabel total = new JLabel("Total");
        total.setBounds(20, 260, 150, 25);
        panel2.add(total);

        JTextField txtTotal = new JTextField();
        txtTotal.setBounds(150, 260, 150, 25);
        txtTotal.setEditable(false);
        panel2.add(txtTotal);
        //9.Bayar
        JLabel bayar = new JLabel("Bayar");
        bayar.setBounds(20, 290, 150, 25);
        panel2.add(bayar);

        JTextField txtBayar = new JTextField();
        txtBayar.setBounds(150, 290, 150, 25);
        panel2.add(txtBayar);
        //10.Kembalian
        JLabel kembalian = new JLabel("Kembalian");
        kembalian.setBounds(20, 320, 150, 25);
        panel2.add(kembalian);

        JTextField txtKembalian = new JTextField();
        txtKembalian.setBounds(150, 320, 150, 25);
        txtKembalian.setEditable(false);
        panel2.add(txtKembalian);
        //11.Button
        JButton btnSimpan = new JButton("Save");
        btnSimpan.setBounds(150, 360, 70, 25);
        panel2.add(btnSimpan);

        // +++++++++++++++++++ PANEL 2 +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        JPanel panel3 = new JPanel();
        panel3.setBounds(0,0,400,550);
        panel3.setLayout(new GridLayout());

        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< PANEL 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        JList<String> data = new JList<String>();
        panel3.add(data);
        //<<<<<<<<<<<<<<<<<<<<<<<<<<<<< PANEL 3 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        txtCode.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    perpus.setCode(txtCode.getText().toLowerCase());
                    txtNama.setText(perpus.getName());
                    if(perpus.getName() == "") {
                        JOptionPane.showMessageDialog(null, "Kode Tidak Ditemukan");
                        txtCode.setText("");
                        txtNama.setText("");
                    } else {
                        txtNama.setText(perpus.getName());
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        btnSimpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(group.getSelection().toString());
                textBiaya.setText(Integer.toString(perpus.getBiaya()));
                perpus.setTanggal(cbHari.getSelectedItem().toString(), cbBulan.getSelectedItem().toString(), cbThn.getText());
                perpus.setLamaPinjam(Integer.parseInt(cbLama.getSelectedItem().toString()));
                txtTotal.setText(Integer.toString(perpus.getTotal()));
                perpus.setBayar(Integer.parseInt(txtBayar.getText()));
                txtKembalian.setText(String.valueOf(perpus.getKembalian()));
            }
        });






        JTabbedPane tab = new JTabbedPane();
        tab.setBounds(0,0, 400,  550);
        tab.addTab("Home", panel1);
        tab.addTab("Menu", panel2);
        tab.addTab("Main", panel3);

        this.setTitle(s);
        this.getContentPane().add(tab);
        this.pack();
    }
    public static void main(String[] args) {
        JFrame form = new YouTube("Library App");
        form.setSize(400,550);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setVisible(true);
    }
}


/*GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(code)
                        .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                .addGap(175,175,175)
                        .addComponent(txtCode)
                .addContainerGap(174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                .addGap(29,29,29)
                        .addComponent(lblNama)
                        .addGap(18,18,18)
                .addComponent(lblMember, GroupLayout.PREFERRED_SIZE, 154, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );*/