package com.company;

/**
 * This class is named RandomNumber that generates
 * a random number between 1 and 10 using the
 * Math.random() method.
 * @author Christian Saluta
 * @version 1.0
 */
public class RandomNumber {
   private int number = 0;

   public RandomNumber() {
      number = (number + (int) ((10 * Math.random()) + 1));
   } // end RandomNumber()

   public int getRandomNumber() {
      return number;
   } // end getRandomNumber()
} // end RandomNumber class
