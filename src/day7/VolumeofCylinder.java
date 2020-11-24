package day7;

import java.util.Scanner;

public class VolumeofCylinder {

	//Volume formula = PI*r*r*h
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("height of cylinder");
		double h = input.nextDouble();
		System.out.println("radius of cylinder");
		double r = input.nextDouble();
		final double PI= Math.PI;
		double volume = PI * r *r *h;
		System.out.println("Volume of  a cylinder is:" + volume);
		
		input.close();
		
      
		
	}

}
