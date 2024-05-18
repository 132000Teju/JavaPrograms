package PraticeClassProgram;

public class Que4 {
    public static void main(String[] args) {
        int i=25;
        if (i>0){
            if (i<1){
                System.out.println("positive less number "+i);
            }if (i>1000000){
                System.out.println("positive greater number "+i);
            }else {
                System.out.println("positive number "+i);
            }
        }
        if (i<0){
            if (i<1){
                System.out.println("negative less number "+i);
            }if (i>1000000){
                System.out.println("negative greater number "+i);
            }else {
                System.out.println("negative number "+i);
            }
        }
    }
}
