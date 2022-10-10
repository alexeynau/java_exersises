package ru.mirea.pr_7;

import java.util.LinkedList;
import java.util.Queue;

public class Game {
    private Queue<Card> firstDeck = new LinkedList<>();
    private Queue<Card> secondDeck = new LinkedList<>();

    public Game() {
    }

    public void addToFirst(Card card){
        firstDeck.add(card);
    }

    public void addToSecond(Card card){
        secondDeck.add(card);
    }

    public void emulate(){
        Card first;
        Card second;
        int i = 0;
        while (!(firstDeck.isEmpty()&secondDeck.isEmpty()) && (i < 106)) {
            first = firstDeck.poll();
            second = secondDeck.poll();
            if (first.getValue() > second.getValue() || first.getValue() == 0 && second.getValue() == 9) {
                firstDeck.add(first);
                firstDeck.add(second);
            } else if (first.getValue() < second.getValue() || first.getValue() == 9 && second.getValue() == 0) {
                secondDeck.add(first);
                secondDeck.add(second);
            }
            i++;
        }

        if (firstDeck.isEmpty())
            System.out.println("second " + i);
        if (secondDeck.isEmpty())
            System.out.println("first " + i);
        if (i <= 106)
            System.out.println("botva");
    }
}
