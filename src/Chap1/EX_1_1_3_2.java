package Chap1;
import edu.princeton.cs.algs4.StdIn;

public class EX_1_1_3_2 {
    public static void main(String arg[])
    {
        int a = StdIn.readInt();
        int b = StdIn.readInt();
        int c = StdIn.readInt();
		if (a == b && a == c)
		{
            System.out.println("equal");
        }
        else
        {
            System.out.println("not equal");
        }
        }
}