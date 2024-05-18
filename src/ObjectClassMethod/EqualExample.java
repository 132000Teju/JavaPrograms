package ObjectClassMethod;

public class EqualExample {
        private int id;
        private String name;

        public EqualExample(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public boolean equals(Object obj) {
            // Checking if the object is compared with itself
            if (this == obj) return true;

            // Checking if the object is null or of a different class
            if (obj == null || getClass() != obj.getClass()) return false;

            // Casting the object to MyClass
            EqualExample myObj = (EqualExample) obj;

            // Comparing the state of both objects
            return id == myObj.id && name.equals(myObj.name);
        }

        public static void main(String[] args) {
            EqualExample obj1 = new EqualExample(1, "John");
            EqualExample obj2 = new EqualExample(1, "John");
            EqualExample obj3 = new EqualExample(2, "Jane");

            // Testing the equals method
            System.out.println("obj1.equals(obj2): " + obj1.equals(obj2)); // Output: true
            System.out.println("obj1.equals(obj3): " + obj1.equals(obj3)); // Output: false
        }
    }
