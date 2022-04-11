import java.util.Scanner;

class Sal
{
public static void main(String[] args)
  {
 float salary, gs, hra, da;
 Scanner s=new Scanner(System.in);
// System.out.println("Enter the basic salary");
  salary = s.nextFloat();
 System.out.println("Enter hra salary");
 hra=s.nextFloat();
  System.out.println("Enter da for the employee");
    da=s.nextFloat();
  gs=salary+hra+da;
  hra = (hra/100)*salary;
  da = (da/100)*salary;
  System.out.println("Enter gross salary for the Employee" +gs);
  }
}


