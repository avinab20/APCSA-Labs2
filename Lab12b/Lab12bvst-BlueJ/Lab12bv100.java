// Lab12bv100.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.

import java.util.ArrayList;
public class Lab12bv100
{
    public static void main(String[] args)
    {   
        Deck deck = new Deck();
        System.out.println(deck);
    }
}

class Deck 
{
    private ArrayList<Card> cards;
    private int size;

    private String suit;
    private String rank;
    private int value;
    private String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    private int[] values = {2,3,4,5,6,7,8,9,10,11};

    public Deck() 
    {
        size = 52;
        cards = new ArrayList<Card>();

        int j = 0;

        for (int i=0; i<4; i++){
            for (int k=0; k<13; k++){
                j = k + (i*13);
                cards.add(new Card(suits[i],ranks[k],0));
                if (k<9)
                    cards.set(j, new Card(suits[i],ranks[k],values[k]));
                if (k>= 9 && k<12)
                    cards.set(j, new Card(suits[i],ranks[k],10));
                if (k==12)
                    cards.set(j, new Card(suits[i],ranks[k],11));
            }
        }

        shuffle();
    }  

    /*  private void shuffle(){
    Card temp;
    int index1;
    int index2;

    for (int i=0; i<1000; i++){
    index1 = (int)(Math.random()*51);
    index2 = (int)(Math.random()*51);
    temp = cards.get(index1);
    cards.set(index1, cards.get(index2));
    cards.set(index2,temp);
    }

    } */

    private void shuffle(){

        Card temp;
        int index1;
        int index2;

        for (int i=0; i<1000; i++){
            index1 = (int)(Math.random()*51);
            index2 = (int)(Math.random()*51);
            temp = cards.get(index1);
            cards.remove(index1);
            cards.add(index2,temp);
        }

    }

    public String toString()
    {

        String item = "";
        for (int i=0; i<size; i++){
            item += cards.get(i).toString() + "\n";
        } 
        return item;

    }
}

/* 
 * I didn't notice much of a difference with speed, but the second shuffle method does a much better job. Both methods cause suits to be somewhat
 * clumped together, but the second method does it much less. Doing each method 500 times vs 1000 times also makes a difference. Running through
 * the loop 1000 times definitely shuffled it much better.
 */
