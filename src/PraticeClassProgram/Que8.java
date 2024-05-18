package PraticeClassProgram;

import java.util.Scanner;

public class Que8 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        char ch;
         System.out.println("Enter the alphabets");
         ch=sc.next().charAt(0);
         if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            System.out.println("It is a Vowel");
         }else {
             System.out.println("It is a Consonant");
         }
    }
}
