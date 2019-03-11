package edu.dmacc.codedsm.hw10;

import java.util.*;

public class CardDeck {
    public static void main(String[] args) {
        HashMap<String, List> myDeck = new HashMap<String, List>();
        ArrayList<Integer> cardsValues = new ArrayList<Integer>();
        for (int i = 1; i <= 13; i++) {
            cardsValues.add(i);
        }
        myDeck.put("Hearts", cardsValues);
        myDeck.put("Diamonds", cardsValues);
        myDeck.put("Spades", cardsValues);
        myDeck.put("Clubs", cardsValues);
        for (Map.Entry<String, List> suit : myDeck.entrySet()) {
            for (Object card : suit.getValue()) {
                System.out.println(suit.getKey() + " : " + card);
            }
        }
    }
}
