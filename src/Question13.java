import java.util.Scanner;

public class Question13 {
	
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string you want to turn into a URL: ");
		String myString = input.nextLine();
		
		//System.out.println("Enter the length of the String: ");
		//int length = input.nextInt();
		
		char[] array = new char[myString.length()];
		int arrayIndex = 0;
		int i = 0;
		
		while(arrayIndex < array.length){
			
			if(myString.charAt(i) == 32){
				
				array[arrayIndex] = '%';
				array[arrayIndex+1] = '2';
				array[arrayIndex+2] = '0';
				arrayIndex = arrayIndex+3;
				i++;
				continue;
			}
			
			array[arrayIndex] = myString.charAt(i);
			i++;
			arrayIndex++;
		}
		
		String temp = new String(array);
		System.out.println(temp);
		
		
	}

}
