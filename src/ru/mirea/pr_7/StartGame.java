package ru.mirea.pr_7;

import java.util.Scanner;

public class StartGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Game game = new Game();

        for (int i = 0; i < 5; i++) {
            game.addToFirst(new Card(input.nextInt()));
        }
        for (int i = 0; i < 5; i++) {
            game.addToSecond(new Card(input.nextInt()));
        }

        game.emulate();
    }
}
