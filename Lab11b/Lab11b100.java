// Lab11b100.java
// This is the Student starting version of the <Deck> class lab11b assignment. 

public class Lab11b100
{
    public static void main(String[] args)
    { 
        Deck deck = new Deck();
        System.out.println(deck);
        
    }
}

class Deck 
{
    private Card[] cards;
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
        cards = new Card[size];
        int j = 0;

        for (int i=0; i<4; i++){
            for (int k=0; k<13; k++){
                j = k + (i*13);
                cards[j] = new Card(suits[i],ranks[k],0);
                if (k<9)
                    cards[j].setValue(values[k]);
                if (k>= 9 && k<12)
                    cards[j].setValue(10);
                if (k==12)
                    cards[j].setValue(11);
            }
        }
        
        shuffle();
        
    }

    private void shuffle(){
        
        Card temp;
        int index1;
        int index2;
        
        for (int i=0; i<1000; i++){
            index1 = (int)(Math.random()*51);
            index2 = (int)(Math.random()*51);
            temp = cards[index1];
            cards[index1] = cards[index2];
            cards[index2] = temp; 
        }
        
    }
    
    public String toString()
    {
        
        String item = "";
        for (int i=0; i<size; i++){
            item += "[" + cards[i].getSuit() + ", " + cards[i].getRank() + ", " + cards[i].getValue() + "]\n";
        } 
        return item;
        
    }
}
