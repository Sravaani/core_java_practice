//Write a Java program to find maximum and minimum element in an array.
import java.util.Scanner;

class MaxMin
{

public static void main(String[] args) 
  {
// create Scanner class object to take input
Scanner s = new Scanner(System.in);
// read size of the array
System.out.print("Enter size of the array: ");
int n = s.nextInt();
// create an int array of size n
int a[] = new int[n];
// take input for the array
System.out.println("Enter array elements: ");
for (int i = 0; i < n; ++i) {
a[i] = s.nextInt();
}
int max=a[0];
int min=a[0];
    
for(int i=0;i<a.length;i++)
{
if(a[i]> max)
{
max=a[i];
}
else if(a[i]<min)
{
min=a[i];
}
}
  System.out.println("the max value is="+max);
  System.out.println("the max value is="+min); 
  }
  }

