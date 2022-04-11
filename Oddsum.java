//Write a Java program to find sum of all odd numbers between 1 to n.
import java.util.Scanner;

class Oddsum {
	public static void main(String[] args) 
	{
		int number, i, odd=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Enter Number : ");
		number = sc.nextInt();	
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2== 1)
			{
				odd= odd + i; 
			}
		}
		System.out.println("\n The Sum of odd Numbers upto " + number + "  =  " + odd);
	}
}