package PraticeClassProgram;

import java.util.Scanner;

public class Que12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int avg=0;
        System.out.println("Enter the 5 number");
        for (int a=1 ; a<=5 ;a++){
                  int num= sc.nextInt();
                 sum+=num;
        }
        System.out.println("The sum of the given number is \n" +sum);
        avg=sum/5;
        System.out.println("The avg of the given number is \n " +avg);
    }
}
