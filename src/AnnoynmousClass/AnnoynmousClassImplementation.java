package AnnoynmousClass;

interface A{
    void test();
    void dumm();
}
public class AnnoynmousClassImplementation {
    public AnnoynmousClassImplementation(A a){
        a.test();
        a.dumm();
    }
   /* @Override
    public void test(){
        System.out.println("Overriding interface method");
    }*/
    void dummy(){
        A a = new A(){
            public void test(){
                System.out.println("Overriding interface method");
            }
            @Override
            public void dumm(){
                System.out.println("Overriding interface method dumm called");
            }
        };
        a.test();
        a.dumm();
    }

    public static void main(String[] args) {
        AnnoynmousClassImplementation obj = new AnnoynmousClassImplementation(new A() {
            public void test() {
                System.out.println("Overriding interface method");
            }

            @Override
            public void dumm() {
                System.out.println("Overriding interface method dumm called");
            }
        });
         obj.dummy();
    }
}
