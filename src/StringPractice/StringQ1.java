package StringPractice;

public class StringQ1 {
    // counter questions => based upon your answers
    public static void main(String[] args) {
        String s = "Java";   //SCP string literal
        // for loop which will iterate for 1 million times and inside loop i am creating/
        //new string object and appending index to each string object
        // 1 millions + 1 millions
        String ss = new String("Java11");  // Heap and SCP new object
        String ss1 = new String("Java");   // Heap and SCP new object
        s = s.concat("Programming");
        System.out.println(s);
        final String s1 = "Java";
        // s1 = s1.concat("Programming");
        // programming
        //pro
        String sss = "Java";
        String ssss = "Test";
        // sss = "test";
        // ssss = "java";
        // steps for creating custom immutable class
        // Stringbuilder vs Stringbuffer => thresd
    }
}
