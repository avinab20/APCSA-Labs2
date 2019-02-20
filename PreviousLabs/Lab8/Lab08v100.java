// Lab08v100.java
// The "Palindrome" Program
// This is the student starting file for Lab08.

import java.util.Scanner;

public class Lab08v100
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean notFinished = false;
        do
        {
            System.out.print("Enter a string  ===>>  ");
            String str = input.nextLine();
            System.out.println();
            System.out.println("Entered String:     " + str);
            System.out.println("Palindrome:         " + Palindrome.isPal(str));
            if (Palindrome.isPal(str) == false)
            {
                System.out.println("Almost Palindrome:  " + Palindrome.almostPal(str));
            }   
            else{
                System.out.println("Almost Palindrome: false");
            }   // used only for the 100 point version
            System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
            String repeat = input.nextLine();
            notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
            System.out.println();
        }
        while (notFinished);
    }
}

class Palindrome
{
    /*
     * Precondition:  letter is a String of one character.
     * Postcondition: The value of true is returned if s is a letter and false otherwise.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static boolean isLetter(String letter)
    {
        boolean result = false;
        if ((letter.compareTo("a") < 0) || (letter.compareTo("z") > 0)){ 
            result = false;
        }
        else { 
            result = true;
        }
        System.out.println(result + ": " + letter);
        return (result);      // This statement is provided to allow initial compiling.
    }

    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
     * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
     */

    public static boolean isPal(String s)
    {
        String word = s.toLowerCase();
        int length = word.length();
        boolean result = true;
        boolean test = true;

        for (int i=0; i<length; i++){
            String temp = word.substring(i,i+1);
            test = isLetter(temp);
            if (test == false){ 
                result = false;
                break;
            }
        }

        System.out.println(result);

        if (result == true){
            if (word.substring(0,1).equals(word.substring(length-1))){
                System.out.println("true");
                for (int i=1; i<length-1; i++){
                    System.out.println(word.substring(i,i+1)+ ", " + (word.substring(length-(i+1),length-i)));
                    if (word.substring(i,i+1).equals(word.substring(length-(i+1),length-i))){
                        result = true;
                    }
                    else{
                        result = false;
                        break;
                    }
                }
            }
        }
        
        System.out.println(result);
        return (result);      // This statement is provided to allow initial compiling.
    }

    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    private static String purge(String s)
    {
        String word = "";
        boolean test = true;

        for (int i=0; i<s.length(); i++){
            String temp = s.substring(i,i+1);
            test = isLetter(temp);
            if (test == true){ 
                word += temp;
            }
            else { 
                continue;
            }
        }
        return (word);        // This statement is provided to allow initial compiling.
    }

    /*
     * Precondition:  s is an arbitrary String.
     * Postcondition: After purging all non-letter characters from s,
     *                the value of true is returned if the resulting String is a Palindrome, false otherwise.
     * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
     */
    public static boolean almostPal(String s)
    {
        String original = s.toLowerCase();
        String word = purge(original);
        int length = word.length();
        boolean result = false;

        if (word.substring(0,0+1).equals(word.substring(length-1))){
            for (int i=1; i<length-1; i++){
                if (word.substring(i,i+1).equals(word.substring(length-(i+1),length-i))){
                    result = true;
                    length --;
                }
                else
                    result = false;
                break;
            }
        }
        else
            result = false;      // This statement is provided to allow initial compiling.

        return (result);
    }

}

