package day13_parctice_task.employee;

public class Tester extends Employee{

    public Tester(String employeeId, String jobTitle, double salary, String companyName, String name) {
        super(employeeId, jobTitle, salary, companyName, name);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(getJobTitle()+" "+getName()+" is testing");
    }
}
