package Chap1;

import java.util.Stack;

public class EX_1_3_44 {
    Stack<Character> left=new Stack<>();
    Stack<Character> right=new Stack<>();
    public int size()
    {
        return left.size()+right.size();
    }
    public void insert(char ch)
    {
        left.push(ch);
    }
    public char delete()
    {
        return left.pop();
    }
    public void left(int k)
    {
        if(k>left.size())
            return;
        for (int i = 0; i <k ; i++)
        {
            right.push(left.pop());
        }
    }
    public void right(int k)
    {
        if(k>right.size())
            return;
        for (int i = 0; i <k ; i++)
        {
            left.push(right.pop());
        }
    }
    public static void main(String[] args){
        EX_1_3_44 c = new EX_1_3_44();
        c.insert('a');
        System.out.println(c.size());
    }
}
