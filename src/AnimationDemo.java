import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class AnimationDemo extends JPanel implements ActionListener {
        private int x = 0; // Starting x position
        private Timer timer;

        public AnimationDemo() {
            timer = new Timer(10, this); // delay = 10ms
            timer.start();
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            g.fillOval(x, 100, 50, 50); // Draw a red circle
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            x += 1;  // Move circle right
            if (x > getWidth()) {
                x = -50; // Reset if it goes off screen
            }
            repaint(); // Triggers paintComponent again
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("Java Animation");
            AnimationDemo panel = new AnimationDemo();
            frame.add(panel);
            frame.setSize(600, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }


