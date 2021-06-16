package JFraem;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Frame1 extends JFrame {
    private JPanel panel1;
    private JTextField tNilai2;
    private JTextField tHasil;
    private JTextField tNilai1;

    private void nilkeyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER) {
            int x = Integer.parseInt(tNilai1.getText());
            int y = Integer.parseInt(tNilai2.getText());
            int z = x * y;
            tHasil.setText(Integer.toString(z));
        }
    }

    public Frame1() {
        this.setContentPane(panel1);
        this.setTitle("Free Palestine");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        tNilai2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                nilkeyPressed(e);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Frame1();
        frame.setSize(500, 400);
        frame.setVisible(true);
    }

}
