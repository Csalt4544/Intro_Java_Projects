package com.company;

/**
 * This class is named DealerPlayer that extends
 * the abstract class Person and displays a block
 * of string text instructions.
 * @author Christian Saluta
 * @version 1.0
 */
public class DealerPlayer extends Person {
   public void instructions() {
      System.out.println("The dealer does not bet any money");
      System.out.println("Cards are drawn automatically until the hand reaches 17");
      System.out.println("If the dealer's hand goes over 21 or the player's hand is higher,");
      System.out.println("the player wins the round.");
      System.out.println("If the dealer's hand is exactly 21 or is higher than the player's hand,");
      System.out.println("the player loses and the dealer wins.");
   } // end instructions()
} // end DealerPlayer subclass
