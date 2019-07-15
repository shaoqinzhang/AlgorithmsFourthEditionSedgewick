package Chap1;




public class EX_1_1_20 {
    public static void main(String[] args) {

        System.out.println(ln(120));
    }
    public static double ln(int N) {
        if (N == 0) {
            return 0;
        } else {
            return Math.log(N) + ln(N - 1);
        }
    }
}



