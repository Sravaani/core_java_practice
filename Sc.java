import java.util.Scanner;
class Sc
  {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number ");
      int n;
      n = sc.nextInt();
      switch(n)
        {
          case 1:
            System.out.println("print Monday");
            break;
            case 2:
            System.out.println("print Tuesday");
            break;
            case 3:
            System.out.println("print Wednesday");
            break;
            case 4:
            System.out.println("print Thursday");
            break;
            case 5:
            System.out.println("print Friday");
            break;
            case 6:
            System.out.println("print Saturday");
            break;
            case 7:
            System.out.println("print Sunday");
            break;
          default : 
              System.out.println("Invalid day");
        }
    }
  }