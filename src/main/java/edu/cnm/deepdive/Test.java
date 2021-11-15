package edu.cnm.deepdive;

import edu.cnm.deepdive.model.Card;
import edu.cnm.deepdive.model.Rank;
import edu.cnm.deepdive.model.Suit;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

  public static void main(String[] args) {
    List<Card> deck = new ArrayList<>();
    for (Suit s : Suit.values()) {
      for (Rank r : Rank.values()) {
        Card c = new Card(r, s);
        deck.add(c);
      }
    }
    System.out.println(deck);
    Collections.shuffle(deck, new SecureRandom());
    System.out.println(deck);
    deck.sort(new WarComparator());
    System.out.println(deck);
  }

  private static class WarComparator implements Comparator<Card> {

    private final int numRanks = Rank.values().length;

    @Override
    public int compare(Card card1, Card card2) {
      return (card1.getRank().ordinal() + numRanks - 1) % numRanks
          - (card2.getRank().ordinal() + numRanks - 1) % numRanks;
    }
  }

}