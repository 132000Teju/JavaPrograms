package ArrayPractice;
//reverse array program
public class ArrayReverseElementExample {
    public static void main(String[] args) {
        int[] input = {10, 9, 8, 7, 6, 5, 4};
        int[] tempArray = new int[input.length];
        int index = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            tempArray[index] = input[i];
            index++;
        }
        for (int i = 0; i < tempArray.length; i++) {
            System.out.println(tempArray[i]);
        }
    }
}
