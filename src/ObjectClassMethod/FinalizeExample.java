package ObjectClassMethod;

public class FinalizeExample {
        // Resource to be cleaned up
        private String resource;

        public FinalizeExample(String resource) {
            this.resource = resource;
        }

        @Override
        protected void finalize() throws Throwable {
            try {
                // Closing or releasing the resource
                System.out.println("Finalizing object with resource: " + resource);
            } finally {
                super.finalize();
            }
        }

        public static void main(String[] args) {
            // Creating objects
            FinalizeExample obj1 = new FinalizeExample("Resource 1");
            FinalizeExample obj2 = new FinalizeExample("Resource 2");

            // Making objects eligible for garbage collection
            obj1 = null;
            obj2 = null;

            // Triggering garbage collection (for demonstration purposes)
            System.gc();
        }
    }


