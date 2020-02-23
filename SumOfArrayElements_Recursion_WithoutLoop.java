//Use recursive instead of using loop - sum of element in array
public class SumOfArrayElements_Recursion_WithoutLoop {
	static int sumArray(int[] array, int n) {
		if (n == 0)
			return array[0];
		return array[n] + sumArray(array, n - 1);
	}

	public static void main(String[] args) {

		int sum = 0;
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println(sumArray(array, array.length - 1));
	}
}

