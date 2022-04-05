import java.util.Scanner;
class Sumar{
 public static void main(String args[]){
 Scanner s=new Scanner(System.in);
System.out.println("Enter N value (Array Size) :");
int n=s.nextInt(); // 5
int sum=0;
int arr[]=new int[n];
System.out.println("Enter "+n+" values");
   for(int i=0;i<n;i++)
     {
       arr[i]=s.nextInt();
       sum=sum+ arr[i];
     }
   System.out.println("Sum of array values: " +sum);
   }
}