package day13_parctice_task.employee;

public class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String employeeId, String jobTitle, double salary, String companyName, String name, String programmingLanguage) {
        super(employeeId, jobTitle, salary, companyName, name);
        setProgrammingLanguage(programmingLanguage);
    }

    @Override
    public void work() {
        super.work();
        System.out.println(getJobTitle()+" "+getName()+" is coding "+programmingLanguage);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
}
