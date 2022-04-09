import java.util.Scanner;

class Example5
{
public static void main(String[] args){
   int number;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number");
    number=s.nextInt();
  if((number % 5 == 0) && (number % 11 == 0))
		{
			System.out.println("\n Given number " + number + " is Divisible by 5 and 11"); 
		}
		else
		{
			System.out.println("\n Given number " + number + " is Not Divisible by 5 and 11"); 
		}	
	}
}
