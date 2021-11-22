package edu.cnm.deepdive.model;

public class Card implements Comparable<Card>{

  private final Rank rank;
  private final Suit suit;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit()  {
    return suit;
  }

  @Override
  public String toString()
  {
    return String.format("%s %s", rank.getSymbol(), suit.getSymbol());
  }

  @Override
  public int compareTo(Card other) {
    int comparison = suit.compareTo(other.suit);
    if(comparison == 0) {
      comparison = rank.compareTo(other.rank);
    }
    return comparison;
  }

  @Override
  public int hashCode() {
      return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    boolean eq = false;
    if(obj == this) {
      eq = true;
    } else if (obj instanceof Card){
      Card other = (Card) obj;
      eq = this.suit == other.suit && this.rank == other.rank;
    }
    return eq;
  }
}