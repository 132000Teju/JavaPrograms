package PracticeArrayProgram;

public class Que5 {
    public static boolean contains(int[] array,int item){
        for (int y: array){
            if (item == y){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] array = {100,200,300,400,500,600,700,800,900};
        System.out.println(contains(array,12));
        System.out.println(contains(array,100));
    }
}
