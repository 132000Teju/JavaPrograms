package FunctionalInterface;


import ObjectClassMethod.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Methods {
    public static void main(String[] args) {
        class Student
        {
            int id;

            String name;

            double percentage;

            String specialization;

            public Student(int id, String name, double percentage, String specialization)
            {
                this.id = id;

                this.name = name;

                this.percentage = percentage;

                this.specialization = specialization;
            }

            public int getId() {
                return id;
            }

            public String getName() {
                return name;
            }

            public double getPercentage() {
                return percentage;
            }

            public String getSpecialization() {
                return specialization;
            }

            @Override
            public String toString()
            {
                return id+"-"+name+"-"+percentage+"-"+specialization;
            }
        }

        List<Student> listOfStudents = new ArrayList<Student>();

        listOfStudents.add(new Student(111, "John", 81.0, "Mathematics"));

        listOfStudents.add(new Student(222, "Harsha", 79.5, "History"));

        listOfStudents.add(new Student(333, "Ruth", 87.2, "Computers"));

        listOfStudents.add(new Student(444, "Aroma", 63.2, "Mathematics"));

        listOfStudents.add(new Student(555, "Zade", 83.5, "Computers"));

        listOfStudents.add(new Student(666, "Xing", 58.5, "Geography"));

        listOfStudents.add(new Student(777, "Richards", 72.6, "Banking"));

        listOfStudents.add(new Student(888, "Sunil", 86.7, "History"));

        listOfStudents.add(new Student(999, "Jordan", 58.6, "Finance"));

        listOfStudents.add(new Student(101010, "Chris", 89.8, "Computers"));

        //  Predicate – Tests an object
        // Imagine an operation where you want only a list of “Mathematics” students from the
        // above listOfStudents. Let’s see how to do it using Predicate.

        Predicate<Student> mathematicPredicate = (Student student) -> student.getSpecialization().equals("Mathematics");
        List<Student> mathematicsStudent = new ArrayList<Student>();
        for (Student student : listOfStudents){
            if (mathematicPredicate.test(student)){
                mathematicsStudent.add(student);
            }
        }
        System.out.println("===================================");

        // Consumer – Consumes an object
        //  displaying all students with their percentage.

        Consumer<Student> percentageConsumer = (Student student) -> {
            System.out.println(student.getName()+ " :" + student.getPercentage());
        };
        for (Student student : listOfStudents){
            percentageConsumer.accept(student);
        }

        System.out.println("===================================");

        // Function – Applies to an object
        // extracting only the names from listOfStudents.

        Function<Student,String> nameFunction = (Student Student) -> Student.getName();
        List<String> studentNames = new ArrayList<String>();
        for (Student student : listOfStudents){
            studentNames.add(nameFunction.apply(student));
        }

        // Supplier – Supplies the objects
        //  Creating a new Student

        Supplier<Student> studentSupplier = () -> new Student(111111,"New Student",92.9,"Java 8");
        listOfStudents.add(studentSupplier.get());
    }
}
