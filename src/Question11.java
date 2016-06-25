
import java.util.HashSet;
import java.util.Scanner;


public class Question11 {

	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Please enter a string: ");
		
		String theString = input.next();

		HashSet<String> set = new HashSet<String>();
		
		int i = 0;
		while(i < theString.length()){
			
			if(!set.contains(Character.toString(theString.charAt(i)))){
				
				set.add(Character.toString(theString.charAt(i)));
				i++;
				continue;
			}
			
			System.out.println("All of the values are not unique.");
			return;
			
		}
		
		System.out.println("All of the characters are unique.");
		
	}

}
