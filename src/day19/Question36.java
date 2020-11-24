package day19;

public class Question36 {
	// Write a function to find duplicate elements in an array.

	public static void main(String[] args) {

   int[]arr = {1, 2, 3, 6, 5, 7, 3, 5, };
   
   for(int i=0; i<arr.length; i++) {
	   for(int j = i+1;j <arr.length; j++) {
		   if(arr[i]==arr[j]) {
		   
		   System.out.println("The duplicate Element is:" + arr[j]);
	   }
	   
	   }
   }

	}

	}
