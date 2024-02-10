package day13_parctice_task.employee;

public class EmployeeClients {
    public static void main(String[] args) {


        Tester team1 = new Tester("bbb13", "qa", 500000, "Dyson", "Ahmet");
     team1.work();
        System.out.println(team1);
        Teacher team2= new Teacher("ccc14","keyworks",30000,"Little","Carla");
        team2.work();
        System.out.println(team2);
        Driver team3= new Driver("ddd16","rider",554000,"Uber","Chris");
        team3.work();


    }
}
