/* JFM1T5_Assignment 2:

   Write a program to store your 10 different expenses done in this month and print the highest price you incurred.
   Prompt the user for the 10 numbers to be input from the terminal.
   Sample Input:
   45.90
   23.56
   123
   23
   90.00
   344
   44
   60.01
   267
   100
   
   Expected Output:

   The highest price you incurred is 344.0

*/

import java.util.Scanner;

public class GroceryItems {
public static void main(String args[]){
//Define the main method

//Declare and initialize variables
    float size;
   Scanner s=new Scanner(System.in);
  System.out.println("Enter the size of an array:");
//Take the 10 different expenses price
  size=s.nextFloat(); // 5
float max=0;
float a[]=new float[10];
System.out.println("Enter the values of array" +size);
for (int i = 0; i < size; i++)
{
//Check the 10 different expenses price using for loop
     a[i]=s.nextFloat();
//Calculate the highest price in all expenses and check if the expenses is more than new item. If true then return max.
if(a[i]>max)
{ 
max=a[i]; 
}
}
//Print the result
  System.out.println("Max value : " +max);
}
}
