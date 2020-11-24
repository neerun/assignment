package day19;

public class Question37 {
  //  Find the sum of each row & column of a matrix.
	public static void main(String[] args) {

		int[][] arr = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr1= new int[][] { { 4, 5, 6 }, { 2, 7, 8 }, { 3, 1, 9 } };
        int row  = 3;
        int column = 3;
        int[][] result = new int[row][column];
	
        System.out.println("The result of arr & arr1 is:");
         for (int i=0; i < row; i++) {
        	 for (int j=0; j<column; j++) {
        		 result[i][j]= arr[i][j] + arr1[i][j];
        		 System.out.println(result[i][j] + " ");
        	 }
        	 System.out.println();
         }
	 
	

	}

}
