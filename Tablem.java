//Write a Java program to print multiplication table of any number.
import java.util.Scanner;

class Tablem
{
  public static void main(String args[])
  {
    int n;
    Scanner s = new Scanner(System.in);
     n = s.nextInt();
    System.out.println("Enter the number");
    for(int i=1;i<=10;i++){
    System.out.println("Multipliacation of any number: " + n*i);
    }
}
}
