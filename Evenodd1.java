import java.util.Scanner;
  // main class
class Evenodd1
{
  // main method
  public static void main(String[]args){
    // declare variables
    int num;
    // creating object using scanner
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your number");
    num= sc.nextInt();
    // if condition starts
    if(num%2==0)
       {
       // printing the number
       System.out.println("num is even");  
       }
    else{
      System.out.println("num is odd");
    }
  } 
}