import java.util.Scanner;
/*
* This program calculates the area of a circle, rectangle and triangle
* @author Noorul Wasim Mansoor
* @version 11/7/2021 
*/

public class Geometry{

   //@param choice
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);

      System.out.println("Welcome to the Geometry Calculator Application");
      displayMenu();//displaying the different choices in the main method
      
      System.out.print("Enter you choice (1 - 3): ");
      int choice = scan.nextInt();
      
      
      while(choice < 1 || choice > 3){
         System.out.println("Invalid choice. Please enter (1 - 3): ");
         choice = scan.nextInt();
      }
      
      //making the select option method run in the main method using @param choice
      selectOption(choice);
      System.out.print("Goodbye!");
   }
   
   //@return area of Circle
   public static double circle(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter circle radius: ");
      double radius = scan.nextDouble();
      double circleArea = Math.PI * Math.pow(radius,2);
      return circleArea;
   }
   
   //@return area of Rectangle
   public static double rectangle(){ 
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter rectangle length: ");
      double length = scan.nextDouble();
      System.out.println("Enter rectangle width: ");
      double width = scan.nextDouble();
      double rectangleArea = length * width;
      return rectangleArea;
   }

   //@return area of triangle
   public static double triangle(){
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter triangle base: ");
      double base = scan.nextDouble();
      System.out.println("Enter triangle height: ");
      double height = scan.nextDouble();
      double triangleArea = (base * height) / 2;
      return triangleArea;
   }

   //@param area
   public static void printArea(double area){
      System.out.printf("Area: %.2f ", area);
   }


   //@param variable
   public static void selectOption(int choice){
      double area = 0;
      if(choice == 1){
         area = circle();
         printArea(area);
      }else if(choice == 2){
         area = rectangle();
         printArea(area);
      }else if(choice == 3){
         area = triangle();
         printArea(area);
      }
   }


   public static void displayMenu(){
   
      System.out.println("1. Calculate the Area of a Circle");
      System.out.println("2. Calculate the Area of a Rectangle");
      System.out.println("3. Calculate the Area of a Triangle");
      
   }
}