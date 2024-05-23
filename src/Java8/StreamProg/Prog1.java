package Java8.StreamProg;

import InheritancePrograms.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Prog1 {
    public static void main(String[] args) {
        class Employee
        {
            int id;

            String name;

            int age;

            String gender;

            String department;

            int yearOfJoining;

            double salary;

            public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
            {
                this.id = id;
                this.name = name;
                this.age = age;
                this.gender = gender;
                this.department = department;
                this.yearOfJoining = yearOfJoining;
                this.salary = salary;
            }

            public int getId()
            {
                return id;
            }

            public String getName()
            {
                return name;
            }

            public int getAge()
            {
                return age;
            }

            public String getGender()
            {
                return gender;
            }

            public String getDepartment()
            {
                return department;
            }

            public int getYearOfJoining()
            {
                return yearOfJoining;
            }

            public double getSalary()
            {
                return salary;
            }

            @Override
            public String toString()
            {
                return "Id : "+id
                        +", Name : "+name
                        +", age : "+age
                        +", Gender : "+gender
                        +", Department : "+department
                        +", Year Of Joining : "+yearOfJoining
                        +", Salary : "+salary;
            }
        }
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

        employeeList.stream().forEach(System.out::println);
        System.out.println("==================================");

        // How many male and female employees are there in the organization?

        long maleCount = employeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Male"))
                .count();

        long femaleCount = employeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("Female"))
                .count();

        System.out.println("Number of male employee :" +maleCount);
        System.out.println("Number of female employee :" +femaleCount);
        System.out.println("==================================");

       // Print the name of all departments in the organization?

        System.out.println("All departments in the organization");
        employeeList.stream().map(Employee::getDepartment).forEach(System.out::println);
        System.out.println("==================================");

        // What is the average age of male and female employees?

        Map<String,Double> avgageofmaleandfemaleemployee =
                employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)));

        System.out.println("Avarage age of the employee : ");
        System.out.println(avgageofmaleandfemaleemployee);
        System.out.println("==================================");

        //  Get the details of highest paid employee in the organization?

        Optional<Employee> highestPaidEmployeeWrapper=
                employeeList.stream().collect(Collectors.maxBy(Comparator.
                        comparingDouble(Employee::getSalary)));

        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

        System.out.println("Details Of Highest Paid Employee : ");

        System.out.println("==================================");

        System.out.println("ID : "+highestPaidEmployee.getId());

        System.out.println("Name : "+highestPaidEmployee.getName());

        System.out.println("Age : "+highestPaidEmployee.getAge());

        System.out.println("Gender : "+highestPaidEmployee.getGender());

        System.out.println("Department : "+highestPaidEmployee.getDepartment());

        System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());

        System.out.println("Salary : "+highestPaidEmployee.getSalary());

        System.out.println("==================================");

        // Get the names of all employees who have joined after 2015?

        System.out.println("Employee joining after 2015 : ");
        employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015)
                .map(Employee::getName).forEach(System.out::println);
        System.out.println("==================================");

        // Count the number of employees in each department?

        System.out.println("Number of each employee in each Department : ");
        Map<String,Long> employeeCountByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors
                        .counting()));
        Set<Map.Entry<String,Long>> entrySet = employeeCountByDepartment.entrySet();
        for (Map.Entry<String,Long> entry : entrySet){
            System.out.println(entry.getKey() +" : "+ entry.getValue());
        }
        System.out.println("==================================");

        //  What is the average salary of each department?

        System.out.println("Average salary of the each Department : ");
        Map<String,Double> avagsalaryofdepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,Collectors
                        .averagingDouble(Employee::getSalary)));
          Set<Map.Entry<String,Double>> entrySet1 = avagsalaryofdepartment.entrySet();
          for (Map.Entry<String,Double> entry : entrySet1){
              System.out.println(entry.getKey() + " : " + entry.getValue());
          }
        System.out.println("==================================");

          // Get the details of youngest male employee in the product development department?

        System.out.println("Youngest male employee in the product development Department : ");
        Optional<Employee> youngestMaleEmployeeInProductDevelopmentWrapper=
                employeeList.stream()
                        .filter(e -> e.getGender()=="Male" && e.getDepartment()=="Product Development")
                        .min(Comparator.comparingInt(Employee::getAge));

        Employee youngestMaleEmployeeInProductDevelopment = youngestMaleEmployeeInProductDevelopmentWrapper.get();

        System.out.println("Details Of Youngest Male Employee In Product Development");

        System.out.println("----------------------------------------------");

        System.out.println("ID : "+youngestMaleEmployeeInProductDevelopment.getId());

        System.out.println("Name : "+youngestMaleEmployeeInProductDevelopment.getName());

        System.out.println("Age : "+youngestMaleEmployeeInProductDevelopment.getAge());

        System.out.println("Year Of Joinging : "+youngestMaleEmployeeInProductDevelopment.getYearOfJoining());

        System.out.println("Salary : "+youngestMaleEmployeeInProductDevelopment.getSalary());

        System.out.println("==================================");

       // Who has the most working experience in the organization?

        System.out.println("Most working experience in the Department");
        Optional<Employee> experienceWrapper = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining)).findFirst();
        Employee experience = experienceWrapper.get();
        System.out.println("Senior Most Employee Details :");

        System.out.println("----------------------------");

        System.out.println("ID : "+experience.getId());

        System.out.println("Name : "+experience.getName());

        System.out.println("Age : "+experience.getAge());

        System.out.println("Gender : "+experience.getGender());

        System.out.println("Age : "+experience.getDepartment());

        System.out.println("Year Of Joinging : "+experience.getYearOfJoining());

        System.out.println("Salary : "+experience.getSalary());

        System.out.println("==================================");

        // How many male and female employees are there in the sales and marketing team?

        System.out.println("Male and Female employee are there in the sales and marketing team");

        Map<String, Long> countEmployeesOfSalesAndMarketing=
                employeeList.stream()
                        .filter(e -> e.getDepartment()=="Sales And Marketing")
                        .collect(Collectors.groupingBy(Employee::getGender,
                                Collectors.counting()));

        System.out.println(countEmployeesOfSalesAndMarketing);

        System.out.println("==================================");

        // What is the average salary of male and female employees?

        System.out.println("Average salary of male and female employee");

        Map<String,Double> averageSalaryOfEmployees = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,Collectors
                        .averagingDouble(Employee::getSalary)));

        System.out.println(averageSalaryOfEmployees);

        System.out.println("==================================");

        //  List down the names of all employees in each department?

        System.out.println("Names of all employees in each Department");

        Map<String,List<Employee>> employeListByDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String,List<Employee>>> entrySet2 = employeListByDepartment.entrySet();
        for (Map.Entry<String,List<Employee>> entry:entrySet2){
            System.out.println("--------------------------------------");

            System.out.println("Employees In "+entry.getKey() + " : ");

            System.out.println("--------------------------------------");

            List<Employee> list = entry.getValue();
            for (Employee e : list){
                System.out.println(e.getName());
            }
        }
        System.out.println("==================================");

        // What is the average salary and total salary of the whole organization?

        System.out.println("Avarage salary and total salary of the whole Organiztion");

        DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));

        System.out.println("Avarage Salary = " +employeeSalaryStatistics.getAverage());

        System.out.println("Total Salary = " +employeeSalaryStatistics.getSum());

        System.out.println("==================================");

        // Separate the employees who are younger or equal to 25 years from those employees
        // who are older than 25 years.

        System.out.println("Employee who are younger or equal to 25 years and otherside employee who are older than 25 years");

        Map<Boolean,List<Employee>> employeeByAge = employeeList.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getAge() > 25));
        Set<Map.Entry<Boolean,List<Employee>>> entrySet3 = employeeByAge.entrySet();
        for (Map.Entry<Boolean,List<Employee>> entry : entrySet3){
            System.out.println("----------------------------");

            if (entry.getKey())
            {
                System.out.println("Employees older than 25 years :");
            }
            else
            {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list){
                System.out.println(e.getName());
            }
        }

        System.out.println("==================================");

        //  Who is the oldest employee in the organization?
        //  What is his age and which department he belongs to?

        System.out.println("Oldest employee in the organization and his age is belongs to department");

        Optional<Employee> oldestEmployeeWrapper = employeeList.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmployeeWrapper.get();
        System.out.println("Name :" +oldestEmployee.getName());
        System.out.println("Age :" +oldestEmployee.getAge());
        System.out.println("Department :" +oldestEmployee.getDepartment());
    }
}
