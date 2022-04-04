import java.util.Scanner;
	class Fac
  {
    public static void main(String[] args)
    {
   int f=1;
      Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value n : ");
		int n = sc.nextInt();
      while(n>=1)
      {
        f=n*f;
        n--;
      }
      System.out.println("Print value of factorial : " +f);
      }
  }

