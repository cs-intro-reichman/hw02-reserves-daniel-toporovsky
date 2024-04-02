/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int countFamiliesTwo = 0;
		int countFamiliesThree = 0;
		int countFamiliesMore = 0;
		double countChildrenAll = 0;
		
		for (int i = 0; i < T; i++){
			
			boolean g = false;
			boolean b = false;
			int countChildren = 0;

			//Playing Sims in java 
			do {
				double random = Math.random();
				if (random < 0.5)g = true;
				else b = true;
				countChildren += 1;
			}
			while ((g && b) == false);

			//Add to stats
			if (countChildren == 2) countFamiliesTwo += 1;
			if (countChildren == 3) countFamiliesThree += 1;
			else countFamiliesMore += 1;
			countChildrenAll += countChildren;
			
		}

		//
		double countChildrenAverage = (countChildrenAll / T);
		
		//Detects which option is mode
		String whoIsMode;
		int mode = Math.max(Math.max(countFamiliesTwo, countFamiliesThree), countFamiliesMore);
		if (mode == countFamiliesTwo) whoIsMode = "The most common number of children is 2.";
		else if (mode == countFamiliesThree) whoIsMode = "The most common number of children is 3.";
		else whoIsMode = "The most common number of children is 4 or more.";
		
		System.out.println("Average: " + countChildrenAverage + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + countFamiliesTwo);
		System.out.println("Number of families with 3 children: " + countFamiliesThree);
		System.out.println("Number of families with 4 or more children: " + countFamiliesMore);
		System.out.println(whoIsMode);

	}
}
