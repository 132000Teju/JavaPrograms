package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CustomSorting implements Comparable<CustomSorting>{
    String firstName;
    String lastName;
    double salary;
    int age;

    public CustomSorting(String firstName,String lastName,double salary,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomSorting{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(CustomSorting o){
        return this.getLastName().compareTo(o.getLastName());
    }
}

class FirstNameComparator implements Comparator<CustomSorting> {

    @Override
    public int compare(CustomSorting o1, CustomSorting o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}

class LastNameComparator implements Comparator<CustomSorting>{

    @Override
    public int compare(CustomSorting o1, CustomSorting o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}

class SalaryComparator implements Comparator<CustomSorting>{

    @Override
    public int compare(CustomSorting o1, CustomSorting o2) {
        return (int) (o1.getSalary() - o2.getSalary());
    }
}

class TestList{
    public static void main(String[] args) {
        ArrayList<CustomSorting> list = new ArrayList<>();
        CustomSorting obj1 = new CustomSorting("Vinayak", "Sawant", 1000000, 24);
        CustomSorting obj2 = new CustomSorting("Baswaraj", "Chavale", 120000, 22);
        CustomSorting obj3 = new CustomSorting("Pradeep", "Mahadik", 105000, 19);
        CustomSorting obj4 = new CustomSorting("Anant", "Dahiwade", 1100000, 27);
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);

        FirstNameComparator firstNameComparator = new FirstNameComparator();
        Collections.sort(list, firstNameComparator);
        for (CustomSorting cs : list){
            // System.out.println(cs);
        }
/*
        System.out.println("Last name comparator");

        LastNameComparator lastNameComparator = new LastNameComparator();
        Collections.sort(list, lastNameComparator);
        */
        Comparator<CustomSorting> ageComparator = new Comparator<CustomSorting>() {
            @Override
            public int compare(CustomSorting s1, CustomSorting s2) {
                return s1.getAge() - s2.getAge();
            }
        };

        Collections.sort(list, ageComparator);

        //  Collections.sort(list);
        for (CustomSorting cs : list){
            System.out.println(cs);
        }

    }
}


