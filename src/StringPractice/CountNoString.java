package StringPractice;

import java.util.Arrays;

public class CountNoString {
    public static void main(String[] args) {
        String str= "javaclassprogramming";
       int count[]= new int[256];
       //check the length of the string
        for (int i=0;i<str.length();i++) {
            count[(int)str.charAt(i)]++;  //count the characters into the string
           }
        //check the frequency of the characters
            for (int i=0;i<256;i++){
                if (count[i]!=0)         //check the condition of the program
            System.out.println("The occurrence of " +(char)i+ " is: " + count[i]);
        }
    }
}
