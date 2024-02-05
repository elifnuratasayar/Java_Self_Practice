package day11_practice_task;

public class EmployeeClients {
    public static void main(String[] args) {
        Employe employe1= new Employe();
        employe1.name= "Jonathan Law";
        employe1.jobTitle="Engineer";
        employe1.gender='m';
        employe1.salary=20000;
        employe1.age=32;
        employe1.work();
        System.out.println(employe1);


    }
}
