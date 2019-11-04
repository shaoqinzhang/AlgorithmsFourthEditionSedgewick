package Chap1;
import edu.princeton.cs.algs4.Queue;

import java.util.Scanner;

public class EX_1_3_15 {
    public static void main(String[] args)
    {
        Queue<String> queue=new Queue<>();
        int k=2;
        Scanner scanner=new Scanner(System.in);
        while(!scanner.hasNext("#"))
        {
            queue.enqueue(scanner.next());
        }
        int N=queue.size();
        for (int i = 0; i <N-k ; i++)
        {
            queue.dequeue();
        }
        System.out.println(queue.dequeue());
    }
}
