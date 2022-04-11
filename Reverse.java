//Write a Java program to enter a number and print its reverse.

import java.util.Scanner;

 class Reverse {

	public static void main(String[] args) {
     int n=1423, rev=0;
    Scanner s=new Scanner(System.in);
      n=s.nextInt();
      while(n!= 0)   
             {  
            n=n%10;
            rev=rev*10+n;
               n=n/10;
 System.out.println("The reverse of the given number is: " + rev);  
}  
}
 }
  
