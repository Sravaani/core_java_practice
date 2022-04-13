//Write a Java program to count total number of duplicate elements in an array.
import java.util.Scanner;

class Duplicatearr
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the size of an array");
    int size=s.nextInt();
    int a[]=new int[size];
    System.out.println("Enter the values of an array");
    for(int i=0;i<size;i++)
    {
      a[i]=s.nextInt();
    }
    for(int i=0;i<size;i++)
    {
      for(int j =i+1; j<size; j++)
      {
        if(a[i] == a[j])
        {
          System.out.println("Duplicate element found " + a[j]);
        }
        }
      }
    }
}




   