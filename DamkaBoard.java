/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		
		int input = Integer.parseInt(args[0]);

		for (int i = 0; i < input; i++){

			for (int j = 0; j < input; j++){
				if ((i % 2) == 0) System.out.print("* ");
				else System.out.print  (" *");
			}
			System.out.println();
		}
	}
}
