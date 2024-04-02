/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {

		String input  = args[0];
		int checkIfPerfect = Integer.parseInt(input);
		String isPerfect = input + " is a perfect number since " + input + " = 1";
		int countSumDivisors = 1;

		int i = 2;
		while (i < checkIfPerfect) {
			if ((checkIfPerfect % i) == 0) {
				isPerfect += " + " + i;
				countSumDivisors += i;
			}
			i++; 
		}

		if (countSumDivisors == checkIfPerfect) System.out.println(isPerfect);
		else System.out.println(input + " is not a perfect number");
	}
}
