package PraticeClassProgram;

import java.util.Scanner;

public class Que25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        int j;
        int count=1;
        int s=1;
        int start=0;
        System.out.println("Input the number");
        n = sc.nextInt();
        for (i=1;i<(n*2);i++){
            for (int k=n-s;k>0;k--){
                System.out.print(" ");
            }
            if (i < n){
                start = i;
                s++;
            }else {
                start = n * 2 - i;
                s--;
            }
            for (j=0;j<count;j++){
                System.out.print(start);
                if (j<count/2){
                    start--;
                }else {
                    start++;
                }
            }
            if (i < n){
                count = count + 2;
            }else {
                count = count - 2;
            }
            System.out.println();
        }
    }
}
