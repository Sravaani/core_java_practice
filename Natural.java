import java.util.Scanner;
	class Natural
  {
    public static void main(String[] args)
    {
   int i =1,sum=0;
      Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the value n : ");
		int n= Sc.nextInt();
		while(i<=n)
   {
			sum=sum+i;
       i++;
		}
      System.out.println(sum);
      }
  }