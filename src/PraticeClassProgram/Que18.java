package PraticeClassProgram;

import java.util.Scanner;

public class Que18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=1;
        int j;
        int n;
        int k;
        System.out.println("The pattren is as follow: ");
        n=sc.nextInt();
        for (j=1;j<=n;j++){
            for (k=1;k<=j;k++)
                System.out.print(i++);
            System.out.println(" ");
        }
    }
}
