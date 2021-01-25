package com.hangman;

import java.util.Scanner;

public class Game {
    private String[] words = {"terminator", "banana", "computer", "cow", "rain", "water" };
    private StringBuilder word = new StringBuilder(words[(int) (Math.random() * words.length)]);
    private StringBuilder sb = new StringBuilder(new String(new char[word.length()]).replace("\0", "_"));
    private  int count = 0;

    Game() {
        sb.setCharAt(0, word.charAt(0));
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);
        boolean answer = false;
        String guess;
        System.out.println("Guess word");
        System.out.println(sb.toString() + " (" + word.length() + ")");
        while (count < 3) {
            guess = sc.next();
            answer = checkWord(guess);
            if (answer)
                break;
        }
        if (answer == false)
            System.out.println("Too many wrong answers, The word was: " + word);
    }
    private boolean checkWord(String guess) {
        if (guess.equals(word.toString())) {
            System.out.println("Correct! You win! The word was: " + word);
            return true;
        }
        System.out.println("Wrong answer");
        count++;
        if (word.length() > 4) {
            printOneLetter();
        }
        return false;
    }
    private void printOneLetter() {
        int letter = 0;
        boolean cantPrint = true;
        while (cantPrint) {
            letter = (int) (Math.random() * word.length());
            if (sb.charAt(letter) == '_')
                cantPrint = false;
        }
        sb.setCharAt(letter, word.charAt(letter));
        System.out.println(sb.toString());
    }
}
