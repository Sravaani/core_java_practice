import java.util.Scanner;
class Do{
  public static void main(String[] args)
  {
    int n;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println("Enter the number");
    do
      {
        switch(n){
          case 0: 
            for(int i=1; i<=10; i++)
              {
                if(i%2==0)
                {
                  System.out.println("Even");
                }
              }
            break;
          case 1: 
            for(int i=1; i<=10; i++)
              {
                if(i%2!==0)
                {
                  System.out.println("odd");
                }
              }
            break;

            
        }

      }
  }
}