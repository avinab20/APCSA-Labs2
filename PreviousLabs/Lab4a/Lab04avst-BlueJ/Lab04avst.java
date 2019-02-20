// Lab04avst.java
// The Mortgage Payment Program
// This the student, starting version of the Lab04a assignment.


public class Lab04avst
{
    public static void main(String[] args)
    {
        System.out.println("Lab04a, 80 point Version\n");

        double principal  = 250000;
        double annualRate = 4.85;
        double numYears   = 30;
        
        double numMonths = numYears*12; //calculates the number of months until you have to pay
        double rate = annualRate/(12*100); //converts the annual rate to monthly rate and from percent to a decimal value
        double power = Math.pow(1+rate, numMonths); //this is one part of the equation ((1+R)^N) to make things easier later
        double monthPay = ((rate*power)/(power-1))*principal; //calculates the monthly pay



        //prints out the given information above and the calculates monthly pay
        System.out.println("Principal: $" + principal);
        System.out.println("Annual Rate: " + annualRate + "%");
        System.out.println("Number of Years: " + numYears);
        System.out.println("Monthly Payment: $" + monthPay);
    }
}

