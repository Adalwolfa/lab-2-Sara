package lab2;

import javax.swing.*;
import java.awt.*;

public class ProgrammingProject_2_42
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(90,100);
        frame.setTitle("Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        IntersectionDrawer component = new IntersectionDrawer();
        frame.add(component);

        frame.setVisible(true);

    }
    public static class IntersectionDrawer extends JComponent
    {
        public void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;

            Rectangle box1 = new Rectangle(22,44,55,66);
            g2.draw(box1);
            Rectangle box2 = new Rectangle(44,55,33,22);
            g2.draw(box2);


            g2.setColor(Color.cyan);
            Rectangle box3 = box1.intersection(box2);
            g2.draw(box3);
            g2.fill(box3);
            g2.setColor(Color.black);
            g2.draw(box3);
        }

    }

}
