class StringWR
  {
    public static void main(String[] args){
    String s="Hello Java program";
    String words[]=s.split(" ");
   System.out.println("number of words: "+words.length);
      for(int i=words.length-1;i>=0;i--){
        System.out.println(words[i]+" ");
      }
      }
  }