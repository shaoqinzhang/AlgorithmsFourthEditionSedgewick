package Chap1;


import edu.princeton.cs.algs4.*;

import java.util.Arrays;


public class EX_1_1_38
{
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whitelist = in.readAllInts();
        long startTime = System.currentTimeMillis();
        long endTime;
        int key = StdIn.readInt();
        if (BruteForceSearch(key, whitelist) == -1) {
            StdOut.println(key);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Brute force search time: " + (endTime - startTime));

        key = StdIn.readInt();
        startTime = System.currentTimeMillis();
        Arrays.sort(whitelist);
        if (BinarySearch.indexOf(whitelist, key) == -1) {
            StdOut.println(key);
        }
        endTime = System.currentTimeMillis();
        System.out.println("Binary search time: " + (endTime - startTime));
    }
    public static int BruteForceSearch(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }
}

