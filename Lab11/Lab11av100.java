// Lab11av100.java
// The "Sieve of Eratosthenes" Program
// This is the student, starting version of the Lab11a assignment.

import java.util.Scanner;
import java.text.*;

public class Lab11av100
{
    public static void main(String[] args)
    {
        // This main method needs additions for the 100 point version.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the primes upper bound: ");
        final int MAX = input.nextInt();
        boolean primes[] = new boolean[MAX];
        computePrimes(primes);
        displayPrimes(primes);
    }

    public static void computePrimes(boolean primes[])
    {
        System.out.println("\nCOMPUTING PRIME NUMBERS");

        for (int i=2; i<primes.length; i++){
            primes[i] = true;
        }

        for (int i=2; i<primes.length; i++){
            if (primes[i] == true){
                for (int k=i+1; k<primes.length; k++){
                    if (k % i == 0)
                        primes[k] = false;
                } 
            }
        }

    }

    public static void format(String pattern, double value ) {
        DecimalFormat temp = new DecimalFormat(pattern);
        String output = temp.format(value);
        System.out.print(output + " ");
    }

    public static void displayPrimes(boolean primes[])
    {
        System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
        System.out.println();
        int count = 0;
        for (int i=2; i<primes.length; i++){
            if (primes[i] == true){
                format("0000", i);
                count++;
                if (count%12 == 0)
                    System.out.println();
            }
        }

    }

}

