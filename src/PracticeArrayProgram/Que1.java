package PracticeArrayProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Que1 {
    public static void main(String[] args) {
              int [] array1 = {33,12,123,23,34,545,442,223,7877};
              String [] array2 ={"java","class","c programming","html"};
        System.out.println("Original numberic array:" + Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted numberic array:" + Arrays.toString(array1));
        System.out.println("Original string array:" + Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted string array:" +Arrays.toString(array2));
    }
}
