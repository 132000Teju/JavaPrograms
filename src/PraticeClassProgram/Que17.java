package PraticeClassProgram;

import java.util.Scanner;

public class Que17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int i;
         int j;
         int k;
         System.out.println("The pattren is as follow: ");
         i=sc.nextInt();
         for (j=1;j<=i;j++){
             for (k=1;k<=j;k++)
                 System.out.print(j);
             System.out.println("");
         }
    }
}
