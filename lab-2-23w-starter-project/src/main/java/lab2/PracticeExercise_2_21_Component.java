package lab2;

import javax.swing.*;
import java.awt.*;
public class PracticeExercise_2_21_Component extends JComponent
{

    public void paintComponent(Graphics g)
    {
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;

        // Construct a rectangle and draw it
        g2.setColor(Color.blue);

        Rectangle box = new Rectangle(5, 10, 50, 30);
        g2.fill(box);
        g2.setColor(Color.RED);
        g2.drawString("Sara", 20, 30);

        g2.draw(box);

    }
}

