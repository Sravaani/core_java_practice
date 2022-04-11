//Write a Java program to count number of digits in a number.
import java.util.Scanner;

class Countdigits
{
  public static void main(String args[])
  {
     int n, count=0;
    Scanner s = new Scanner(System.in);
     n = s.nextInt();
    System.out.println("Enter the number");
     while (n!= 0) 
     {
      n=n/10;
      count++;
    }
       System.out.println("Count the number of digits are: " +count);
    }
}