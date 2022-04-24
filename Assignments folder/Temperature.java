/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{
  public static void main(String[] args){
//Define the main method
//Declare the variables and initialize
int min=0;
    int i;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter n value");
    int size=s.nextInt();
    int arr[]=new int[size];
//Take temperature of 7 days as a input from user
for(i=0;i<size;i++)
{
 System.out.println("Enter the temperature of day :"+(i+1));
      arr[i]=s.nextInt();
      }
        min=arr[0];
//Calculate the lowest temperature
      for(i=0;i<size;i++)
      {
        if(arr[i]<min)
        {
         min=arr[i];
          }
        }
System.out.println("Lowest temperature of the week 3 is: " +(float)min+" celsisu");  
//Print the result
}
}
