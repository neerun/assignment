package day18;

public class Question35 {
	// Write a function to find the second largest number in a given array.
		public static void main(String[] args) {

			int[] arr = { 3, 6, 10, 8, 6, };
			int n = arr.length;

			int highest = Integer.MIN_VALUE;
			int secondHighest = Integer.MIN_VALUE;

			for (int i = 0; i < n; i++) {

				if (arr[i] > highest) {
					secondHighest = highest;
					highest = arr[i];
				}
				if (arr[i] < highest && arr[i] > secondHighest) {
					secondHighest = arr[i];
				}
			}

			System.out.print(" The second highest number is: "  + secondHighest);
		}
}
 