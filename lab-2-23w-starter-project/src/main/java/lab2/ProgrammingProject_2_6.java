package lab2;
import java.math.BigInteger;

public class ProgrammingProject_2_6
{

    public static void main(String[] args)
    {
        BigInteger big = new BigInteger("4");
        System.out.println("Original:" + big);

        BigInteger sq = big.multiply(big);
        System.out.println("Square:" +sq);

        BigInteger four =  sq.multiply(sq);
        System.out.println("Fourth Power:" +four);

        BigInteger eight = four.multiply(four);
        System.out.println("Eigth Power:" +eight);


    }
}
