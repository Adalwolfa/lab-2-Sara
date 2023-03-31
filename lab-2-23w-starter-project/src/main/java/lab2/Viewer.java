package lab2;

import javax.swing.*;
import java.awt.*;

public class Viewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(100,100);
        frame.setTitle("Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PracticeExercise_2_21_Component component = new PracticeExercise_2_21_Component();
        frame.add(component);

        frame.setVisible(true);

    }
}
