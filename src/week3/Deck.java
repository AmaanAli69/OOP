package week3;

import java.util.Random;

public class Deck {
    Card deck[] = new Card[52];
    String suits[] = {"Clubs","Hearts","Spades","Diamond"};
    String ranks[] = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

    Deck(){
        int counter = 0 ;
        for (int i = 0 ; i < 4 ; i++)
        {
            for (int j = 0 ; j< 13 ; j++)
            {
                deck[counter++] = new Card(suits[i],ranks[j]);
            }
        }
    }
    public String toString()
    {
        StringBuilder str = new StringBuilder();
        for(int i = 0 ; i < 52 ; i++)
        {
            str.append(deck[i] + "\n");
        }

        return str.toString();
    }

    public String shuffle()
    {

        for (int s = 0 ; s < 500 ; s++)
        {
            Random ran = new Random();
            int x = ran.nextInt(52);
            int y = ran.nextInt(52);
            Card temp = deck[x];
            deck[x] = deck[y];
            deck[y] = temp;
        }
        StringBuilder str1 = new StringBuilder();
        for(int i = 0 ; i < 52 ; i++)
        {
            str1.append(this.deck[i] + "\n");
        }

        return str1.toString();






    }

}
