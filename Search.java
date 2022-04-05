class Search{
 public static void main(String args[]){
 boolean a=false;
   int value=18;
int arr[]={23,78,45,12,23,23,12,90};

 for(int i=0;i<arr.length;i++)
 {
 if(value==arr[i])
 {
 a=true;
   }
   }
if(a){
System.out.println("yes value is there in array");
}
else{
  System.out.println("value is not there in array");
}
}
}
