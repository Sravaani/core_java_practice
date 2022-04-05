import java.util.Scanner;
class Sumeven
{
public static void main(String args[])
{
int arr[]={12,44,14,84,15};
int o=0,e=0;
for(int i=0; i<5; i++){
if(arr[i]%2==0){
e=e+arr[i];
}
else{
o=o+arr[i];
}

}
System.out.println("sum of even is: "+e);
System.out.println("sum of odd is: "+o);
}

}