package PraticeClassProgram;

import java.util.Scanner;

public class Que15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int i;
        int j;
        System.out.println("Input the number of terms is: ");
        i = sc.nextInt();
            System.out.println("The odd numbers are: " );
            for (j = 1; j <= i; j++) {
                System.out.println(2*j-1+"");
                sum += 2 * j - 1;
            }
            System.out.println("The sum of odd natural number upto " + i + "terms is : " + sum);
        }
    }
