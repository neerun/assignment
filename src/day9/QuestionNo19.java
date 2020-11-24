package day9;

import java.util.Scanner;

//6ix kind of triangle
//1.Scalene Triangle-No sides equal 
//2.Isosceles Triangle-Two sides equal
//3. Equilateral Triangle-Three sides equal
//4. Acute Triangle-all angle are less than 90 degree
//5. Obtuse Triangle-more than 90 degree
//6. Right Triangle- has a right angle 90 degree

public class QuestionNo19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter sidea");
		int sidea = input.nextInt();
		System.out.println("Enter sideb");
		int sideb = input.nextInt();
		System.out.println("Enter sidec");
		int sidec = input.nextInt();
		
		if (sidea==sideb && sideb==sidec) {
			
			System.out.println("This is equailateral triangle");
	}
	
		else if (sidea==sideb ||sideb==sidec || sidec==sidea) {
			System.out.println("This is Isosceles Triangle.");
		}
		
		else // if (sidea!=sideb && sideb!=sidec)  {
			System.out.println("This is Scalene Triangle");
		//}
		
		/*
		 * else { System.out.println("This is invalid triangle"); }
		 */
		input.close();

	}

}