package day7;

import java.util.Scanner;

public class AreaofRectangle {
     double width,height;
	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter width");
      double width = input.nextInt();
      System.out.println("Enter height");
      double height = input.nextDouble();
       double area = width * height;
       System.out.println("area of rectangle is" + area);
       input.close();
       
     

	}

}
