package Chap1;

public class EX_1_1_24 {
    public static void main(String[] args){
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        System.out.println("result: " + euclid(p, q));
//        System.out.println("result: " + euclid(105, 24));
//        System.out.println("result: " + euclid(1111111, 1234567));

    }
    public static int euclid(int p, int q) {
        System.out.println("p = " + p + ", q = " + q);
        if (p == 0 || q == 0) {
            return 1;
        }
        if (p < q) {
            int t = p;
            p = q;
            q = t;
        }
        if (p % q == 0) {
            return q;
        } else {
            return euclid(q, p % q);
        }
    }
}
