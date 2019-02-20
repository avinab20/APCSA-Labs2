// Lab09avst.java
// The Rational Class Program I
// This is the student, starting version of the Lab09a assignment.

import java.util.Scanner;

public class Lab09avst
{
    private static int num, den;   // numerator and denominator of the rational number

    public static void main (String[] args)
    {
        enterData();
        Rational r = new Rational(num,den);
        r.displayData();
    }

    public static void enterData()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("\nEnter the numerator ----> ");
        num = input.nextInt();
        System.out.print("\nEnter the denominator --> ");
        den = input.nextInt();
    }
}


class Rational
{
    private int num;
    private int reducedNum;
    private int den;
    private int reducedDen;
    private int gcf;

    public Rational (int n1, int d2){
        num = n1;
        den = d2;
    }

    public int getNum(){
        return (num);
    }

    public int getDen(){
        return (den);
    }

    public double getDecimal(){
        return ((double)num/den);
    }

    public void displayData()
    {
        System.out.println();
        System.out.println(getNum() + "/" + getDen() + " equals " + getDecimal());
        System.out.println();
        System.out.println("and reduces to " + getReduced());
    }
    
    public String getReduced(){
        int factor = getGCF(num,den);
        reducedNum = num/factor;
        reducedDen = den/factor;
        return (reducedNum + "/" + reducedDen);
    }
    
    private int getGCF(int n1,int n2)
    {
        int rem = 0;
        do
        {
            rem = n1 % n2;
            if (rem == 0)
                gcf = n2;
            else
            {
                n1 = n2;
                n2 = rem;
            }
        }
        while (rem != 0);
        
        return (gcf);
    }
}




