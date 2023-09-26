package week3;

public class Game {
    Card Player1[] = new Card[13];
    Card Player2[] = new Card[13];
    Card Player3[] = new Card[13];
    Card Player4[] = new Card[13];

    public void distribute(Deck d)
    {

           int counter1 = 0;
           int counter2 = 0;
           int counter3 = 0;
           int counter4 = 0;
            for (int i = 51 ; i >= 0 ; i--)
            {
                if (i % 4 == 0)
                {
                    Player1[counter1++] = d.deck[i];
                }
                if (i % 4 == 1)
                {
                    Player2[counter2++] = d.deck[i];
                }
               if (i % 4 == 2)
                {
                    Player3[counter3++] = d.deck[i];
                }
               if (i % 4 == 3)
                {
                    Player4[counter4++] = d.deck[i];
                }

            }


    }
public String toString()
{
    StringBuilder str = new StringBuilder();
    str.append("Player 1 :- \n");
    for (int i = 0 ; i < 13 ; i++)
    {
        str.append(Player1[i] + "\n");
    }
    str.append("Player 2 :- \n");
    for (int i = 0 ; i < 13 ; i++)
          {
              str.append(Player2[i] + "\n");
          }
    str.append("Player 3 :- \n");
    for (int i = 0 ; i < 13 ; i++)
    {
        str.append(Player3[i] + "\n");
    }
    str.append("Player 4 :- \n");
    for (int i = 0 ; i < 13 ; i++)
    {
        str.append(Player4[i] + "\n");
    }
    return str.toString();
}

}
