//Write a Java program to print all even numbers between 1 to 100
import java.util.Scanner;
class Evennumbers
{
  public static void main(String args[])
  {
    int i=2;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
   int n= s.nextInt();
    while(i<=n)
    {
      if(i%2==0)
      {
        System.out.println("Even numbers from t to n: " +i); 
        i=i+2;
      }
    }
    }
}