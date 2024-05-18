package PraticeClassProgram;

import java.util.Scanner;

public class Que22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        int j;
        int k;
        int a=0;
        System.out.println("Enter the number of rows");
        n = sc.nextInt();
        for (i=0;i<n;i++){
            for (k=1;k<=n-i;k++)
                System.out.print(" ");
            for (j=0;j<=i;j++){
                if (j==0||i==0)
                   a=1;
                else
                    a = a *(i-j+1)/j;
                System.out.print("  "+a);
            }
           System.out.println();
        }
    }
}
