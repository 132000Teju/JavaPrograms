package PraticeClassProgram;

import java.util.Scanner;

public class Que23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n;
        System.out.println("Input the number");
        n = sc.nextInt();
        for (i=n;i>0;i--){
            System.out.println(" ");
            for (j=1;j<=i;j++)
                System.out.print("*");
        }
        System.out.println();
    }
}
