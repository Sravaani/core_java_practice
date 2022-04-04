import java.util.Scanner;
 class Marks{
  public static void main(String[] args){
    int marks=0;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the marks");
    marks=s.nextInt();
    if((marks>=0) && (marks<=100))
    {
      System.out.println("Valid Marks");
    }
    else
    {
     System.out.println("inValid Marks"); 
    }
  }
}