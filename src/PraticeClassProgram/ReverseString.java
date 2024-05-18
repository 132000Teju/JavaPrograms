package PraticeClassProgram;

public class ReverseString {
    public static void main(String[] args) {
         String s="Hello World";
         String reverse="";
         for (int i=s.length()-1;i>=0;i--) {
             reverse += s.charAt(i);
         }
             System.out.println("Original String \n" +s);
             System.out.println("Reversed String \n" +reverse);
    }
}
