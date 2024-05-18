package PraticeClassProgram;

import java.util.Scanner;

public class Que24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n;
        System.out.println("Input the number");
        n = sc.nextInt();
        for (i=0;i<n;i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
