import java.util.Scanner;
class Evenn
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in); 
   int n=s.nextInt();
    int i, a=0;
    System.out.println("Enter number");
    for (i=1;i<=n;i++)
      {
        if(i%2==0)
        {
          a=a+i;
        }
        System.out.println("sum of even numbers: " +a);
      }
  
      }
}