package lab2;

public class PracticeExercise_2_1 {
    /*
    "Write a program that initializes a string with "Mississippi". Then replace all "i" with "ii" and print the length of the resulting string. In that string, replace all "ss" with "s" and print the length of the resulting string."

     */

    public static void main(String[] args)
    {
        System.out.println("Mississippi");

        String aString = "Mississippi".replace("i", "ii").replace("ss", "s");
        System.out.println(aString);

    }
}
