package Chap1;

import java.util.Scanner;

public class EX_1_1_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
        

    }
}
