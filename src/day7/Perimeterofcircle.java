package day7;

import java.util.Scanner;

public class Perimeterofcircle {

	public static void main(String[] args) {
 
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius of circle");
    double r = input.nextDouble();
    
     double prearea = Math.PI * r ;
     double area = 2 * prearea;
     area = 2 * Math.PI * r;
     
     System.out.println("The radius of circle" + area);
    input.close();
	}

}

