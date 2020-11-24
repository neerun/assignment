package day7;

import java.util.Scanner;

public class AreaofCircleRecatangleAndTrangle {

	public static void main(String[] args) {
	 double radius,area;
     Scanner input = new Scanner(System.in);
     System.out.println("enter the radius value of the circle");
      radius = input.nextDouble();
      input.close();
      
  area = Math.PI * radius * radius;
   System.out.println("area of  circle is"  + area);
    
     
     
		
     
     
		

	}

}
