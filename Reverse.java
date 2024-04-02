/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){

		//Get input
		String input = args[0];

		String output = "";
		int i = input.length() - 1;

		//Reverse index for every letter in input
		while (i >= 0) {
			output += input.charAt(i);
			i--;
		}

		//Get the middle letter
		char middleChar = output.charAt(output.length()/2);

		//Print
		System.out.println(output);
		System.out.println("The middle character is " + middleChar);

	}
}