package Chap1;




public class EX_1_1_19_Fibonacci {
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            System.out.println(N + " " + F_better(N)[N]);
        
    }
    public static long[] F_better(int N)
    {
        long[] f = new long[N + 1];
        if (N == 0) {
            return f;
        }
        f[1] = 1;
        if (N == 1) {
            return f;
        }
        for (int i = 2; i <= N; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f;
    }
    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
}



