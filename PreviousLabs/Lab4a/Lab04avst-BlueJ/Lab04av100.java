// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04av100
{
    public static void main(String[] args)
    {
     
        System.out.println("Lab04a, 100 Point Version\n");
        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        
        double numMonths = numYears*12; //calculates the number of months until you have to pay
        double rate = annualRate/(12*100); //converts the annual rate to monthly rate and from percent to a decimal value
        double power = Math.pow(1+rate, numMonths); //this is one part of the equation ((1+R)^N) to make things easier later
        double monthPay = ((rate*power)/(power-1))*principal; //calculates the monthly pay
        double totalPay = monthPay*numMonths; //calculates the total money being paid
        double totalInt = totalPay-principal; //calculates total interest paid
        
        double roundMonth = (double)(Math.round(monthPay*100))/100; //rounds each calculation to the nearest penny
        double roundPay = (double)(Math.round(totalPay*100))/100;
        double roundInt = (double)(Math.round(totalInt*100))/100;

        //prints out the given information above and the calculated/rounded monthly pay, total pay, and total interest
        System.out.println(monthPay*100);
        System.out.println((double)Math.round(monthPay*100));
        System.out.println();
        
        System.out.println("Principal: $" + principal);
        System.out.println("Annual Rate: " + annualRate + "%");
        System.out.println("Number of Years: " + numYears);
        System.out.println("Monthly Payment: $" + roundMonth);
        System.out.println("Total Payment: $" + roundPay);
        System.out.println("Total Interest: $" + roundInt);
        
        System.out.println();
    }
}

