package day03_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {
        double hourlyRate= 50 ;
        double weeklyHours= 45 ;
        double stateTaxRate = 6;
        double federalTaxRate=26;
        double salaryBeforeTax = (hourlyRate * weeklyHours) * 52 ;
        double stateTax = (salaryBeforeTax *6) / 100 ;
        double federalTax = (salaryBeforeTax*26)/100;
        double totalTax = stateTax+federalTax;
        double netInCome = salaryBeforeTax - (totalTax);
 
        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("Federal tax is; $" +federalTax);
        System.out.println("State  tax is: $"+stateTax);
        System.out.println("Total tax is; $"+totalTax);
        System.out.println("Net income is: $" + netInCome);

    }
}
