package PraticeClassProgram;

public class Simple {
    public static void main(String[] args) {
        String s="Hello";
        String s1="World";

        System.out.println("String before sorting \n " +s+"and"+s1);
        s=s+s1;

        s1=s.substring(0,(s.length()-s1.length()));

        s=s.substring(s1.length());

        System.out.println("String after sorting \n "+s+"and"+s1);
    }
}
