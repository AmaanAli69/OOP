package week3;

public class Card {
    final String suit;
    final String rank;

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    Card(String suit , String rank){
        this.rank = rank;
        this.suit = suit;
    }
    public String toString()
    {
        return String.format("%s of %s",rank,suit);
    }


}
