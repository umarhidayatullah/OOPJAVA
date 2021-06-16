package Zakat;

import javax.swing.*;

public class Zakat extends JFrame {
    private JEditorPane SYARATWAJIBZAKAT1EditorPane;
    private JTabbedPane tabbedPane;
    private JPanel home;
    private JPanel main;
    private JTextField textField1;

    public Zakat() {

        this.add(tabbedPane);
        tabbedPane.getUI();
        this.pack();

    }

    public static void main (String[] args) {
        JFrame frame = new Zakat();
        frame.setTitle("Zakat Fitrah");
        frame.setSize(400,550);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
