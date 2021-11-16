package edu.cnm.deepdive;

import edu.cnm.deepdive.model.Card;
import edu.cnm.deepdive.model.Rank;
import edu.cnm.deepdive.model.Suit;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Trick {

  public static void main(String[] args) {
    Random rng = new SecureRandom();
    getDeck(rng);
    // TODO Create a shuffled deck.
    // TODO Sort the deck into 2 piles, according to the rules of the trick.
    // TODO Swap a random number of cards between the 2 piles.
    // TODO Sort the piles.
    // TODO Count & print  the pile contents.
  }

  private static List<Card> getDeck(Random rng) {
    List<Card> deck = new ArrayList<>();
    for (Suit suit : Suit.values()) {
      for (Rank rank : Rank.values()) {
        deck.add(new Card(rank, suit));
      }
    }
    Collections.shuffle(deck, rng);
    return deck;
  }

}
