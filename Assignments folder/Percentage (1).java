//JFM1T3_Assignment2:
/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 

  Sample Input:
        maximum_marks=500
        total_marks=348

  Expected Output:
        percentage= 70%
       

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class Percentage 
 {
//Define the main method
    public static void main(String args[])
  {
//Declare the variables
     double maximum_marks;
     double total_marks;
     double percentage;
//Use the scanner class to provide total_marks and maximum_marks at execution time
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the total marks");
    total_marks= s.nextInt();  //taking marks from user
    System.out.println("Enter max marks");
    maximum_marks=s.nextInt();
//Calculate the percentage of marks
    percentage = (total_marks/maximum_marks)*100; 
    int new_percentage = (int) Math.round(percentage); //converting double to percentage
//Print the Result
   System.out.println("Percent=" +new_percentage+"%");
  }
}
// Kindly submit your solution.

// Kindly work on the indentation.
