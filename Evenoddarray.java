//Write a Java program to count total number of even and odd elements in an array.
import java.util.Scanner;
class Evenoddarray 
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
  int counte=0, counto=0;
System.out.println("Enter the size of array");
 int size=s.nextInt();
  int a[]=new int[size];
  System.out.println("Enter the size of array");
   for(int i=0;i<size;i++)
   {
     a[i]=s.nextInt();
   }
  for(int i=0;i<size;i++)
  {
    if(a[i]%2==0)
            counte++;
         else
            counto++;
      }
      System.out.println("\nEven Number: " +counte);
      System.out.println("Odd Number: " +counto);
   }
}

  
  
