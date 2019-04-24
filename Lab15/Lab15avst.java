// Lab15avst.java
// 02-28-15 by Leon Schram
// The "Odd Magic Square" Program
// This is the student, starting version of the Lab15 assignment.

import java.util.Scanner;
import java.text.DecimalFormat;

public class Lab15avst
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the odd# size of the Magic Square -->  ");
        int size = input.nextInt();
        MagicSquare magic = new MagicSquare(size);

        magic.computeMagicSquare();
        magic.displayMagicSquare();
        magic.checkRows();          // for 100 & 110 Point Version Only
        magic.checkColumns();        // for 100 & 110 Point Version Only
        magic.checkDiagonals();      // for 100 & 110 Point Version Only
    }
}

class MagicSquare
{
    private int size;
    private int magic[][];
    private DecimalFormat output;

    public MagicSquare(int s)
    {
        size = s;
        magic = new int[size][size];
        output = new DecimalFormat("000");
    }

    public void computeMagicSquare()
    {
        int r = 0;
        int c = size/2;
        magic[r][c] = 1;

        for (int i=2; i<=(size*size); i++){
            r--;
            c++;
            if (i%size==1){
                r+=2;
                c--;
            }
            if (r<0){
                r=size-1;
            }
            if (c>size-1){
                c=0;
            }
            magic[r][c] = i;
        }
    }

    public void displayMagicSquare()
    {
        System.out.println();
        System.out.println(size + "x" + size + " Magic Square");
        System.out.println("==================");

        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                format("000 ", magic[row][col]);
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void format(String pattern, int value ) {
        DecimalFormat temp = new DecimalFormat(pattern);
        String output = temp.format(value);
        System.out.print(output + " ");
    }

    public void checkRows()
    {
        System.out.println();
        System.out.println("Checking Rows");
        System.out.println("=============");
        System.out.println();
        
        int sum = 0;

        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                sum+=magic[row][col];
                if (col==size-1){
                    format("000 = ",magic[row][col]);
                }
                else{
                    format("000 + ", magic[row][col]);
                }

            }
           
            System.out.println(sum);
            sum = 0;

        }
    }

    public void checkColumns()
    {
        System.out.println();
        System.out.println("Checking Columns");
        System.out.println("================");
        System.out.println();
        
        int sum = 0;

        for (int col = 0; col < size; col++)
        {
            for (int row = 0; row < size; row++)
            {
                sum+=magic[row][col];
                if (col==size-1){
                    format("000 = ",magic[row][col]);
                }
                else{
                    format("000 + ", magic[row][col]);
                }

            }
           
            System.out.println(sum);
            sum = 0;

        }
    }

    public void checkDiagonals()
    {
        System.out.println();
        System.out.println("Checking Diagonals");
        System.out.println("==================");
        System.out.println();
        
        int sum = 0;
        String str = "";
        
        for (int i = 0; i < size; i++)
        {
                sum+=magic[i][i];
               if (i==size-1){
                    format("000 = ",magic[i][i]);
                }
                else{
                    format("000 + ", magic[i][i]);
                }

        }
        System.out.println(str + sum);
        sum = 0;
        str = "";
        
        for (int i = size-1; i >=0; i--)
        {
                sum+=magic[i][i];
                if (i==0){
                    format("000 = ",magic[i][i]);
                }
                else{
                    format("000 + ", magic[i][i]);
                }

        }
        System.out.println(str + sum);
    }

}

