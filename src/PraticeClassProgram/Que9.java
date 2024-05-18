package PraticeClassProgram;

import java.util.Scanner;

public class Que9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year;
        System.out.println("enter the year");
        year= sc.nextInt();
        if (year % 4==0){
            System.out.println(" year is leap");
        }else {
            System.out.println(" year is not leap");
        }
    }
}
