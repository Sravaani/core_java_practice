//Write a Java program to find first and last digit of a number.
import java.util.Scanner;
class Fln{
  public static void main(String args[])
  {
    int n, first, last;
      Scanner s=new Scanner(System.in);
    System.out.print("Enter a number");
    n= s.nextInt();
    first=n;
    while(first>= 10)
		{
			first= first/ 10;
		}	
		
		last = n % 10;
		
		System.out.println("\n The First Digit of a Number " + n + "  =  " + first);
		System.out.println("\n The Last Digit of a Number " + n+ "  =  " + last);
	}
}

