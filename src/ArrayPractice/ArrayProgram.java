package ArrayPractice;

public class ArrayProgram {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        for (int i=arr.length-1;i>=0 ;i--){
            System.out.println("value at index "+i+" in given array is "+arr[i]);
        }
    }
}
