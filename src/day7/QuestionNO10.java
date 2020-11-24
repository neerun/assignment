package day7;
// QUEASTION NO 10(A)
import java.util.Scanner;

public class QuestionNO10 {
public static void main(String[] args) {
Scanner	input = new Scanner(System.in);
System.out.println("Enter value of u");
double u = input.nextDouble();
System.out.println("Enter value of t");
double t = input.nextDouble();
System.out.println("Enter value of a");
double a = input.nextDouble();
double s =(u*t)+0.50*(a*Math.pow(t,2));
System.out.println("the total sum of s is:" +s);
input.close();

// QUESTION NO 10 (B)
Scanner kiran = new Scanner(System.in);
System.out.println("enter value of s");
double s1= kiran.nextDouble();
System.out.println("enter value of a");
double a1 =kiran.nextDouble();
System.out.println("enter value of b");
double b1= kiran.nextDouble();
System.out.println("enter value of c");
double c1 = kiran.nextDouble();
double s2= (a1+b1+c1)*2;
double area = Math.sqrt(s1*(s1-a1)*(s1-b1)*(s1-c1));
System.out.println("area is:" + area);
input.close();


}
}
