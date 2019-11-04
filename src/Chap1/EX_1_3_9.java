package Chap1;

import java.util.Scanner;
import java.util.Stack;

public class EX_1_3_9 {
    public  static void main(String[] args){
        String s="1 + 2 ) *  3 - 4 ) * 5 - 6 ) ) )";
        Stack<String> vals=new Stack<>();
        Stack<String> ops=new Stack<>();
        String [] strings=s.split("\\s+");
        for (int i = 0; i <strings.length ; i++)
        {
            if(strings[i].equals("+")||strings[i].equals("-")||strings[i].equals("*")||strings[i].equals("/")||strings[i].equals("sqrt"))
                ops.push(strings[i]);
            else if(strings[i].equals(")"))
            {
                String string="(";
                String v=vals.pop();
                String w=vals.pop();
                string+=w+ops.pop()+v+")";
                vals.push(string);
            }
            else
                vals.push(strings[i]);
        }
        System.out.println(vals.pop());

    }
}
