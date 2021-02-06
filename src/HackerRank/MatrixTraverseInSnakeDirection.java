package HackerRank;

import java.util.Scanner;

/**
	Traverse a matrix in snake direction
 */
public class MatrixTraverseInSnakeDirection {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the N value :");
		int n = new Scanner(System.in).nextInt();
		int k = 1-n;
		
		for(int i=0;i<n;i++){
			k+=n;
			for(int j=0;j<n;j++)
				System.out.print(((i%2==0)?(k++):(--k))+" ");
			System.out.println();
		}
		
	}
	
}


//OUTPUT:
/*
	Enter the N value :
	4
	1 2 3 4 
	8 7 6 5 
	9 10 11 12 
	16 15 14 13 
*/