package ObjectClassMethod;

public class ToStringExample {
        private int value;

        public ToStringExample(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "ToStringExample{" +
                    "value=" + value +
                    '}';
        }

        public static void main(String[] args) {
            ToStringExample obj = new ToStringExample(10);
            System.out.println(obj.toString()); // Output: MyClass{value=10}
        }
    }


