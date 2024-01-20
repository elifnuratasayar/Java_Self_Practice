package day07_practice_task;

public class Employee {
    String name;
    int age;
    char gender;
    String jobTitle;
    double salary;

    public void work(){
        System.out.println("plays the "+ jobTitle +" and " +name+" of the employee concatenated with \"is working\"" );
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
