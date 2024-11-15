// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int number = Integer.parseInt(args[0]);
		double sum = 0.0;
		double den = 1.0;

		for (int i = 1; number > 0; i = i + 2){
		sum = sum + den/i;
		den = (-1) * den;

		number --;

		}

		System.out.println("pi according to Java: 3.141592653589793");
		System.out.println("pi, approximated:    " + sum * 4);

	}
}
