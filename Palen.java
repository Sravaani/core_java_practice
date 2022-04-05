import java.util.Scanner;
	class Palen
  {
    public static void main(String[] args)
    {
   int r, s=0, n=121;
   int temp=n;
      // scanner object creating
     Scanner sc=new Scanner(System.in); 
		System.out.print("Enter the value n : ");
		 n = sc.nextInt();
      while(n>0)
            {
        r=n%10;
        n=n/10;
        s=(s*10)+r;
      }
      if(temp==s)
      {
        System.out.println("Pallindrome");
      }
      else{
        System.out.println("Not a Pallindrome");
      }
      }
  }