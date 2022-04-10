import java.util.Scanner;
class Percentage
{
  public static void main(String args[])
  {
    int p,c,b,m,cp;
    float per, total;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the marks");
    p= s.nextInt();
    c= s.nextInt();
    b= s.nextInt();
    m= s.nextInt();
    cp= s.nextInt();
    total=p+c+b+m+c;
     System.out.println("Total Marks: " + total);
    per=(total/500)*100;
    System.out.println("Marks Percentage: " + per);
    if(per>= 90){
      System.out.println("Grade A");
    }
    else if(per>= 80){
      System.out.println("Grade B");
    }
    else if(per>= 70){
      System.out.println("Grade C");
    }
    else if(per>= 60){
      System.out.println("Grade D");
    }
    else if(per>= 40){
      System.out.println("Grade E");
    }
    else if (per<= 40)
    {
      System.out.println("Grade F");
    }
    else{
      System.out.println("Fail");
    }
    }
}
    
