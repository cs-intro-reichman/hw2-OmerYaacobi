// Demonstrates the Collatz conjecture.

import javax.print.DocFlavor.STRING;

public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code

		int numOfRepeats = Integer.parseInt(args[0]);
		String mode = (args[1]);
		
	

		if (mode.equals("v")){
			int row = 1;

			 while (row <= numOfRepeats) {
				int count1 = row;
				int count2 = 1;
				while (count1 != 1 || count2 ==1) {
					System.out.print(count1 +" ");
					if (count1%2 ==0){count1 =count1/2;}
					else {count1= count1*3 +1;}
					count2 ++;
				}
		System.out.print(count1);
		System.out.print(" ("+ count2+ ")");
		System.out.println("");
		row++;
			 }
			 System.out.println("Every one of the first "+ numOfRepeats+ " hailstone sequences reached 1.");
		}
		else {
			System.out.println("Every one of the first "+ numOfRepeats+ " hailstone sequences reached 1.");
		}
			
		}
	}