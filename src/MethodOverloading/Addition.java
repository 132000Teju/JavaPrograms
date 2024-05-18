package MethodOverloading;

public class Addition {
    void  sum(int a,int b){
      int x = a + b;
        System.out.println("sum of two number"+x);
    }
    public static void main(String[] args){
        Addition a = new Addition();
        a.sum(10,10);
    }
}
