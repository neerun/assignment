package day7;

import java.util.Scanner;
// conversion from farhenheit to celcius
public class Javaclass8 {
public static void main(String[] args) {
Scanner	 input = new Scanner(System.in);


System.out.println("Enter the Temperature of Fahrenheit");
double f =input.nextDouble();
double c=(f-32)/1.8;


System.out.println("\nfahrenheit is: " + f);
System.out.println("\nCelcius is" + c);

// Conversion form celcius to farhenheit
System.out.println("Enter the Temperature of celcius");
 double c1 = input.nextDouble();
 
 double f1 = c1*1.8+32;
 System.out.println("Temperature form celcius to farhenheit is;" + f1);
 input.close();
}
}
