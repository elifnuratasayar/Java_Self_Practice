package day02_practice_task;

import java.sql.SQLOutput;

public class EmployeeInfo {

    public static void main(String[] args) {
        String employeeName="Shay";
        int Age = 24 ;
        char Gender = 'F' ;
        String companyName = "Apple Inc";
        String jobTittle = " SDET";
        double yearsOfExperience = 2.5d;
        int Salary = 120_000 ;
        float salary= 12000f;
        boolean isFullTime= true ;
        boolean isMarried = false ;
        String employeeId= "B101";


        System.out.println("Employee name: "+ employeeName);
        System.out.println("Gender:" + Gender);
        System.out.println("Age:" + Age);
        System.out.println("Employee Id:" + employeeId );
        System.out.println("Company Name:" + companyName);
        System.out.println("Full time:" + isFullTime);
        System.out.println("Years of work experience:" + yearsOfExperience + "years");
        System.out.println("Salary:" + "$" + salary);
        System.out.println("Married:" + isMarried);


    }
}
