package Chap1;

import edu.princeton.cs.algs4.Queue;

public class EX_1_3_37 {
    public static void Josephus(int N,int M){
        Queue<Integer> queue=new Queue<>();
        for (int i = 0; i <N ; i++)
        {
            queue.enqueue(i);
        }
        for (int i = 0; i <N ; i++){
            for (int j = 0; j <M-1 ; j++){
                queue.enqueue(queue.dequeue());
            }
            System.out.print(queue.dequeue()+" ");
        }
    }
    public static void main(String[] args)
    {
        EX_1_3_37.Josephus(7, 2);
    }

}
