import javax.swing.*;
import java.awt.*;

public class SwingPaintDemo1 {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+
                SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(650,650);
        f.add(new MyPanel1());
        f.pack();
        f.setVisible(true);
    }
}

class MyPanel1 extends JPanel {

    public MyPanel1() {
        setBorder(BorderFactory.createLineBorder(Color.green));
    }

    public Dimension getPreferredSize() {
        return new Dimension(650,600);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw Text
        g.drawString("This is my custom Panel!",100,200);
        g.drawString("This is my custom Panel!",150,100);
    }
}
