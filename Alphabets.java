//Write a Java program to print all alphabets from a to z
 class Alphabets {

	public static void main(String[] args) {

		char ch = 'A';
    
		System.out.print("upper Case alphabets Displayed");
    
		while (ch <= 'Z') 
    {
			System.out.print(ch+ " ");
			ch++;
		}

		System.out.print("\n");
    
     ch = 'a';
		System.out.print("Lower Case alphabets Displayed");
		while (ch <= 'z') {
			System.out.print(ch + " ");
			ch++;
		}
    }
 }