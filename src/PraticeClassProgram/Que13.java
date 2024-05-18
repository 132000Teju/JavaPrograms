package PraticeClassProgram;

import java.util.Scanner;

public class Que13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int cube;
        System.out.println("input the number of terms: ");
        n = sc.nextInt();
        for (int i=0;i<=n;i++) {
            cube = i * i * i;
            System.out.println("The Cube of a Given Number  " + i + "  =  " + cube);
        }
    }

}
