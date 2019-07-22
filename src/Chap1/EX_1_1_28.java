package Chap1;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;

import java.util.ArrayList;
import java.util.Arrays;

public class EX_1_1_28 {
    public static void main(String[] args){
        int[] whitelist = new In(args[0]).readAllInts(); //largeW.txt
//        int[] whitelist = { 7, 1, 5, 1, 9, 5, 7, 7, 5, 1 };
        Arrays.sort(whitelist);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i < whitelist.length; i++) {
            if (whitelist[i] != whitelist[i - 1]) {
                list.add(whitelist[i]);
            }
        }
        Integer [] result=new Integer[list.size()];
        list.toArray(result);

        System.out.print(Arrays.toString(result));

    }
}
