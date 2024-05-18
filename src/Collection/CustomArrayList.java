package Collection;

public class CustomArrayList {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    // Constructor to initialize the array with default capacity
    public CustomArrayList() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Method to add an element to the end of the array
    public void add(Object element) {
        ensureCapacity(); // Ensure capacity is sufficient
        array[size] = element;
        size++;
    }

    // Method to delete an element at a specific index
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Shift elements to the left to remove the element at the specified index
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        // Set the last element to null and decrement the size
        array[size - 1] = null;
        size--;
    }

    // Method to get the current size of the array
    public int size() {
        return size;
    }

    // Helper method to ensure capacity is sufficient
    private void ensureCapacity() {
        if (size == array.length) {
            // Double the array size when the capacity is reached
            int newCapacity = array.length * 2;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }

    // Method to get an element at a specific index
    public Object get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public static void main(String[] args) {
        // Create an instance of CustomArray
        CustomArrayList customArray = new CustomArrayList();

        // Add elements to the array
        customArray.add("Apple");
        customArray.add("Orange");
        customArray.add("Banana");

        // Display the size of the array
        System.out.println("Array size: " + customArray.size());

        // Display elements in the array
        for (int i = 0; i < customArray.size(); i++) {
            System.out.println("Element at index " + i + ": " + customArray.get(i));
        }

        // Delete an element at index 1
        customArray.delete(1);

        // Display the updated size of the array
        System.out.println("Updated array size: " + customArray.size());

        // Display elements in the updated array
        for (int i = 0; i < customArray.size(); i++) {
            System.out.println("Element at index " + i + ": " + customArray.get(i));
        }
    }
}
