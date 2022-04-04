//main class
import java.util.Scanner;
class Pnpgm
  {
    // main method
    public static void main(String[] args){
      // declare variables
      int num;
      // creating scanner object
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      // condition starts
      if (num>0){
        System.out.println("Number is a positive number");
      }
      else if (num<0){
        System.out.println("Number is a negative number");
      }
      else{
        System.out.println("number is zero");
      }
    }
  }