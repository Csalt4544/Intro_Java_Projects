package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * The class is named BlackjackGameSimulator and contains
 * most of the program to run a game of Blackjack
 * @author Christian Saluta
 * @version 1.0
 */
public class BlackjackGameSimulator {

   public static void main(String[] args) {

      System.out.println("Hello, and welcome to this blackjack game simulator.");
      System.out.println("Would you like to begin a round of blackjack? Input yes to begin: ");
      Scanner input = new Scanner(System.in);
      String userPlayGame = input.nextLine();
      String yesResponse = ("yes");
      String noResponse = ("no");
      String stayResponse = ("stay");
      String hitResponse = ("hit");
      int playerBank = 500;


      while (userPlayGame.equals(yesResponse) & playerBank > 0) {

         StandardPlayer newPlayer = new StandardPlayer();
         DealerPlayer newDealer = new DealerPlayer();

         System.out.println("◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊");
         newDealer.instructions();
         System.out.println("\n");
         newPlayer.instructions();

         System.out.println("\n" + "The player's bank amount is " + playerBank);
         System.out.println("Input a bet amount between 0 and " + playerBank);
         int playerBet = input.nextInt();
         input.nextLine();

         int playerHand = 0;
         int dealerHand = 0;

         System.out.println("Dealing cards to the player.");

         int cardNumber1 = continueDrawingCard();
         if (cardNumber1 == 1) {
            System.out.println("An ace card was drawn.");
            System.out.println("Input a value of either 1 or 11: ");
            cardNumber1 = input.nextInt();
         } else {
         }
         int cardNumber2 = continueDrawingCard();
         if (cardNumber2 == 1) {
            System.out.println("An ace card was drawn.");
            System.out.println("Input a value of either 1 or 11: ");
            cardNumber2 = input.nextInt();
         } else {
         }
         playerHand = (cardNumber1 + cardNumber2);
         System.out.println("The starting player hand is " + playerHand);

         System.out.println("\n" + "Now dealing cards to dealer.");
         int cardNumber3 = continueDrawingCard();
         if (cardNumber3 == 1) {
            System.out.println("An ace card was drawn.");
            System.out.println("Input a value of either 1 or 11: ");
            cardNumber3 = input.nextInt();
         } else {
         }
         dealerHand = (cardNumber3);
         System.out.println("The starting dealer hand with first card is " + dealerHand);

         String playerHitOrStay = new String();

         while (playerHand < 21) {

            System.out.println("Would the player like to hit or stay?");
            playerHitOrStay = input.nextLine();
            if (playerHitOrStay.equals(hitResponse)) {
               int continuousCard = continueDrawingCard();
               if (continuousCard == 1) {
                  System.out.println("An ace card was drawn.");
                  System.out.println("Input a value of either 1 or 11: ");
                  continuousCard = input.nextInt();
               }
               playerHand = playerHand + continuousCard;
               System.out.println("Player's current hand is: " + playerHand);
            } else if (playerHitOrStay.equals(stayResponse)) {
               break;
            } else if (playerHand >= 21) {
               break;
            }
         }

         if (playerHand == 21) {
            displayWinMessage();
            calculateWinningBank(playerBank, playerBet);
         } else if (dealerHand < 17) {
            System.out.println("The dealer will now continue drawing until at least 17.");
            int cardNumber4 = continueDrawingCard();
            if (cardNumber4 == 1) {
               System.out.println("An ace card was drawn.");
               System.out.println("Input a value of either 1 or 11: ");
               cardNumber4 = input.nextInt();
            }
            dealerHand = dealerHand + cardNumber4;

            while (dealerHand < 17) {
               int continuousCard2 = continueDrawingCard();
               if (continuousCard2 == 1) {
                  System.out.println("An ace card was drawn.");
                  System.out.println("Input a value of either 1 or 11: ");
                  continuousCard2 = input.nextInt();
               }
               dealerHand = dealerHand + continuousCard2;
               System.out.println("Dealer's current hand is " + dealerHand);
            }
         }

         System.out.println("The dealer has stopped drawing cards." + "\n");

         // game results and calculations section
         if (dealerHand == 21) {
            displayLoseMessage();
            playerBank = calculateLosingBank(playerBank, playerBet);
            System.out.println("The player's current bank is now: " + playerBank);

         } else if (dealerHand > 21 & playerHand > 21) {
            displayTieMessage();
            System.out.println("The player's current bank is now: " + playerBank);

         } else if (dealerHand == playerHand) {
            displayTieMessage();
            System.out.println("The player's current bank is now: " + playerBank);

         } else if (dealerHand > 21 & playerHand < 21) {
            displayWinMessage();
            playerBank = calculateWinningBank(playerBank, playerBet);
            System.out.println("The player's current bank is now: " + playerBank);

         } else if (dealerHand < 21 & playerHand > 21) {
            displayLoseMessage();
            playerBank = calculateLosingBank(playerBank, playerBet);
            System.out.println("The player's current bank is now: " + playerBank);

         } else if (dealerHand > playerHand) {
            displayLoseMessage();
            playerBank = calculateLosingBank(playerBank, playerBet);
            System.out.println("The player's current bank is now: " + playerBank);
         } else if (playerHand > dealerHand) {
            displayWinMessage();
            playerBank = calculateWinningBank(playerBank, playerBet);
            System.out.println("The player's current bank is now: " + playerBank);
         }


         if (playerBank == 0) {
            System.out.println("Oh no, the player has run out of money.");
            break;
         }

         System.out.println("Would you like to play again? Input yes if so: ");
         userPlayGame = input.next();
      }
      System.out.println("The final player bank total is " + playerBank);
      System.out.println("Thanks for visiting, come back soon.");
      System.out.println("◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊◊");
   } // end main()

   /**
    * This method continueDrawingCard() creates an object from the class
    * RandomNumber.
    *
    * @return cardNumber is returned as an integer value based on the object created
    */
   public static int continueDrawingCard() {
      RandomNumber cardDrawn = new RandomNumber();
      int cardNumber = cardDrawn.getRandomNumber();

      System.out.println("The card drawn was " + cardNumber);

      return cardNumber;
   } // end continueDrawingCard()

   /**
    * This method calculateWinningBank() calculates the total for the player's bank
    * after conditions are met to win the game against the dealer
    *
    * @param playerBank is the amount that the player has in their bank
    * @param playerBet  is the bet to be added to the player's bank total
    * @return playerBank is returned to main()
    */
   public static int calculateWinningBank(int playerBank, int playerBet) {
      playerBank = (playerBank + playerBet);
      return playerBank;
   } // end calculateWinningBank()

   /**
    * This method calculateLosingBank calculates the total for the player's bank
    * after conditions are met to lose the game against the dealer
    *
    * @param playerBank is the amount that the player has in their bank
    * @param playerBet  is the bet to be subtracted from the player's bank total
    * @return playerBank is returned to main()
    */
   public static int calculateLosingBank(int playerBank, int playerBet) {
      playerBank = (playerBank - playerBet);
      return playerBank;
   } // end calculateLosingBank()

   /**
    * This method displayWinMessage() is used to display a short winning message
    */
   public static void displayWinMessage() {
      System.out.println("The player has won this round.");
   } // end displayWinMessage()

   /**
    * This method displayLoseMessage() is used to display a short losing message
    */
   public static void displayLoseMessage() {
      System.out.println("The dealer has won this round.");
   } // end displayLoseMessage()

   /**
    * This method displayTieMessage() is used to display a short tied game message
    */
   public static void displayTieMessage() {
      System.out.println("The player and the dealer have tied this round.");
   } // end displayTieMessage()
} // end BlackjackGameSimulator class
