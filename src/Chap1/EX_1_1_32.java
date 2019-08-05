package Chap1;

import edu.princeton.cs.algs4.StdDraw;

import java.util.ArrayList;
import java.util.Scanner;

public class EX_1_1_32 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        while (!scanner.hasNext("#")){
            list.add(scanner.nextDouble());
//            System.out.println(list);
        }
        int N = 10;
        double l = 1, r = 10;
        int[] num = new int[N];
        int max = 0;
        double step = (r - l) / N;
        for (int i = 0; i < list.size(); i++){
            double element = list.get(i);
            if (element >= l && element <= r){
                for (int j = 0; j < N; j++){
                    if (element > l + step * j && element <= l + step * (j +1)){
                        num[j]++;
                        if (max < num[j]) {
                            max = num[j];
                        }
                    }
                }
            }
        }
        for (int i = 0; i < N; i++) {
            double x = (1.0 * i + 0.5) / N;
            double y = num[i] / (max * 2.0);
            double rw = 0.4 / N;
            StdDraw.filledRectangle(x, y, rw, y);
        }

    }

}
