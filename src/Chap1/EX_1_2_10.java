package Chap1;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;
import java.util.Random;

public class EX_1_2_10 {

    public static void main(String[] args) {
        VisualAccumulator vis =new VisualAccumulator(5,100);
        for (int i = 0;i < 100;i++)
        {
            vis.addDataValue(new Random().nextInt(100));
        }


    }
}

class VisualAccumulator {
    private double total;
    private int N;

    public VisualAccumulator(int trials, double max) {
        StdDraw.setXscale(0, trials);
        StdDraw.setYscale(0, max);
        StdDraw.setPenRadius(.005);
    }

    public void addDataValue(double val) {
        N++;
        total += val;
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.point(N, val);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(N, total / N);
    }

    public double mean() {
        return total / N;
    }

    @Override
    public String toString() {
        return "Mean (" + N + " values): " + String.format("%7.5f", mean());
    }
}
