//Write a Java program to print all natural numbers in reverse (from n to 1)
import java.util.Scanner;
class Naturalrev
{
  public static void main(String args[])
  {
    int n;
    System.out.println("Enter a number to reverse");
    Scanner s = new Scanner(System.in);
    n=s.nextInt();
    while(n>=1){
      System.out.println("print reverse of numbers: " +n);
      n--;
    }
    }
}

