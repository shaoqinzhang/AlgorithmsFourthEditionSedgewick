package Chap1;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.Interval2D;
import edu.princeton.cs.algs4.StdIn;

import java.util.Scanner;

public class EX_1_2_2 {
    public static void main(String[] args){
        int N =10;
        Interval1D[] intervals = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            intervals[i] = new Interval1D(StdIn.readDouble(), StdIn.readDouble());
        }
        if (N > 2) {
            for (int i = 0; i < N - 1; i++) {
                for (int j = i + 1; j < N; j++) {
                    if (intervals[i].intersects(intervals[j])) {
                        System.out.println(intervals[i] + " intersects " + intervals[j]);
                    }
                }
            }
        }

    }
}
