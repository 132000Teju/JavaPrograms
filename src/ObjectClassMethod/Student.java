package ObjectClassMethod;

// toString() method
public class Student {
    public String toString()
    {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }

    public static void main(String[] args) {
        Student s = new Student();

// Below two statements are equivalent
        System.out.println(s);
        System.out.println(s.toString());
    }
}
