package Chap1;




public class EX_1_1_14 {
    public static void main(String[] args){
        int value = 1025;
        System.out.println(lg(value));

    }
    private static int lg(int n) {
        int shiftRightCount = 0;
        do {
            n >>= 1;
            shiftRightCount++;
        } while (n != 0);
        return shiftRightCount - 1;
    }
}



