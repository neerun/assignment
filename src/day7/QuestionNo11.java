    package day7;

    import java.util.Scanner;

    public class QuestionNo11 {

	public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter value of a");
    double a = input.nextDouble();
    System.out.println("Enter value of b");
    double b = input.nextDouble();
    
    System.out.println("Before swapping a is" + a);
    System.out.println("Before swappin b is" + b);
    
    double temp = a;
    a = b;
    b = temp;
    
    System.out.println("After swapping a is " + a);
    System.out.println("After swapping b is " + b);
    input.close();
    
    
    
	}

    }
