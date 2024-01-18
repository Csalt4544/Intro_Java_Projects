package com.company;

import java.util.Scanner;
// Public class and Java file name are Race
public class Race {

   public static void main(String[] args) {
      int randomNumber = 0;
      int trackLength = 0;
      StringBuffer tortoisePosition = new StringBuffer(" T");
      StringBuffer harePosition = new StringBuffer(" H");
      System.out.println("Welcome everyone to the Tortoise Vs. Hare Race Event.");
      System.out.println("Now audience, how long should the race be today?");
      Scanner input = new Scanner(System.in);
      trackLength = input.nextInt();
      System.out.println("The tortoise is at position 1");
      System.out.println("The hare is at position 1");
      System.out.println("The race will begin from the countdown at 3.");
      System.out.println("3...");
      System.out.println("2...");
      System.out.println("1...");
      System.out.println("AND THEY'RE OFF!!");
      // 10 is used so that highest random number is 10
      System.out.println(tortoisePosition);
      System.out.println(harePosition);
      while (tortoisePosition.length() < (trackLength) | harePosition.length() < (trackLength)) {
         randomNumber = (int) ((10 * Math.random()) + 1);
         if (randomNumber == 1) {
            tortoiseFastPlod(tortoisePosition);
            hareBigHop(harePosition);
         } else if (randomNumber == 2) {
            tortoiseFastPlod(tortoisePosition);
            hareBigHop(harePosition);
         } else if (randomNumber == 3) {
            tortoiseFastPlod(tortoisePosition);
            hareSmallHop(harePosition);
         } else if (randomNumber == 4) {
            tortoiseFastPlod(tortoisePosition);
            hareSmallHop(harePosition);
         } else if (randomNumber == 5) {
            tortoiseFastPlod(tortoisePosition);
            hareSmallHop(harePosition);
         } else if (randomNumber == 6) {
            tortoiseSlowPlod(tortoisePosition);
            hareBigSlip(harePosition);
         } else if (randomNumber == 7) {
            tortoiseSlowPlod(tortoisePosition);
            hareSmallSlip(harePosition);
         } else if (randomNumber == 8) {
            tortoiseSlowPlod(tortoisePosition);
            hareSmallSlip(harePosition);
         } else if (randomNumber == 9) {
            tortoiseSlip(tortoisePosition);
            System.out.println(harePosition);
         } else if (randomNumber == 10) {
            tortoiseSlip(tortoisePosition);
            System.out.println(harePosition);
         }
         if (tortoisePosition.length() == harePosition.length() & tortoisePosition.length() > 1) {
            System.out.println("OUCH!!");
         } else {
         }
         if (tortoisePosition.length() >= (trackLength) | harePosition.length() >= (trackLength)) {
            break;
         } else {
         }
      }
      if (tortoisePosition.length() > harePosition.length()) {
         System.out.println("TORTOISE WINS!!");
      } else if (harePosition.length() > tortoisePosition.length()) {
         System.out.println("HARE WINS!!");
      } else if (harePosition.length() == tortoisePosition.length()) {
         System.out.println("IT'S A TIE!!");
      }
   }
   // Parameter .length() > 1
   // Pre-condition: tortoisePosition is a StringBuffer
   // Post-condition: tortoisePosition returned is a StringBuffer
   public static StringBuffer tortoiseFastPlod(StringBuffer tortoisePosition) {
      tortoisePosition = tortoisePosition.replace(0, 0, "    ");
      System.out.println(tortoisePosition);
      return tortoisePosition;
   }
   // Parameter .length() > 1
   // Pre-condition: tortoisePosition is a StringBuffer
   // Post-condition: tortoisePosition returned is a StringBuffer
   public static StringBuffer tortoiseSlowPlod(StringBuffer tortoisePosition) {
      tortoisePosition = tortoisePosition.replace(0, 0, "  ");
      System.out.println(tortoisePosition);
      return tortoisePosition;
   }
   // Parameter .length() > 1
   // Pre-condition: tortoisePosition is a StringBuffer
   // Post-condition: tortoisePosition returned is a StringBuffer
   public static StringBuffer tortoiseSlip(StringBuffer tortoisePosition) {
      if (tortoisePosition.length() > 6) {
         tortoisePosition = tortoisePosition.delete(0, 5);
      } else {
      }
      System.out.println(tortoisePosition);
      return tortoisePosition;
   }
   // Parameter .length() > 1
   // Pre-condition: harePosition is a StringBuffer
   // Post-condition: harePosition returned is a StringBuffer
   public static StringBuffer hareBigHop(StringBuffer harePosition) {
      harePosition = harePosition.replace(0, 0, "             ");
      System.out.println(harePosition);
      return harePosition;
   }
   // Parameter .length() > 1
   // Pre-condition: harePosition is a StringBuffer
   // Post-condition: harePosition returned is a StringBuffer
   public static StringBuffer hareSmallHop(StringBuffer harePosition) {
      harePosition = harePosition.replace(0, 0, "  ");
      System.out.println(harePosition);
      return harePosition;
   }
   // Parameter .length() > 1
   // Pre-condition: harePosition is a StringBuffer
   // Post-condition: harePosition returned is a StringBuffer
   public static StringBuffer hareBigSlip(StringBuffer harePosition) {
      if (harePosition.length() > 12) {
         harePosition = harePosition.delete(0, 11);
      } else {
      }
      System.out.println(harePosition);
      return harePosition;
   }
   // Parameter .length() > 1
   // Pre-condition: harePosition is a StringBuffer
   // Post-condition: harePosition returned is a StringBuffer
   public static StringBuffer hareSmallSlip(StringBuffer harePosition) {
      if (harePosition.length() > 2) {
         harePosition = harePosition.delete(0, 1);
      } else {
      }
      System.out.println(harePosition);
      return harePosition;
   }
}
