package PracticeArrayProgram;

public class Que4 {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4,5,6,7,8,9,10};
        int sum=0;
        for (int i=0;i<num.length;i++){
            sum= sum + num.length;
        }
        double avg = sum/num.length;
        System.out.println("Average of the given number: "+avg);
    }
}
