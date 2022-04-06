class StringV{

  public static void main(String args[]){

    String str=" @ 1I 3Love$ 2programming& ";
     int countv=0, countd=0, countsc=0;
    for(int i=0;i<str.length();i++)
    {
      if(str.charAt(i)>='A' && str.charAt(i)<='Z' || str.charAt(i)>='a' && str.charAt(i)<='z'  ){
        countv++;
        }
     else if(str.charAt(i)>='0' && str.charAt(i)<='9'){
       countd++;
       }
      else if(str.charAt(i)!=' ')
      {
        countsc++;
        }
      }
        System.out.println("Number of vowels: "+countv);
        System.out.println("Number of vowels: "+countd);
        System.out.println("Number of vowels: "+countsc);
      }
    }
    