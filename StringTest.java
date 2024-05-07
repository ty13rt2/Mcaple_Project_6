/*
 * Class: CMSC201 
 * Instructor:Dr. Grinberg 
 * Description: Write test trails for four different string methods (length, charAt, subString, indexOf()
 * Due: 05/06/24
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Matthew Caple
*/

/**
 * @author Matthew Caple
 * 
 * Below is a simple program that create 4 methods one for each kind of string needed for this project
 * Each method contains some code that takes a string, uses the string method and returns the resutl
 */

public class StringTest{
	
	/**
	 * @param args
	 * The main method creates variables to give to methods and store return values.
	 * Main method also display return values to user
	 */
	public static void main(String[] args) {
	
		//length() - Finished
		//charAt() - Finished
		//substring - Finished
		//indexOf - Finished
						
		String text = "batman and joker";
		char letter = 'k';
		int numb = 5;
		int numb2 = 10;
		int display;
		display = len(text);
		System.out.print("\n");

		char display2;
		display2 = at(text, numb);
				
		System.out.print("\n");
		String display3;
		display3 = sub(text, numb, numb2);
				
		System.out.print("\n");
		int display4;
		display4 = dex(text,letter);
					
	}
	
	/**
	 * @param a string 
	 * @return an intger that repersent length of string
	 * Takes a string, gets the length of the string, stores in a variable and returns varaible
	 * 
	 */
	public static int len(String word) {
		int test = word.length();
		System.out.print(test);
		return test;
		
	}
	
	/**
	 * @param takes a string and a number to determine the chacter in the word
	 * Takes string and number, uses the number to find the chacter at the spefic location in the word
	 * Stores it in a variable and returns it 
	 * @return a char that repersents the letter choosen
	 */
	public static char at(String word, int n) {
		char test = word.charAt(n);
		System.out.print(test);
		return test;
		
	}
	/**
	 * @param string and two numbers. The two numbers mark the start and end of sub string
	 * Takes the word and uses the two numbers to obtain substring using substring() method
	 * Stores the substring in a variable and returns it
	 * @return a string that repersents the subString returned by subString() method
	 */
	public static String sub(String word,int n, int n2) {
		String test = word.substring(n, n2);
		System.out.print(test);
		return test;
	}
	
	/**
	 * @param takes a word and chacter 
	 * Uses the letter to find the element in the word that contains that letter. Store the value in an intger
	 * and returns it 
	 * @return an int that shows the element in the string that the spefic letter is located at
	 */
	public static int dex(String word, char letter) {
		int test = word.indexOf(letter);
		System.out.print(test);
		return test;
	}
}
