import java.util.Scanner;

class Leapyear
  {
  public static void main(String[] args){
   int year;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the Year");
    year=s.nextInt();
   if(year%4==0)
   {
     System.out.println("Given year is leap");
     }
    else if(year%400==0)
    {
      System.out.println("Given year is leap");
    }
    else if(year!=100)
    {
      System.out.println("Given year is not a leap");
    }
   }
  }