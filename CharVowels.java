//Write a Java program to input any alphabet and check whether it is vowel or  consonant.//
import java.util.Scanner;

class CharVowel
{
public static void main(String[] args){
  char ch;
  Scanner s=new Scanner(System.in);
  ch=s.next().charAt(0);
  System.out.println("Enter the character");
  if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'&& 
    ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
  {
   System.out.println("Enter the character is a vowel");
  }
  else{
   System.out.println("Enter the character is a consonant");
  }
  }
}