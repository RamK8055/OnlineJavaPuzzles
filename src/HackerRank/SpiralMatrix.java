package HackerRank;

/**
 * Problem Statement:
 * https://www.geeksforgeeks.org/print-a-given-matrix-in-spiral-form/
 */

import java.util.Scanner;

public class SpiralMatrix {
	public static void main(String[] args) {

		final Scanner scan = new Scanner(System.in);
		int r = scan.nextInt();
		int c = scan.nextInt();

		int[][] a = new int[r][c];
		int rs = 0;
		int cs = 0;
		int re = c - 1;
		int ce = r - 1;

		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				a[i][j] = scan.nextInt();

		int count = 0;
		while (count < (r * c)) {
			// Right travers
			for (int i = rs; i <= re; i++) {
				System.out.print(a[cs][i] + " ");
				count++;
			}
			cs++;

			// Down travers
			for (int i = cs; i <= ce; i++) {
				System.out.print(a[i][re] + " ");
				count++;
			}
			re--;

			// Left travers
			for (int i = re; i >= rs; i--) {
				System.out.print(a[ce][i] + " ");
				count++;
			}
			ce--;

			// Up travers
			for (int i = ce; i >= cs; i--) {
				System.out.print(a[i][rs] + " ");
				count++;
			}
			rs++;

		}
	}
}

/*
	3 4
	01 02 03 04
	10 11 12 05
	09 08 07 06
	1 2 3 4 5 6 7 8 9 10 11 12 11 -- bug
*/