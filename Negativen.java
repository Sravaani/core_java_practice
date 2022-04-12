//Write a Java program to print all negative elements in an array.
import java.util.Scanner;

class Negativen
{
public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    
    System.out.println("Enter the size of array");
    int size=s.nextInt();
     int neg[]=new int[size];
    System.out.println("Enter the array values");
     for(int i=0;i<size;i++)
     {
       neg[i]=s.nextInt();
       }
      for(int i=0;i<size;i++)
      {
        if(neg[i]<0)
        {
          System.out.println("negative numbers:" + " " +neg[i]);
      }
     }
    }
}
