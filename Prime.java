import java.util.Scanner;
class Prime{
  public static void main(String[] args)
  {
    int n=11;
    Scanner s=new Scanner(System.in);
    n=s.nextInt();
    System.out.println("Enter the number");
    do
      {
        System.out.println("Enter number to find prime numbers");
        System.out.println("Enter number to find strong  numbers");
        System.out.println("Enter number to perfect  numbers");
        System.out.println("Enter 0 for exit");
       System.out.println("Enter the number: ");
          n= obj.nextInt();
        switch(n){
          case 0: 
            for(int i=2; i<=n; i++)
              {
                if(n%i==0)
                {
                  System.out.println("not a prime");
                  }
                  break;
                  if(n%i!==0)  { System.out.println(" 
               prime number"); 
                    }  
  }
              
            
                
            