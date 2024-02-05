package day11_practice_task;

public class Employe {


    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public Employe(){
        this.age=age;
        this.name=name;
        this.gender=gender;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public void work(){

        System.out.println(jobTitle+" is working "+name);
        return;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}

    /*. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

*/
