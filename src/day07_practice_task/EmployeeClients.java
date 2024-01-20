package day07_practice_task;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee1= new Employee();
        employee1.name="David";
        employee1.age=30;
        employee1.gender= 'M';
        employee1.jobTitle= "Qa Tester";
        employee1.salary=40000;
        employee1.work();
        System.out.println(employee1);
    }
}
