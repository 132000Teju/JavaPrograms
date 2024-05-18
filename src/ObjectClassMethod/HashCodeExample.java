package ObjectClassMethod;

public class HashCodeExample {
        private int id;
        private String name;

        public HashCodeExample(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public int hashCode() {
            // Generating a hash code based on the object's state
            int result = 17;
            result = 31 * result + id;
            result = 31 * result + (name != null ? name.hashCode() : 0);
            return result;
        }

        public static void main(String[] args) {
            HashCodeExample obj1 = new HashCodeExample(1, "John");
            HashCodeExample obj2 = new HashCodeExample(2, "Jane");

            // Printing hash codes
            System.out.println("Hash code of obj1: " + obj1.hashCode());
            System.out.println("Hash code of obj2: " + obj2.hashCode());
        }
    }


