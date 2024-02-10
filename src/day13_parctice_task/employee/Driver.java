package day13_parctice_task.employee;

public class Driver extends Employee{

    public Driver(String employeeId, String jobTitle, double salary, String companyName, String name) {
        super(employeeId, jobTitle, salary, companyName, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(getName()+" is driving");
    }


}
