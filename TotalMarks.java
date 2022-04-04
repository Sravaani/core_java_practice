import java.util.Scanner;
class TotalMarks
{
public static void main(String[] args)
  {

 Scanner s=new Scanner(System.in);

 int s1,s2,s3;
  int total, avg;
System.out.println("Enter marks in 3 subjects");
s1=s.nextInt(); // reading int value
s2=s.nextInt();
s3=s.nextInt();
total=s1+s2+s3;
avg=total/3;
System.out.println("total marks in 3 subjects : "+total);
System.out.println("percentage of amount spent: "+avg);
}
}