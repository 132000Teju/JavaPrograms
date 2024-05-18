package ExceptionHandling;

import java.io.FileReader;

public class IOException extends Throwable {
    public static void main(String[] args)  {
        try {
            FileReader file = new FileReader("file.txt");
            System.out.println(file.read());
        }catch (Exception exp){
            System.out.println("Error occured :" +exp.getMessage());
        }
        finally {
            System.out.println("Finally block will always executed, irrespective of occurence of issue");
        }
    }
}
