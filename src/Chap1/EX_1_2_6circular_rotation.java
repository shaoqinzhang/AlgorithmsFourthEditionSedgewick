package Chap1;

import edu.princeton.cs.algs4.*;

import java.util.Scanner;

public class EX_1_2_6circular_rotation {
public static void main(String[] args) {
        System.out.print("s: ");
        String s = StdIn.readLine();
        System.out.print("t: ");
        String t = StdIn.readLine();
        System.out.println(s.concat(s));
        System.out.println(s.concat(s).indexOf(t));
        if (s.length() == t.length() && s.concat(s).indexOf(t) >= 0) {
        System.out.println(s + " is the circular rotation of " + t);
        } else {
        System.out.println(s + " is not the circular rotation of " + t);
        }
        }
}
