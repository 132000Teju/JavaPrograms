package AnnoynmousClass;

interface AA{
    abstract void test();
}
public class AnnoynmousTest {
    AnnoynmousTest(AA aa) {
        aa.test();
    }

    public static void main(String[] args) {
        AnnoynmousTest test = new AnnoynmousTest(new AA() {
            @Override
            public void test() {
                System.out.println("Simple Message");
            }
        });
    }
}
