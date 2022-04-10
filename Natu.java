// import Scanner class
import java.util.Scanner;
// main class
class Natu{
  // main method
  public static void main(String[] args){
    // declare and intailize variables
  int i=1;
    // scanner object 
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=s.nextInt();
    // while condition
    while(i<=n)
    {
      System.out.println(i);
      // increment of i
      i++;
    }
  } 
}