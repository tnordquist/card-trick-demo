package edu.cnm.deepdive;

import edu.cnm.deepdive.model.Card;
import edu.cnm.deepdive.model.Rank;
import edu.cnm.deepdive.model.Suit;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
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
  }

}