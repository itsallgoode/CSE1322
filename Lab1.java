import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {

        System.out.println("[Budgeting System]");

        Scanner myScan=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=myScan.nextLine();
        System.out.print("Hello "+name+".");

        System.out.print(" Please enter your monthly salary: ");
        Integer monthly_salary=myScan.nextInt();
        Integer yearly_salary=monthly_salary*12;
        System.out.println();

        System.out.print("What is the total amount of your loan? ");
        Double loan_principal=myScan.nextDouble();
        System.out.print("What is interest rate of your loan? ");
        Double loan_interest=myScan.nextDouble();
        loan_interest=loan_interest / 100;
        Double new_principal=loan_principal*Math.pow((1 + (loan_interest / 12)),12);
        System.out.println();

        System.out.println("Your yearly salary is $"+yearly_salary);
        System.out.println("In 12 months, your loan's principal will be $"+new_principal);
        System.out.println();

        System.out.println("At the end of the year, you will have paid off your debt: "+(yearly_salary >= new_principal));
        System.out.println("At the end of the year, your will still have some debt left: "+(yearly_salary < new_principal));
        System.out.println("At the end of the year, you will have $"+(yearly_salary-new_principal)+" of your salary left");
        System.out.println();

        System.out.println("The government is offering loan relief for persons 25 and under, and for those 65 and over.");
        System.out.print("What is your age? ");
        Integer age=myScan.nextInt();
        Boolean eligible_for_relief=(age <= 25) || (age >= 65);
        System.out.println("The relief is $10000. You are eligible for the relief: "+eligible_for_relief);
        Boolean loan_paid_off=(yearly_salary >= new_principal) || (eligible_for_relief && ((yearly_salary + 10000) >= new_principal));
        System.out.println("With or without relief, you will be able to pay your loan in full: "+loan_paid_off);
        myScan.close();
        
    }
}
