package Chap1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class EX_1_1_23 {
    public static void main(String[] args){
        System.out.printf("+ or - ? ");
        char symbol = StdIn.readChar();
        int[] whitelist = new In(args[0]).readAllInts(); //largeW.txt
        int[] alllist = new In(args[1]).readAllInts(); //largeT.txt
        Arrays.sort(whitelist);
        for (int i = 0; i < alllist.length; i++) {
            if (rank((int)alllist[i], whitelist) != -1 && symbol == '-') {
                System.out.printf("%s ", alllist[i]);
            } else if (rank((int)alllist[i], whitelist) == -1 && symbol == '+') {
                System.out.printf("%s ", alllist[i]);
            }
        }
    }
    public static int rank(int key, int[] a){
        return rank(key, a, 0, a.length -1);
    }

    public static int rank(int key, int[] a, int lo, int hi){
        if(lo > hi) return -1;
        int mid = (hi + lo) / 2;
        if(key < a[mid]) return rank(key, a, lo, mid - 1);
        else if(key > a[mid]) return rank(key, a, mid + 1, hi);
        else return mid;
    }
}
