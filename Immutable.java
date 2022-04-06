class Immutable
{
  public static void main(String args[]){

   String str1="Hi";
   String str2="Hello";
   String str3="Hi";

    String s1=new String("Hi");
   String s2=new String("Hello");
   String s3=new String("Hi");
    
    System.out.println(str1==str2);
    System.out.println(str1==str3);
    System.out.println(str2==str3);
    
    System.out.println(s1==s2);
    System.out.println(s1==s3);
    System.out.println(s2==s3);
  
    System.out.println(str1.equals(str2)); // flase
    System.out.println(str1.equals(str3));  // true
    System.out.println(str2.equals(str3));  // false

    System.out.println(s1.equals(s2)); // flase
    System.out.println(s1.equals(s3));  // true
    System.out.println(s2.equals(s3)); 
  }
}