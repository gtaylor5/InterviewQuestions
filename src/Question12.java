import java.util.Scanner;
import java.util.Arrays.*;


public class Question12 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 System.out.println("Enter a string: ");
		 String stringOne = input.next();
		 
		 System.out.println("Enter another string: ");
		 String stringTwo = input.next();
		 
		 if(stringOne.length() != stringTwo.length()){
			 
			 System.out.println("The two strings are not permutations");
			 return;
			 
		 }
		 
		 char[] arrayOne = stringOne.toCharArray();
		 java.util.Arrays.sort(arrayOne);
		 stringOne = arrayOne.toString();
		 String str1 = new String(arrayOne);
		 
		 char[] arrayTwo = stringTwo.toCharArray();
		 java.util.Arrays.sort(arrayTwo);
		 String str = new String(arrayTwo);
		 
		 boolean isPerm = str1.equals(str);
		 
		 if(isPerm){
			 
			 System.out.println("They are permutations!");
			 
		 }else{
			 
			 System.out.println("They are not permutations.");
			 
		 }
		
	}
	
	

}
