package com.company;

/**
 * This class is named StandardPlayer that extends
 * the abstract class Person and displays a block
 * of string text instructions.
 * @author Christian Saluta
 * @version 1.0
 */
public class StandardPlayer extends Person {
   public void instructions() {
      System.out.println("The standard player's objective is to reach " +
              "close to or exactly the amount of 21 in cards.");
      System.out.println("The game will start by drawing two cards for the player.");
      System.out.println("Type hit to draw a card from the deck.");
      System.out.println("Type stay if you would like to stop on the current number " +
              "of your hand");
      System.out.println("If your hand is higher than the dealer's hand at the end, you win");
      System.out.println("If you draw over 21, you lose the game.");
   } // end instructions()
} // end StandardPlayer subclass
