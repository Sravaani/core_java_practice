import java.util.Scanner;

class Calpabet
{
public static void main(String[] args){
  Scanner s=new Scanner(System.in);
    char c;
   System.out.println("Enter the character");
  c = s.next().charAt(0);   
  if(c>='a' && c<='z'||c>='A'&& c<='Z')
  {
    System.out.println("character is alphabet");
  }
  else{
    System.out.println("character is not alphabet");
  }
  }
}