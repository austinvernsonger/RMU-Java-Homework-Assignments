package hr.fer.zemris.java.tecaj.hw1;

/**
 * This class demonstrates the Hofstadter Q-sequence number calculator. The
 * Hofstadter Q-sequence is a recursive sequence generated by the recurrence
 * equation: Q(n)=Q(n-Q(n-1))+Q(n-Q(n-2)), with Q(1)=Q(2)=1. The first few
 * values are 1, 1, 2, 3, 3, 4, 5, 5, 6, 6, ... The user specifies the index of
 * wanted number in the sequence as a single command line argument. The result
 * is shown to the user through standard output stream.
 * 
 * @author Petra
 *
 */
public class HofstadterQ {

	/**
	 * Definition of Hofstadter Q-sequence:
	 * http://paulbourke.net/fractals/qseries/
	 * 
	 * @param i
	 *            An index of wanted element in Hofstadter Q-sequence
	 * @return the element of the sequence with index i
	 */
	public static long Q(long i) {
		if (i < 3)
			return 1;
		else
			return Q(i - Q(i - 1)) + Q(i - Q(i - 2));
	}

	/**
	 * Demonstration of calculating the i-th Hofstadter Q-sequence number. Index
	 * i is provided by user.
	 * This method is called once the program is run.
	 * 
	 * @param args
	 *            Command line arguments.
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Invalid number of arguments.");
			System.exit(1);
		}

		long i = Long.parseLong(args[0]);
		if (i < 0L) {
			System.err
					.println("Invalid argument. Given argument must be positive.");
			System.exit(1);
		}
		System.out
				.println("You requested calculation of "
						+ i
						+ ". number of Hofstadter's Q-sequence. The requested number is "
						+ Q(i) + ".");
	}

}
