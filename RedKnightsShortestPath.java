/**
 * Problem Statement:
 * https://www.hackerrank.com/challenges/red-knights-shortest-path/problem?h_r=next-challenge&h_v=zen&isFullScreen=false
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RedKnightsShortestPath {

	// Complete the printShortestPath function below.
	static void printShortestPath(int n, int i_start, int j_start, int i_end, int j_end) {
		List<String> lower = new ArrayList<>();
		List<String> upper = new ArrayList<>();
		List<String> middle = new ArrayList<>();

		if ((((i_start - i_end) % 2) != 0) || ((Math.abs(i_start - i_end) / 2) - Math.abs(j_start - j_end)) % 2 != 0)
			System.out.println("Impossible");
		else {
			int count = 0;
			do {
				if (i_end < i_start) {
					if (j_end >= j_start) {
						i_start = i_start - 2;
						j_start = j_start + 1;
						count++;
						upper.add("UR ");
					} else if (j_end < j_start) {
						i_start = i_start - 2;
						j_start = j_start - 1;
						count++;
						upper.add("UL ");
					}
				} else if (i_end > i_start) {
					if (j_end >= j_start) {
						count++;
						i_start = i_start + 2;
						j_start = j_start + 1;
						lower.add("LR ");

					} else if (j_end < j_start) {
						count++;
						i_start = i_start + 2;
						j_start = j_start - 1;
						lower.add("LL ");
					}
				} else if (i_start == i_end) {
					if (j_end > j_start) {
						count++;
						j_start = j_start + 2;
						middle.add("R ");
					} else if (j_end < j_start) {
						count++;
						j_start = j_start - 2;
						middle.add("L ");
					}
				}
			} while (!((i_start == i_end) && (j_start == j_end)));
			Collections.sort(middle, Collections.reverseOrder());
			Collections.sort(lower, Collections.reverseOrder());
			Collections.sort(upper, Collections.reverseOrder());
			String output = "";
			for (String s : upper)
				output += s;
			for (String s : middle)
				output += s;
			for (String s : lower)
				output += s;

			System.out.println(count + "\n" + output.trim());
		}
		// Print the distance along with the sequence of moves.

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String[] i_startJ_start = scanner.nextLine().split(" ");

		int i_start = Integer.parseInt(i_startJ_start[0]);

		int j_start = Integer.parseInt(i_startJ_start[1]);

		int i_end = Integer.parseInt(i_startJ_start[2]);

		int j_end = Integer.parseInt(i_startJ_start[3]);

		printShortestPath(n, i_start, j_start, i_end, j_end);

		scanner.close();
	}
}
