package Chap1;

import edu.princeton.cs.algs4.StdIn;


public class EX_1_1_5_2 {
    public static void main(String[] args) {
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
    }
}
