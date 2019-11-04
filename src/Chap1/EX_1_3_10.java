package Chap1;

import java.util.Stack;

public class EX_1_3_10 {
    public  static void main(String[] args){
        InfixToPostfix();
    }
    public static void InfixToPostfix(){
        String str="( ( 1 + 2 + 1 ) *  ( ( 3 - 4 ) * ( 5 - 6 ) ) )";
        Stack<String> vals=new Stack<>();
        Stack<String> ops=new Stack<>();
        String [] strings=str.split("\\s+");
        for (int i = 0; i <strings.length ; i++)
        {
            String s =strings[i];
            if      (s.equals("("))               ;
            else if (s.equals("+") ||
                    s.equals("-") ||
                    s.equals("*") ||
                    s.equals("/") ||
                    s.equals("sqrt")) ops.push(s);
            else if (s.equals(")"))
            {
                String op = ops.pop();
                String v = vals.pop();

                if (op.equals("+") ||
                        op.equals("-") ||
                        op.equals("*") ||
                        op.equals("/"))
                    v = String.format("%s %s %s", vals.pop(), v, op);
                else if (op.equals("sqrt"))
                    v = String.format("%s %s", v, op);

                vals.push(v);
            }
            else vals.push(s);
        }
        System.out.println(vals.pop());

    }

}
