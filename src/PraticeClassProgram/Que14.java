package PraticeClassProgram;

import java.util.Scanner;

public class Que14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m;
        int j;
        System.out.println("Input the number");
       int  i=sc.nextInt();
        for (j=0;j<=i;j++){
             m =i * j;
            System.out.println(+i+"x"+j+"="+m);
        }
    }
}
