package Chap1;

import edu.princeton.cs.algs4.StdOut;


public class EX_1_1_9 {
    public static void main(String[] args){
        int N = 234245;
        StdOut.println(Integer.toBinaryString(N));
        String s = "";
        for (int n = N; n > 0; n = n>>1)
            s = (n & 1 ) + s;
        StdOut.println(s);
    }
    public String toBinaryStringUsingDevide(int n) {
        String s = "";
        for (; n > 0; n /=2)
            s = (n % 2 ) + s;
        return s;
    }
    public String toBinaryStringUsingAnd(int n){
        String s = "";
        for (; n > 0; n = n>>1)
            s = (n & 1 ) + s;
        return s;
    }


}
