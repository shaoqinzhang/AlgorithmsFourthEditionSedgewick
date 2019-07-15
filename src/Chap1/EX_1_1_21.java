package Chap1;


import edu.princeton.cs.algs4.StdIn;

import java.util.Scanner;

public class EX_1_1_21 {
    public static void main(String[] args) {
        System.out.println("输入名字 整数 整数");
        String[] array1 = new String[100];
        int[] array2 = new int[100];
        int[] array3 = new int[100];
        double[] array4 = new double[100];
        int i = 0;
        Scanner scan = new Scanner(System.in);

        while (!scan.hasNext("#")) {
            array1[i++] = scan.next();
            array2[i] = scan.nextInt();
            array3[i] = scan.nextInt();
            array4[i] = array2[i] * 1.0 / array3[i];
        }
        for (int j = 0; j < i; j++) {
            System.out.printf("|%4s|%4d|%4d|%6.3f|\n", array1[j], array2[j], array3[j], array4[j]);

        }
    }

}



