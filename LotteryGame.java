/*
*This program lets you choose numbers for a lottery and tells you if win
*@author Noorul Wasim Mansoor
*@version 11/24/2021
*/

import java.util.Scanner;//needed for user inputs
import java.util.Arrays;//needed to use the different array methods

public class LotteryGame{
   static final int NUM_DIGITS = 5;
   
   //@param lotteryNums, userValues
   public static void main(String[] args){
      int lotteryNums[] = new int[NUM_DIGITS];
      int userValues[] = new int[NUM_DIGITS];
      int matchCount = 0;
      
      Scanner scan = new Scanner(System.in);
      
      greetUser();
      lotteryNums = getLotteryNums();
      userValues = getUserChoices();
      matchCount = findMatches(lotteryNums, userValues);
      
      System.out.print("\nLottery Numbers: ");
      for(int i = 0; i < NUM_DIGITS; i++){
         System.out.print(lotteryNums[i] + " ");
      }
      System.out.println("\nNumber of matching digits: " + matchCount);
      if(matchCount == NUM_DIGITS)
         System.out.println("GRAND PRIZE WINNER!");
      else
         System.out.println("Sorry, you didn't win");
         
   }
   //Greeting user
   public static void greetUser(){
      System.out.println("\n     Welcome to the Lottery game");
      System.out.println("You will pick 5 numbers (0 - 9) and we will");
      System.out.println("see if you are the Grand Prize Winner");
   }
   
   //Retrieving Lottery Numbers
   //@return lotteryNums
   public static int[] getLotteryNums(){
      int lotteryNums[] = new int[NUM_DIGITS];//Storing randomized nums
      for(int i = 0; i < NUM_DIGITS; i++){
         lotteryNums[i] = 0 + (int)(Math.random() *10);
      }
      Arrays.sort(lotteryNums);
      return lotteryNums;
   }
   
   //prompt to enter user choices
   //@return userChoice
   public static int[] getUserChoices(){
      int userChoice[] = new int[NUM_DIGITS];
      Scanner scan = new Scanner(System.in);
      
      for(int i = 0; i < NUM_DIGITS; i++){
         System.out.print("Enter pick " + (i + 1) + " (0 - 9): ");
         userChoice[i] = scan.nextInt();
         if(userChoice[i] < 0 || userChoice[i] > 9){
            System.out.println("ERROR. Please enter a number (0 - 9) ");
            i--;
         }  
      }
      return userChoice;
   }
   
   //@param lotteryNums and userChoice 
   //@return count
   public static int findMatches(int[] lotteryNums, int[] userChoice){
      int count = 0;
      for(int i = 0; i < NUM_DIGITS; i++){
         for(int j = 0; j < NUM_DIGITS; j++){
            if(userChoice[j] == lotteryNums[i]){
               count++;
               
            }
         }
      }
      return count;
   }
}