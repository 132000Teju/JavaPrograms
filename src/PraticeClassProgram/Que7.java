package PraticeClassProgram;

import java.util.Scanner;

public class Que7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month;
        int year;
        System.out.println("Enter the year");
        year= sc.nextInt();
        System.out.println("enter the Month Number from 1 to 12 (1 = Jan, and 12 = Dec) : ");
            month = sc.nextInt();
        if (month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println(" 31 Days in this Month");
        } else if (month==4||month==6||month==9||month==11) {
            System.out.println(" 30 Days in this Month");
        } else if (month==2){
            if (year % 4 == 0) {
                System.out.println("  29  Days in this Month");
            } else {
                System.out.println(" 28 days in this month");
            }
        }
    }
}
