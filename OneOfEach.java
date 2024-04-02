
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		boolean g = false;
		boolean b = false;
		int childrenCount = 0;

		do {
			double random = Math.random();
			if (random < 0.5){
				g = true;
				System.out.print("g ");
			}
			else{
				b = true;
				System.out.print("b ");
			}

			childrenCount += 1;
		}
		while ((g && b) == false);

		System.out.println();
		System.out.print("You made it... and you now have " + childrenCount + " children.");


		//// Put your code here
	}
}
