package Chap1;




public class EX_1_1_11 {
    public static void main(String[] args){
        boolean [][] a= {{true,false,true,false},{false,false,true,true},{true,true,true,false}};
        System.out.print("  ");
        for (int i = 0; i <a[0].length ; i++)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(i+" ");
            for (int j = 0; j <a[0].length ; j++)
            {
                if(a[i][j])
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    }

