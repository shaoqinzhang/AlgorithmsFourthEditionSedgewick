package Chap1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class EX_1_3_50<Item> implements Iterable<Item> {
    private class Node
    {
        Item item;
        Node next;
    }
    private Node first;
    private int N;
    private int operates;
    public boolean isEmpty()
    {
        return N==0;
    }
    public int size()
    {
        return N;
    }
    public void push(Item item)
    {
        Node oldfirst=first;
        first=new Node();
        first.item=item;
        first.next=oldfirst;
        N++;
        operates++;
    }
    public Item pop()
    {
        if(isEmpty())
            throw new NoSuchElementException();
        Item item=first.item;
        first=first.next;
        N--;
        operates++;
        return item;
    }
    public Iterator<Item> iterator()
    {
        return new ListIterator();
    }
    private class ListIterator implements Iterator<Item>{
        private Node current=first;
        private int count=operates;
        public boolean hasNext() {
            if(count!=operates)
                throw new ConcurrentModificationException();
            return current!=null;
        }
        public Item next() {
            if(count!=operates)
                throw new ConcurrentModificationException();
            if(isEmpty())
                throw new ConcurrentModificationException();
            Item item=current.item;
            current=current.next;
            return item;
        }
    }
    public void main(String[] args){


    }


}
