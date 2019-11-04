package Chap1;

import edu.princeton.cs.algs4.Queue;
import java.util.Stack;

public class EX_1_3_6 {
    public  static void main(String[] args){
        Stack<String> stack = new Stack<>();
        Queue<String> q = new Queue<String>();
        q.enqueue("a");
        q.enqueue("b");
        q.enqueue("c");
        while (!q.isEmpty()){
            stack.push(q.dequeue());
        }
        while (!stack.isEmpty()){
            q.enqueue(stack.pop());
        }
        while (!q.isEmpty())
        {
            System.out.println(q.dequeue());
        }
    }
}
