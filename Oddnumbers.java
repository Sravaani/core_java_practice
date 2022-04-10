// Write a Java program to print all odd number between 1 to 100.
import java.util.Scanner;
class Oddnumbers
{
  public static void main(String args[])
  {
    int i=1;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = s.nextInt();
    while(i<=n){
      if(i%2!=0){
        System.out.println("Odd numebers from 1 to n: "+ i);
        i=i+2;
      }
      }
    }
    }