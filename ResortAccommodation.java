/*
*Calculates occupany rate using number of rooms and prints out Occupied rooms, Vacant rooms and Occupancy rate.
*@author Wasim Mansoor
*@version 10/27/2021
*/

import java.util.Scanner;//imported Scanner class, needed for user inputs
public class ResortAccommodation{
   public static void main(String [] args){
      
      Scanner scan = new Scanner(System.in);
      
      int totalNumRooms = 0 ;
      int totalNumOccupied = 0;
           
      System.out.print("How many floors does the resort have? ");
      int numFloors = scan.nextInt();
      
      //validates input
      while(numFloors < 1){
         System.out.print("Invalid. Enter 1 or more: ");
         numFloors = scan.nextInt();
      }
      
      for(int i = 0; i < numFloors; i++){
      
         System.out.print("How many rooms does floor " + (i + 1) + " have? ");
         int numRooms = scan.nextInt();
         
         //validates input
         while(numRooms < 10){
            System.out.print("Invalid. Enter 10 or more: ");
            numRooms = scan.nextInt();
         }
         
         totalNumRooms = totalNumRooms + numRooms;//Updating the total Number of Rooms
         
         System.out.print("How many rooms are occupied in floor " + (i + 1) + "? ");
         int occupiedRooms = scan.nextInt();
         
         //validates input
         while(numRooms < occupiedRooms){
            System.out.print("Invalid. Occupued rooms can't exceed number of rooms. Re-Enter: ");
            occupiedRooms = scan.nextInt();
         }
            
            totalNumOccupied = totalNumOccupied + occupiedRooms;//Updating the total Occupied Rooms
      }
             
         int totalVacant = totalNumRooms - totalNumOccupied;//Finding the number of vacant rooms
         double occupancyRate = ((double)totalNumOccupied / (double)totalNumRooms) * 100;//Calculating the percent occupied
         
         System.out.println("Number of rooms: " + totalNumRooms);
         System.out.println("Occupied rooms: " + totalNumOccupied);
         System.out.println("Vacant rooms: " + totalVacant);
         System.out.printf("Occupancy rate: %.2f", occupancyRate);
         System.out.print("%");
   }
}