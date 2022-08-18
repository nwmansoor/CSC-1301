/*
* This program will calculate the total grade from the test, midterm and final exam entered.
* And determines which letter grade will the printed and whether that is a passing grade.
*
* @Author Wasim Mansoor
* @Version 10/12/2021
*/

import java.util.Scanner;// Scanner class

public class GradeAverage{
	public static void main(String[] args){
   //grade weights
		final double TEST_WEIGHT = 0.40;
		final double MIDTERM_WEIGHT = 0.25;
		final double FINALEXAM_WEIGHT = 0.35;
		
		Scanner scan = new Scanner(System.in); // needed for user input
		
		System.out.print("Enter Test score #1: ");
		double testOne = scan.nextDouble();
		System.out.print("Enter Test score #2: ");
		double testTwo = scan.nextDouble();
		System.out.print("Enter Test score #3: ");
		double testThree = scan.nextDouble();
      
		double testAvg = ((testOne + testTwo + testThree) / 3.0);
		
		System.out.print("Enter Midterm score: ");
		double midterm = scan.nextDouble(); //Midterm Score
		
		System.out.print("Enter Final Exam score: ");
		double finalExam = scan.nextDouble(); //Final Exam Score
      
      double gradeAvg = (testAvg * TEST_WEIGHT) + (midterm * MIDTERM_WEIGHT) + (finalExam * FINALEXAM_WEIGHT);
		
		char letterGrade = ' '; // The letter grade
      
      if(gradeAvg >= 90){
         letterGrade = 'A';
      }else if(gradeAvg <= 89 || gradeAvg >= 80){
         letterGrade = 'B';
      }else if(gradeAvg <= 79 || gradeAvg >= 70){
         letterGrade = 'C';
      }else if(gradeAvg <= 69 || gradeAvg >= 60){
         letterGrade = 'F';
      }else{
         letterGrade = 'D';
      }
      
      System.out.printf("\nGrade Average: %.2f\n", gradeAvg);
      System.out.println("Letter Grade: " + letterGrade);
      
      if(letterGrade == 'A' || letterGrade == 'B' || letterGrade == 'C'){
         System.out.println("Good job. You met the prerequiste for the next course.");
      }else{
         System.out.println("I'm sorry. You will have to repeat the course before advancing.");
      }
	
	}
}