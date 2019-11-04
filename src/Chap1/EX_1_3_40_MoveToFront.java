package Chap1;

public class EX_1_3_40_MoveToFront {
    private class Node
    {
        char ch;
        Node next;
    }
    private Node first;
    private int N;
    public void push(char ch) {
        ++N;
        Node oldfirst=first;
        first=new Node();
        first.ch=ch;
        first.next=oldfirst;
    }
    public boolean isRepeat(char ch) {
        for(Node x=first;x!=null;x=x.next)
        {
            if(x.ch==ch)
            {
                return true;
            }
        }
        return false;
    }
    public boolean isEmpty()
    {
        return N==0;
    }
    public void print() {
        for(Node x=first;x!=null;x=x.next)
            System.out.print(x.ch+" ");
    }
    public void delete(char ch) {
        for(Node x=first;x!=null;x=x.next)
        {
            if(x == first && x.ch == ch){
                first = first.next;
                N--;
                return;
            }
            else if(x.next!=null && x.next.ch==ch)
            {
                x.next=x.next.next;
                N--;
                return;
            }
        }
    }
    public static void main(String[] args)
    {
        char [] chars= {'a','a','b','a','b','c','d','e','a','e'};
        EX_1_3_40_MoveToFront link=new EX_1_3_40_MoveToFront();
        int N=chars.length;
        for (int i = 0; i < N; ++i)
        {
            if(link.isRepeat(chars[i]))
            {
                link.delete(chars[i]);
            }
            link.push(chars[i]);
        }
        link.print();
    }

}
