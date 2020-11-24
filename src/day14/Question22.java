package day14;


 import java.util.Scanner;

public class Question22 {

	public static void main(String[] args) {
		
	
		Integer number , i;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to print mulitiplication table");
		number = input.nextInt();
		for (i = 1; i<=10; i++) {
		System.out.println(number +"*" + i+ "= " +( number *i));
		input.close();
	}
		

	}
}


