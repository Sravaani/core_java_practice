//Write a Java program to count total number of negative elements in an array.
 import java.util.Scanner;
class Negativelem 
{
public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
  int count=0;
  System.out.println("Enter size of array");
  int size=s.nextInt();
  int a[]=new int[size];
  System.out.println("Enter array elements");
  {
    for(int i=0;i<size;i++){
      a[i]=s.nextInt();
    }
    for(int i=0;i<size;i++)
    {
      if(a[i]<0)//for negtaive
                 // a[i]>0 for positive
      {
        count++;
        }
      }
        System.out.println("negative elements:" +count);
      }
  }
    }
  
