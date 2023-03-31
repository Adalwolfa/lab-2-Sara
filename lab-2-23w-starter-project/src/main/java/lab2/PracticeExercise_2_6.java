package lab2;

import java.awt.*;

public class PracticeExercise_2_6 {

    public static void main(String[] args)
    {
        Rectangle box =  new Rectangle(5,10,20,20);
        System.out.println("Before adding" + box);

        box.add(0,0);
        System.out.println("After adding" + box);

        System.out.println("Expected Location: (0,0)" );
        System.out.println("Actual Location: (" + box.x + "," + box.y +")");
        System.out.println("Expected width: 25");
        System.out.println("Actual width:" + box.width);
        System.out.println("Expected height: 40" );
        System.out.println("Actual Height:" + box.height);
    }
}
