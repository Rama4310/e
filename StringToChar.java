// import scanner package
import java.util.Scanner;

// conver String type data into char type data
class StringToChar 
{
	public static void main(String[] args) 
	{
		// create scanner object to scan input from the user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter input: ");
		String str = scan.next();

		// finding the char value in Array format
		char [] character = tocharArray(str);
		
		//count the char length and print the output
		for(int i = 0; i < character.length; i++){
			System.out.print(character[i] + " ");
		}
	}

	// create method to convert a string to char
	public static char[] tocharArray (String str){
		char [] character = new char[str.length()];

		// loop statement count number of String alphabet
		for(int i = 0; i < str.length(); i++){
			character[i] = str.charAt(i);
		}

		// return in char
		return character;
	}
}
