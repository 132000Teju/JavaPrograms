package PraticeClassProgram;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input the number");
        int input= in.nextInt();
        if(input>0){
            System.out.println("Number is Positive");
        } else if (input<0) {
            System.out.println("Number is Negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}
