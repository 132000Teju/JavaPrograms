package StringPractice;

public class StringReverse {
    public static void main(String[] args) {
        String input = "ABCD";
        char[] charray = input.toCharArray();
        String output = "";
        for(int i = charray.length -1 ; i >= 0; i--){
            output = output + input.charAt(i);
            System.out.println(charray[i]);
        }

        System.out.println(output);
    }
}
