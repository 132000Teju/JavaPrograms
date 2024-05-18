package PraticeClassProgram;

import java.util.Scanner;

public class Que19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,j,n,a,b;
        System.out.println("Enter the number: ");
        n=s.nextInt();
        a=n+4-1;
        for(i=1;i<=n;i++)
        {
            for(b=a;b!=0;b--)
            {
                System.out.print(" ");
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
            a--;
        }
    }
}
