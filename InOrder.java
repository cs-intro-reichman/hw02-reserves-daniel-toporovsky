/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {

		int random = 0;
		int previous = 0;
		boolean go = true;
	
		do {
			previous = random;
			random = (int)(Math.random() * 10);
			go = (previous <= random);
			if (go) System.out.print(random + " ");
		}

		while (go);
		System.out.println();
	}
	
}
