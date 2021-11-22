package edu.cnm.deepdive.model;

import java.util.Objects;

public class Card implements Comparable<Card>{

  private final Rank rank;
  private final Suit suit;
  private final int hash;
  private final String representation;

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
    hash = Objects.hash(rank, suit);
    representation = String.format("%s %s", rank.getSymbol(), suit.getSymbol());
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
    return representation;
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
      return hash; // return rank.hashCode() * 37 + suit.hashCode()
  }

  @Override
  public boolean equals(Object obj) {
    boolean eq = false;
    if(obj == this) {
      eq = true;
    } else if (obj instanceof Card){
      Card other = (Card) obj;
      eq = hash == other.hash
          && this.suit == other.suit
          && this.rank == other.rank;
    }
    return eq;
  }
}