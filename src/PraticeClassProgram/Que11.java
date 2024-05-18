package PraticeClassProgram;

import java.util.Scanner;

public class Que11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;

            System.out.println("Enter the number value");
            int num = sc.nextInt();
            System.out.println("The first n natural numbers are : " + num);

        for (int i=1;i<=num;i++){
            System.out.println(i);
            sum+=i;
        }
        System.out.println("Sum of n natural numbers upto n terms : \n"+sum);
    }
}
