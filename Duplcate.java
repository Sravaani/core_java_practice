// main class
class Duplicate 
{  
  // main method
    public static void main(String[] args) {   
      // intializing array values
    int a[]= new int[]{3,7,5,7,3,1};
      // printing the duplicat eelements
        System.out.println("Duplicate elements in given array: ");  
      // condition for checking the o index
        for(int i = 0; i < a.length; i++) {
          // condition for checking the 1 index
            for(int j = i + 1; j < a.length; j++) 
            {
                if(a[i] == a[j])  
                    System.out.println(a[j]);  
            }  
        }  
    }  
}  
