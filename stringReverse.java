/****************************************************************************
 * Created by: Wendi Yu
 * Created on: Apr 2019
 * Created for: ICS4U
 * This program reverses a string for the user 
 * 
 ****************************************************************************/
import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		
		// main
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Enter a string to reverse: ");
		
		if(userInput.hasNextLine()) {
			String userText = userInput.nextLine();
			String reverse = reversString(userText);
			System.out.print("\nReversed string: " + reverse + "\n");
		}
		else {
			System.out.print("\nError\n");
		}
	}
	
	private static String reversString(String theSentence) {
		
		// this is a recursive procedure printing out the sentence backwards
		String textReversed = "";
		String theSentenceSubstring;
		char lastCharOfString;
		
		if(theSentence.length() > 0) {
			theSentenceSubstring = theSentence.substring(0,  theSentence.length() - 1);
			
			// write out the last character in the current variable
			lastCharOfString = theSentence.charAt(theSentence.length() - 1);
			
			// adds last character of current string to a variable
			// recursion - inputs substring of current string into method to get next character
			textReversed = lastCharOfString + reversString(theSentenceSubstring);
			
			return textReversed; 
		}
		else {
			return theSentence;
		}
	}
}
